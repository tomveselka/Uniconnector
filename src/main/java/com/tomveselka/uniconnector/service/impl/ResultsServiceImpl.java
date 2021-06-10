package com.tomveselka.uniconnector.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tomveselka.uniconnector.controllers.IsirController;
import com.tomveselka.uniconnector.dto.ResultSummaryDto;
import com.tomveselka.uniconnector.entity.ResultSummaryEntity;
import com.tomveselka.uniconnector.repository.ResultsRepository;
import com.tomveselka.uniconnector.service.ResultsService;
import com.tomveselka.uniconnector.utils.Utils;

@Service
public class ResultsServiceImpl implements ResultsService {

	@Autowired
	ResultsRepository repository;

	@Autowired
	Utils utils;

	Logger logger = LoggerFactory.getLogger(IsirController.class);

	@Override
	public void createRecord(ResultSummaryDto summaryDto) {
		ModelMapper modelMapper = new ModelMapper();
		ResultSummaryEntity entity = modelMapper.map(summaryDto, ResultSummaryEntity.class);
		entity.setRecordId(generateId());
		logger.info("Trying to store result:" + entity.toString());
		ResultSummaryEntity storedData = repository.save(entity);
		logger.info("Stored following result data:" + storedData.toString());
	}

	@Override
	public ResultSummaryDto getRecordByRecordId(String recordId) {
		ModelMapper modelMapper = new ModelMapper();
		ResultSummaryDto resultDto = new ResultSummaryDto();
		ResultSummaryEntity resultEntity = repository.findByRecordId(recordId);
		if (resultEntity != null) {
			resultDto = modelMapper.map(resultEntity, ResultSummaryDto.class);
		}
		return resultDto;
	}

	private String generateId() {
		String id = utils.generateId(20);
		ResultSummaryEntity entity = repository.findByRecordId(id);
		if (entity == null) {
			return id;
		} else {
			generateId();
		}
		return id;
	}

	@Override
	public List<ResultSummaryDto> getAllRecords(int page, int limit) {
		List<ResultSummaryDto> resultsList = new ArrayList<ResultSummaryDto>();
		if (page > 0) {
			page--;
		}
		Pageable pageable = PageRequest.of(page, limit);
		Page<ResultSummaryEntity> recordsPage = repository.findAll(pageable);
		List<ResultSummaryEntity> records = recordsPage.getContent();
		if (records.size() > 0) {
			for (ResultSummaryEntity record : records) {
				ModelMapper modelMapper = new ModelMapper();
				ResultSummaryDto summaryDto = modelMapper.map(record, ResultSummaryDto.class);
				resultsList.add(summaryDto);
			}
		}
		return resultsList;
	}

	@Override
	public List<ResultSummaryDto> getRecordsByIdentifier(String identifier, int page, int limit) {
		List<ResultSummaryDto> resultsList = new ArrayList<ResultSummaryDto>();
		if (page > 0) {
			page--;
		}
		Pageable pageable = PageRequest.of(page, limit);
		Page<ResultSummaryEntity> recordsPage = new PageImpl<>(repository.findByIdentifierNumber(identifier));
		List<ResultSummaryEntity> records = recordsPage.getContent();
		if (records.size() > 0) {
			for (ResultSummaryEntity record : records) {
				ModelMapper modelMapper = new ModelMapper();
				ResultSummaryDto summaryDto = modelMapper.map(record, ResultSummaryDto.class);
				resultsList.add(summaryDto);
			}
		}
		return resultsList;
	}

}

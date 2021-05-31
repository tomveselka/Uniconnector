package com.tomveselka.uniconnector.service.impl;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomveselka.uniconnector.controllers.IsirController;
import com.tomveselka.uniconnector.dto.ResultSummaryDto;
import com.tomveselka.uniconnector.entity.ResultSummaryEntity;
import com.tomveselka.uniconnector.repository.ResultsRepository;
import com.tomveselka.uniconnector.service.ResultsService;

@Service
public class ResultsServiceImpl implements ResultsService{

	@Autowired
	ResultsRepository repository;
	
	 Logger logger = LoggerFactory.getLogger(IsirController.class);
	 
	@Override
	public void createRecord(ResultSummaryDto summaryDto) {
		ModelMapper modelMapper = new ModelMapper();
		ResultSummaryEntity entity=modelMapper.map(summaryDto, ResultSummaryEntity.class);
		logger.info("Trying to store result:"+entity.toString());
		ResultSummaryEntity storedData=repository.save(entity);
		logger.info("Stored following result data:"+ storedData.toString());
	}
}

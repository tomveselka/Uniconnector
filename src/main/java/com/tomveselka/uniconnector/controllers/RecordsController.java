package com.tomveselka.uniconnector.controllers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tomveselka.uniconnector.dto.ResultSummaryDto;
import com.tomveselka.uniconnector.entity.ResultSummaryEntity;
import com.tomveselka.uniconnector.repository.ResultsRepository;
import com.tomveselka.uniconnector.service.ResultsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("records")
@Api(tags = "Records of results", value = "Records of results")
public class RecordsController {

	@Autowired
	ResultsRepository repository;

	@Autowired
	ResultsService resultService;

	@ApiOperation(value = "${records.byRecordId.value}")
	@GetMapping(path = "/getByRecordId/{recordID}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResultSummaryDto getRecordByRecordId(@PathVariable String recordID) {

		ResultSummaryDto summaryDto = resultService.getRecordByRecordId(recordID);
		return summaryDto;
	}

	@ApiOperation(value = "${records.byIdentifier.value}")
	@GetMapping(path = "/getByIdentifier/{identifier}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<ResultSummaryDto> getRecordsByIdentifier(@PathVariable String identifier,
			@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "20") int limit) {
		List<ResultSummaryDto> resultsList = resultService.getRecordsByIdentifier(identifier, page, limit);
		return resultsList;
	}

	@ApiOperation(value = "${records.all.value}")
	@GetMapping(path = "/getAll", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<ResultSummaryDto> getAllRecords(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "20") int limit) {
		List<ResultSummaryDto> allRecordsList = resultService.getAllRecords(page, limit);
		return allRecordsList;
	}
}

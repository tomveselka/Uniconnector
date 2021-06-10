package com.tomveselka.uniconnector.service;

import java.util.List;

import com.tomveselka.uniconnector.dto.ResultSummaryDto;

public interface ResultsService {

	void createRecord(ResultSummaryDto summaryDto);
	ResultSummaryDto getRecordByRecordId(String recordId);
	List<ResultSummaryDto> getAllRecords(int page, int limit);
	List<ResultSummaryDto> getRecordsByIdentifier(String identifier, int page, int limit);
}

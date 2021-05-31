package com.tomveselka.uniconnector.service.impl;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import com.tomveselka.uniconnector.dto.ResultSummaryDto;
import com.tomveselka.uniconnector.httpRequests.StolenDocumentsRequest;
import com.tomveselka.uniconnector.service.ResultsService;
import com.tomveselka.uniconnector.service.StolenDocuments;
import com.tomveselka.uniconnector.xmlParsers.ParseStolenDocumentsXml;

@Service
public class StolenDocumentsImpl implements StolenDocuments{
	@Autowired
	StolenDocumentsRequest request;
	@Autowired
	ParseStolenDocumentsXml parsers;
	@Autowired
	ResultsService resultService;
	

	public String verifyOneDocument(String number, String type){
		String result;
		try {
			result = parsers.parseResponse(request.checkStolenDocumentsDatabase(number, type));
		} catch (SAXException | IOException | ParserConfigurationException | URISyntaxException
				| InterruptedException e) {
			result =  "error";
		} 
		ResultSummaryDto summaryDto=new ResultSummaryDto(number, type, result, "DOCS", java.time.LocalDateTime.now(), null);
		resultService.createRecord(summaryDto);
		return result;
	}
	
}

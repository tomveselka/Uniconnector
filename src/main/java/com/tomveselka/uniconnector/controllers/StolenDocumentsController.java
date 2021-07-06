package com.tomveselka.uniconnector.controllers;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import com.tomveselka.uniconnector.httpRequests.StolenDocumentsRequest;
import com.tomveselka.uniconnector.listsProcessing.StolenDocumentsListProcessing;
import com.tomveselka.uniconnector.requestModels.FullRequestModelMain;
import com.tomveselka.uniconnector.responseModels.DocumentVerificationFullResponseMain;
import com.tomveselka.uniconnector.responseModels.DocumentVerificationSingleResponseModel;
import com.tomveselka.uniconnector.service.StolenDocuments;
import com.tomveselka.uniconnector.xmlParsers.ParseStolenDocumentsXml;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("stolendocuments")
@Api(tags="Stolen documents", value="Stolen documents")
public class StolenDocumentsController {

	@Autowired
	StolenDocumentsRequest httpRequest;
	
	@Autowired
	ParseStolenDocumentsXml parser;
	
	@Autowired
	StolenDocumentsListProcessing processingService;
	
	@Autowired
	StolenDocuments stolendDocumentsService;
	
	Logger logger = LoggerFactory.getLogger(IsirController.class);
	
	@ApiOperation(value= "${stolenDocuments.full.value}")
	@GetMapping(path = "/full/{documentNumber}/{documentType}", produces = {MediaType.APPLICATION_JSON_VALUE })
	public DocumentVerificationSingleResponseModel checkDocumentFullAnswer(@PathVariable String documentNumber, @PathVariable String documentType) {
		DocumentVerificationSingleResponseModel resultModel = new DocumentVerificationSingleResponseModel();
		logger.info("Called simple check of one document with input param type {}, number {}", documentType, documentNumber);
		String result=stolendDocumentsService.verifyOneDocument(documentNumber, documentType);
		logger.info("Result of check with input param type {}, number {} - result: {}", documentType, documentNumber, result);
		resultModel.setDateTimeOfVerification((java.time.LocalDateTime.now()).toString());
		resultModel.setNumber(documentNumber);
		resultModel.setType(documentType);
		resultModel.setFound(result);
		return resultModel;
	}
	
	@ApiOperation(value= "${stolenDocuments.short.value}")
	@GetMapping(path = "/short/{documentNumber}/{documentType}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String checkDocumentShortAnswer(@PathVariable String documentNumber, @PathVariable String documentType){
		logger.info("Called simple check of one document with input param type {}, number {}", documentType, documentNumber);
		String result=stolendDocumentsService.verifyOneDocument(documentNumber, documentType);
		logger.info("Result of check with input param type {}, number {} - result: {}", documentType, documentNumber, result);
		return result;
	}
	
	@ApiOperation(value= "${stolenDocuments.full.mutliple.value}")
	@PostMapping(path = "/all", produces = { MediaType.APPLICATION_JSON_VALUE })
	public DocumentVerificationFullResponseMain checkDocumentMultiple(@RequestBody FullRequestModelMain requestBody) {
		DocumentVerificationFullResponseMain result = new DocumentVerificationFullResponseMain();
		result=processingService.processRequestFullList(requestBody);
		return result;
	}


}

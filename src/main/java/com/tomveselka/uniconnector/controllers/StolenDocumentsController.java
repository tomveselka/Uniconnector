package com.tomveselka.uniconnector.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomveselka.uniconnector.response.DocumentVerificationResponseModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/stolendocuments")
@Api(tags="Stolen documents", value="Stolen documents")
public class StolenDocumentsController {

	@ApiOperation(value= "${stolenDocuments.full.value}")
	@GetMapping(path = "/full/{number}/{type}", produces = {MediaType.APPLICATION_JSON_VALUE })
	public DocumentVerificationResponseModel checkDocumentFullAnswer(@PathVariable String documentNumber, @PathVariable String documentType) {
		
		
		return null;
	}
	
	@ApiOperation(value= "${stolenDocuments.short.value}")
	@GetMapping(path = "/short/{number}/{type}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public DocumentVerificationResponseModel checkDocumentShortAnswer(@PathVariable String documentNumber, @PathVariable String documentType) {
		
		
		return null;
	}


}

package com.tomveselka.uniconnector.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomveselka.uniconnector.response.DocumentVerificationResponseModel;

@RestController
@RequestMapping("/stolendocuments")
public class StolenDocumentsController {

	@GetMapping(path = "/{number}/{type}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public DocumentVerificationResponseModel checkDocument(@PathVariable String documentNumber, @PathVariable String documentType) {
		
		
		return null;
	}


}

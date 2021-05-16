package com.tomveselka.uniconnector.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomveselka.uniconnector.httpRequests.IsirRequests;
import com.tomveselka.uniconnector.listsProcessing.IsirListProcessing;
import com.tomveselka.uniconnector.request.IsirVerificationFullResponseRequestModel;
import com.tomveselka.uniconnector.response.DocumentVerificationResponseModel;
import com.tomveselka.uniconnector.response.IsirVerificationFullResponse;
import com.tomveselka.uniconnector.service.IsirService;

//https://isir.justice.cz/isir/common/stat.do?kodStranky=SLEDOVANIWS
@RestController
@RequestMapping("isir")
public class IsirController {

	@Autowired
	IsirRequests isirRequests;
	
	@Autowired
	IsirService isirServices;
	
	@Autowired
	IsirListProcessing listProcessing;

	//to fix or delete or something
	@GetMapping(path = "/full/{input}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public DocumentVerificationResponseModel oneCheck(@PathVariable String birthNumber) {
		
		DocumentVerificationResponseModel responseModel=new DocumentVerificationResponseModel();
		responseModel.setNumber("12345");
		responseModel.setResult("OK");
		return responseModel;
	}
	
	@GetMapping(path = "/simple/{input}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public String oneCheckSimple(@PathVariable String input) {
		if (input.replace("/", "").length()>8) {
			return isirServices.simpleAnswer(isirRequests.checkBirthNumber(input));
		}else {
			return isirServices.simpleAnswer(isirRequests.checkIco(input));
		}		
	}
	
	@GetMapping(path = "/all", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public IsirVerificationFullResponse fullCheck(@RequestBody IsirVerificationFullResponseRequestModel request) {
		
		return listProcessing.processRequestFullList(request);
	}

}


package com.tomveselka.uniconnector.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomveselka.uniconnector.responseModels.AresVerificationFullResponse;
import com.tomveselka.uniconnector.service.AresService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
//https://stackoverflow.com/questions/2857081/how-can-i-tell-jaxb-maven-to-generate-multiple-schema-packages
@RestController
@RequestMapping("ares")
@Api(tags="ARES", value="ARES")
public class AresController {

	@Autowired
	AresService aresService;
	
    @ApiOperation(value= "${isir.full.value}")
	@GetMapping(path = "/full/{ico}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public AresVerificationFullResponse oneCheckStandard(@PathVariable String ico) {
    	AresVerificationFullResponse fullResponse= new AresVerificationFullResponse();
    	fullResponse=aresService.fullAnswer(ico);
    	return fullResponse;
	}
}

package com.tomveselka.uniconnector.controllers;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomveselka.uniconnector.httpRequests.IsirRequests;
import com.tomveselka.uniconnector.isirWsdlClasses.GetIsirWsCuzkDataResponse;
import com.tomveselka.uniconnector.listsProcessing.IsirListProcessing;
import com.tomveselka.uniconnector.requestModels.FullRequestModelMain;
import com.tomveselka.uniconnector.responseModels.IsirVerificationFullResponseMain;
import com.tomveselka.uniconnector.responseModels.IsirVerificationSingleResponseModelUniversal;
import com.tomveselka.uniconnector.service.IsirService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

//https://isir.justice.cz/isir/common/stat.do?kodStranky=SLEDOVANIWS
@RestController
@RequestMapping("isir")
@Api(tags="ISIR verification", value="ISIR verification")
public class IsirController {

	@Autowired
	IsirRequests isirRequests;
	
	@Autowired
	IsirService isirServices;
	
	@Autowired
	IsirListProcessing listProcessing;

    Logger logger = LoggerFactory.getLogger(IsirController.class);

	//to fix or delete or something
    @ApiOperation(value= "${isir.full.value}")
	@GetMapping(path = "/full/{input}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public IsirVerificationSingleResponseModelUniversal oneCheck(@PathVariable String input) {
		IsirVerificationSingleResponseModelUniversal responseModel=new IsirVerificationSingleResponseModelUniversal();
		ModelMapper modelMapper = new ModelMapper();

		if (input.replace("/", "").length()>8) {			 
			responseModel=  modelMapper.map(isirServices.fullAnswerClient(isirRequests.checkBirthNumber(input), input), IsirVerificationSingleResponseModelUniversal.class);
			System.out.println(responseModel.toString());
			return responseModel;
		}else {
			responseModel=  modelMapper.map(isirServices.fullAnswerEmployer(isirRequests.checkIco(input), input), IsirVerificationSingleResponseModelUniversal.class);		
			System.out.println(responseModel.toString());
			return responseModel;
		}	

	}
	
    @ApiOperation(value= "${isir.simple.value}")
	@GetMapping(path = "/simple/{input}", produces = {MediaType.APPLICATION_JSON_VALUE })
	public String oneCheckSimple(@PathVariable String input) {
		
		if (input.replace("/", "").length()>8) {
			logger.info("Called simple check of one ico/rc with input param rc {}", input);
			return isirServices.simpleAnswer(isirRequests.checkBirthNumber(input));			
		}else {
			logger.info("Called simple check of one ico/rc with input param ico {}", input);
			return isirServices.simpleAnswer(isirRequests.checkIco(input));
		}		
	}
	
    @ApiOperation(value= "${isir.all.value}")
	@GetMapping(path = "/all", produces = { MediaType.APPLICATION_JSON_VALUE })
	public IsirVerificationFullResponseMain fullCheck(@RequestBody FullRequestModelMain request) {
		
		return listProcessing.processRequestFullList(request);
	}
	
	//Just simple test to get Response directly
    @ApiIgnore
	@GetMapping(path = "/test/{input}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public GetIsirWsCuzkDataResponse testOfResponse(@PathVariable String input) {
		if (input.replace("/", "").length()>8) {
			return isirRequests.checkBirthNumber(input);
		}else {
			return isirRequests.checkIco(input);
		}		
	}

}


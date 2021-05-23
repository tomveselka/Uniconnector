package com.tomveselka.uniconnector.service.impl;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tomveselka.uniconnector.isirWsdlClasses.GetIsirWsCuzkDataResponse;
import com.tomveselka.uniconnector.isirWsdlClasses.IsirWsCuzkData;
import com.tomveselka.uniconnector.listsProcessing.IsirListProcessing;
import com.tomveselka.uniconnector.responseModels.submodels.IsirVerificationFullResponseClient;
import com.tomveselka.uniconnector.responseModels.submodels.IsirVerificationFullResponseEmployer;
import com.tomveselka.uniconnector.service.IsirService;

@Service
public class IsirServiceImpl implements IsirService{
	
	Logger logger = LoggerFactory.getLogger(IsirServiceImpl.class);
	
	public String simpleAnswer (GetIsirWsCuzkDataResponse response) {
		ArrayList <IsirWsCuzkData> dataList=(ArrayList<IsirWsCuzkData>) response.getData();
		if(null==dataList) {
			return "N";
		}else {
			IsirWsCuzkData data=dataList.get(0);
			String stateOfKonkurs=data.getDruhStavKonkursu();
			System.out.println(stateOfKonkurs);
			switch(stateOfKonkurs) {
				case "MYLNÝ ZÁP":
					return "N";
				case "ODSKRTNUTA":
					return "N";
				case "VYRIZENA":
					return "N";
				case "PRAVOMOCNA":
					return "N";
				default:
					return "S";
			}
		}		
	}
	
	public IsirVerificationFullResponseClient fullAnswerClient (GetIsirWsCuzkDataResponse response) {
		ArrayList <IsirWsCuzkData> dataList=(ArrayList<IsirWsCuzkData>) response.getData();
		IsirVerificationFullResponseClient result = new IsirVerificationFullResponseClient();
		if(null==dataList) {
			result.setResult("N");
			return result;
		}
		IsirWsCuzkData data=dataList.get(0);		
		result.setRc(data.getRc());
		result.setState(data.getDruhStavKonkursu());
		result.setActive(simpleAnswer(response));
		result.setResult("S");
		result.setLink(data.getUrlDetailRizeni());
		result.setDateTimeOfCheck((java.time.LocalDateTime.now()).toString());
		logger.info("Result for client with RC {} output is "+result.toString(), result.getRc());
		System.out.println(result.toString());
		return result;
	}
	
	public IsirVerificationFullResponseEmployer fullAnswerEmployer (GetIsirWsCuzkDataResponse response) {
		ArrayList <IsirWsCuzkData> dataList=(ArrayList<IsirWsCuzkData>) response.getData();
		IsirVerificationFullResponseEmployer result = new IsirVerificationFullResponseEmployer();
		if(null==dataList) {
			result.setResult("N");
			return result;
		}
		IsirWsCuzkData data=dataList.get(0);		
		result.setIco(data.getIc());
		result.setState(data.getDruhStavKonkursu());
		result.setActive(simpleAnswer(response));
		result.setResult("S");
		result.setLink(data.getUrlDetailRizeni());
		result.setDateTimeOfCheck((java.time.LocalDateTime.now()).toString());
		logger.info("Result for employer with ICO {} output is "+result.toString(), result.getIco());
		System.out.println(result.toString());
		return result;
	}
}

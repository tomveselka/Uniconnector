package com.tomveselka.uniconnector.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.tomveselka.uniconnector.isirWsdlClasses.GetIsirWsCuzkDataResponse;
import com.tomveselka.uniconnector.isirWsdlClasses.IsirWsCuzkData;
import com.tomveselka.uniconnector.response.submodels.IsirVerificationFullResponseClient;
import com.tomveselka.uniconnector.response.submodels.IsirVerificationFullResponseEmployer;
import com.tomveselka.uniconnector.service.IsirService;

@Service
public class IsirServiceImpl implements IsirService{
	
	
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
	
	public IsirVerificationFullResponseClient fullAnswer (GetIsirWsCuzkDataResponse response) {
		ArrayList <IsirWsCuzkData> dataList=(ArrayList<IsirWsCuzkData>) response.getData();
		IsirVerificationFullResponseClient result = new IsirVerificationFullResponseClient();
		return result;
	}
	
	public IsirVerificationFullResponseEmployer fullAnswerEmployer (GetIsirWsCuzkDataResponse response) {
		ArrayList <IsirWsCuzkData> dataList=(ArrayList<IsirWsCuzkData>) response.getData();
		IsirVerificationFullResponseEmployer result = new IsirVerificationFullResponseEmployer();
		return result;
	}
}

package com.tomveselka.uniconnector.httpRequests;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.tomveselka.uniconnector.dto.ResultIsirDto;
import com.tomveselka.uniconnector.dto.ResultSummaryDto;
import com.tomveselka.uniconnector.isirWsdlClasses.GetIsirWsCuzkDataRequest;
import com.tomveselka.uniconnector.isirWsdlClasses.GetIsirWsCuzkDataResponse;
//https://isir.justice.cz/isir/help/Popis_WS_2_v1_8.pdf
import com.tomveselka.uniconnector.isirWsdlClasses.IsirWsCuzkData;
import com.tomveselka.uniconnector.service.IsirService;
import com.tomveselka.uniconnector.service.ResultsService;

@Component
public class IsirRequests {
	@Autowired
	ResultsService resultService;
	
	@Autowired
	IsirService isirService;

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	public GetIsirWsCuzkDataResponse checkBirthNumber(String birthNumber) {
		/*
		template = new WebServiceTemplate(marshaller);
		GetIsirWsCuzkDataRequest request = new GetIsirWsCuzkDataRequest();
		request.setRc(birthNumber);
		GetIsirWsCuzkDataResponse response = (GetIsirWsCuzkDataResponse) template
				.marshalSendAndReceive("https://isir.justice.cz:8443/isir_cuzk_ws/IsirWsCuzkService", request);
		saveIsirResponse(response,birthNumber,"RC");
		*/
		GetIsirWsCuzkDataResponse response=new GetIsirWsCuzkDataResponse();
		ArrayList<IsirWsCuzkData> dataList= new ArrayList<IsirWsCuzkData>();
		IsirWsCuzkData data = new IsirWsCuzkData();
		data.setDruhStavKonkursu("PRAVOMOCNA");
		data.setUrlDetailRizeni("www.nakopnoutkrecka.cz");
		dataList.add(data);
		//response.setData(dataList);
		saveIsirResponse(response,birthNumber,"RC");
		return response;
	}

	public GetIsirWsCuzkDataResponse checkIco(String ico) {
		/*
		template = new WebServiceTemplate(marshaller);
		GetIsirWsCuzkDataRequest request = new GetIsirWsCuzkDataRequest();
		request.setIc(ico);
		GetIsirWsCuzkDataResponse response = (GetIsirWsCuzkDataResponse) template
				.marshalSendAndReceive("https://isir.justice.cz:8443/isir_cuzk_ws/IsirWsCuzkService", request);
		saveIsirResponse(response,ico,"ICO");
		*/
		GetIsirWsCuzkDataResponse response=new GetIsirWsCuzkDataResponse();
		ArrayList<IsirWsCuzkData> dataList= new ArrayList<IsirWsCuzkData>();
		IsirWsCuzkData data = new IsirWsCuzkData();
		data.setDruhStavKonkursu("PRAVOMOCNA");
		data.setUrlDetailRizeni("www.nakopnoutkrecka.cz");
		dataList.add(data);
		//response.setData(dataList);
		saveIsirResponse(response,ico,"ICO");
		return response;
	}

	public void saveIsirResponse(GetIsirWsCuzkDataResponse response, String identifierNumber, String identifierType) {
		ArrayList<IsirWsCuzkData> dataList = (ArrayList<IsirWsCuzkData>) response.getData();
		ResultSummaryDto summaryDto = new ResultSummaryDto();
		ResultIsirDto isirDto = new ResultIsirDto();
		if (0 == dataList.size() || null == dataList) {
			summaryDto.setFound("N");
			isirDto.setIdentifier(identifierNumber);
			isirDto.setFound("N");
			isirDto.setActive("N");
		} else {
			summaryDto.setFound("S");			
			IsirWsCuzkData data = dataList.get(0);
			isirDto.setIdentifier(identifierNumber);
			isirDto.setFound("S");
			isirDto.setState(data.getDruhStavKonkursu());
			isirDto.setLink(data.getUrlDetailRizeni());
			isirDto.setActive(isirService.simpleAnswer(response));

		}
		summaryDto.setIdentifierType(identifierType);
		summaryDto.setIdentifierNumber(identifierNumber);
		summaryDto.setDateOfVerification(java.time.LocalDateTime.now());
		summaryDto.setCheckedDatabase("ISIR");
		summaryDto.setIsir(isirDto);
		System.out.println(isirDto);
		resultService.createRecord(summaryDto);
	}
}

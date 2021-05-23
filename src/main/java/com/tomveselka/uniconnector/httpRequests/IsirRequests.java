package com.tomveselka.uniconnector.httpRequests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.tomveselka.uniconnector.isirWsdlClasses.GetIsirWsCuzkDataRequest;
import com.tomveselka.uniconnector.isirWsdlClasses.GetIsirWsCuzkDataResponse;
//https://isir.justice.cz/isir/help/Popis_WS_2_v1_8.pdf

@Component
public class IsirRequests {

	@Autowired
	private Jaxb2Marshaller marshaller;
	
	private WebServiceTemplate template;
	
	public GetIsirWsCuzkDataResponse checkBirthNumber (String birthNumber) {
		template= new WebServiceTemplate(marshaller);
		GetIsirWsCuzkDataRequest request=new GetIsirWsCuzkDataRequest();
		request.setRc(birthNumber);
		GetIsirWsCuzkDataResponse response=(GetIsirWsCuzkDataResponse) template.marshalSendAndReceive("https://isir.justice.cz:8443/isir_cuzk_ws/IsirWsCuzkService", request);
		System.out.println(response);
		return response;
	}
	
	public GetIsirWsCuzkDataResponse checkIco (String ico) {
		template= new WebServiceTemplate(marshaller);
		GetIsirWsCuzkDataRequest request=new GetIsirWsCuzkDataRequest();
		request.setIc(ico);
		GetIsirWsCuzkDataResponse response=(GetIsirWsCuzkDataResponse) template.marshalSendAndReceive("https://isir.justice.cz:8443/isir_cuzk_ws/IsirWsCuzkService", request);
		System.out.println(response);
		return response;
	}
}

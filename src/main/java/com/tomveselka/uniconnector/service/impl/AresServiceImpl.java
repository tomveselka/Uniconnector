package com.tomveselka.uniconnector.service.impl;

import java.io.StringReader;
import java.net.http.HttpResponse;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomveselka.uniconnector.aresXsdClasses.AresOdpovedi;
import com.tomveselka.uniconnector.aresXsdClasses.Odpoved;
import com.tomveselka.uniconnector.controllers.IsirController;
import com.tomveselka.uniconnector.httpRequests.AresRequest;
import com.tomveselka.uniconnector.responseModels.AresVerificationFullResponse;
import com.tomveselka.uniconnector.service.AresService;

@Service
public class AresServiceImpl implements AresService {

	@Autowired
	AresRequest aresRequest;
	
	Logger logger = LoggerFactory.getLogger(IsirController.class);
	
	@Override
	public AresVerificationFullResponse fullAnswer(String ico) {

		HttpResponse<String> response = aresRequest.standardQuerry(ico);
		AresOdpovedi aresOdpoved = new AresOdpovedi();
		try {
			JAXBContext jaxbContext     = JAXBContext.newInstance( AresOdpovedi.class );
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(response.body().toString());
			aresOdpoved =(AresOdpovedi) jaxbUnmarshaller.unmarshal(reader);
		} catch (JAXBException e) {
			logger.info("Parsing of response body "+response.toString()+" failed with exception "+e.toString());

		}
		List<Odpoved> odpovedList= aresOdpoved.getOdpoved();
		Odpoved odpoved=odpovedList.get(0);
		System.out.println("Pocet zaznamu="+odpoved.getPocetZaznamu());
		
		return null;
	}

}

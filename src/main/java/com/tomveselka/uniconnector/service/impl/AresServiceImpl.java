package com.tomveselka.uniconnector.service.impl;

import java.io.StringReader;
import java.net.http.HttpResponse;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomveselka.uniconnector.aresXsdClasses.AresOdpovedi;
import com.tomveselka.uniconnector.aresXsdClasses.Odpoved;
import com.tomveselka.uniconnector.aresXsdClasses.Zaznam;
import com.tomveselka.uniconnector.controllers.IsirController;
import com.tomveselka.uniconnector.dto.ResultAresDto;
import com.tomveselka.uniconnector.dto.ResultSummaryDto;
import com.tomveselka.uniconnector.entity.ResultSummaryEntity;
import com.tomveselka.uniconnector.httpRequests.AresRequest;
import com.tomveselka.uniconnector.responseModels.AresVerificationFullResponse;
import com.tomveselka.uniconnector.service.AresService;
import com.tomveselka.uniconnector.service.ResultsService;

@Service
public class AresServiceImpl implements AresService {

	@Autowired
	AresRequest aresRequest;

	@Autowired
	ResultsService resultsService;

	Logger logger = LoggerFactory.getLogger(IsirController.class);

	@Override
	public AresVerificationFullResponse fullAnswer(String ico) {

		AresVerificationFullResponse fullResponse = new AresVerificationFullResponse();
		fullResponse.setIco(ico);
		fullResponse.setDateTimeOfVerification((java.time.LocalDateTime.now()));

		HttpResponse<String> httpResponse = aresRequest.standardQuerry(ico);
		AresOdpovedi aresOdpoved = new AresOdpovedi();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(AresOdpovedi.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(httpResponse.body().toString());
			aresOdpoved = (AresOdpovedi) jaxbUnmarshaller.unmarshal(reader);
		} catch (JAXBException e) {
			logger.info(
					"Parsing of response body " + httpResponse.toString() + " failed with exception " + e.toString());

		}

		List<Odpoved> odpovedList = aresOdpoved.getOdpoved();
		if (odpovedList.size() == 0) {
			fullResponse.setFound("N");
			logger.info("Company with ico " + ico + " was NOT found in ARES");
			saveRecord(fullResponse);
			return fullResponse;
		}
		Odpoved odpoved = odpovedList.get(0);
		Zaznam zaznam = odpoved.getZaznam().get(0);
		fullResponse.setFound("S");
		fullResponse = processPriznaky(fullResponse, zaznam.getPriznakySubjektu());
		logger.info("Company with ico " + ico + " was found in ARES. Results are: " + fullResponse.toString());
		saveRecord(fullResponse);
		return fullResponse;
	}

	private void saveRecord(AresVerificationFullResponse fullResponse) {
		ResultSummaryDto summaryDto = new ResultSummaryDto();
		summaryDto.setIdentifierNumber(fullResponse.getIco());
		summaryDto.setIdentifierType("ICO");
		summaryDto.setFound(fullResponse.getFound());
		summaryDto.setCheckedDatabase("ARES");
		summaryDto.setDateTimeOfVerification(fullResponse.getDateTimeOfVerification());
		ModelMapper modelMapper = new ModelMapper();

		ResultAresDto aresDto = modelMapper.map(fullResponse, ResultAresDto.class);
		aresDto.setIdentifier(fullResponse.getIco());
		summaryDto.setAres(aresDto);
		
		resultsService.createRecord(summaryDto);
	}

	private AresVerificationFullResponse processPriznaky(AresVerificationFullResponse fullResponse, String priznaky) {
		if (priznaky.length() >= 4 && "A".equals(priznaky.subSequence(3, 4))) {
			fullResponse.setExistsRZP("S");
		} else {
			fullResponse.setExistsRZP("N");
		}
		if (priznaky.length() >= 22 && "E".equals(priznaky.subSequence(21, 22))) {
			fullResponse.setExistsInsolvencniRejstrik("S");
		} else {
			fullResponse.setExistsInsolvencniRejstrik("N");
		}
		if (priznaky.length() >= 25 && "A".equals(priznaky.subSequence(24, 25))) {
			fullResponse.setExistsROB("S");
		} else {
			fullResponse.setExistsROB("N");
		}
		if (priznaky.length() >= 6
				&& ("A".equals(priznaky.subSequence(5, 6)) || "S".equals(priznaky.subSequence(5, 6)))) {
			fullResponse.setExistsDPH("S");
		} else {
			fullResponse.setExistsDPH("N");
		}
		if (priznaky.length() >= 7 && "A".equals(priznaky.subSequence(6, 7))) {
			fullResponse.setExitsSpotrebniDan("S");
		} else {
			fullResponse.setExitsSpotrebniDan("N");
		}
		if (priznaky.length() >= 9 && "A".equals(priznaky.subSequence(8, 9))) {
			fullResponse.setExistsEvidenceUpadcuKonkurz("S");
		} else {
			fullResponse.setExistsEvidenceUpadcuKonkurz("N");
		}
		if (priznaky.length() >= 10 && "A".equals(priznaky.subSequence(9, 10))) {
			fullResponse.setExistsEvidenceUpadcuVyrovnani("S");
		} else {
			fullResponse.setExistsEvidenceUpadcuVyrovnani("N");
		}

		return fullResponse;
	}
}

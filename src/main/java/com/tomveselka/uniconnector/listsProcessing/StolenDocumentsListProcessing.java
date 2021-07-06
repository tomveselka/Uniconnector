package com.tomveselka.uniconnector.listsProcessing;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tomveselka.uniconnector.requestModels.FullRequestModelMain;
import com.tomveselka.uniconnector.requestModels.submodels.FullRequestModelClient;
import com.tomveselka.uniconnector.responseModels.DocumentVerificationFullResponseMain;
import com.tomveselka.uniconnector.responseModels.DocumentVerificationSingleResponseModel;
import com.tomveselka.uniconnector.service.StolenDocuments;
import com.tomveselka.uniconnector.xmlParsers.ParseStolenDocumentsXml;

@Component
public class StolenDocumentsListProcessing {
	
	@Autowired
	StolenDocuments stolenDocumentsService;
	
	@Autowired
	ParseStolenDocumentsXml parser;
	
	Logger logger = LoggerFactory.getLogger(IsirListProcessing.class);
	 
	public DocumentVerificationFullResponseMain processRequestFullList(FullRequestModelMain request) {

		ArrayList<FullRequestModelClient> clientInputList = request.getClients();
		ArrayList<DocumentVerificationSingleResponseModel> clientResultList = new ArrayList<DocumentVerificationSingleResponseModel>();
		for (FullRequestModelClient client : clientInputList) {
			DocumentVerificationSingleResponseModel clientResult = new DocumentVerificationSingleResponseModel();
			clientResult.setNumber(client.getDocumentNumber());
			clientResult.setType(client.getDocumentType());
			logger.info("Called simple check of one document with input param type {}, number {}", client.getDocumentType(), client.getDocumentNumber());
			clientResult.setFound(stolenDocumentsService.verifyOneDocument(client.getDocumentNumber(), client.getDocumentType()));
			logger.info("Result of check with input param type {}, number {} - result: {}", clientResult.getFound(), clientResult.getType(), clientResult.getNumber());
			clientResultList.add(clientResult);
		}

		DocumentVerificationFullResponseMain result = new DocumentVerificationFullResponseMain();
		result.setClients(clientResultList);
		return result;

	}
	
}

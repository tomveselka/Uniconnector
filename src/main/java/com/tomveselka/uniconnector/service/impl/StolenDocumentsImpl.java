package com.tomveselka.uniconnector.service.impl;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import com.tomveselka.uniconnector.httpRequests.StolenDocumentsRequest;
import com.tomveselka.uniconnector.service.StolenDocuments;
import com.tomveselka.uniconnector.xmlParsers.ParseStolenDocumentsXml;

@Service
public class StolenDocumentsImpl implements StolenDocuments{
	@Autowired
	StolenDocumentsRequest request;
	@Autowired
	ParseStolenDocumentsXml parsers;

	public String verifyOneDocument(String number, String type){
		String result;
		try {
			result = parsers.parseResponse(request.checkStolenDocumentsDatabase(number, type));
		} catch (SAXException | IOException | ParserConfigurationException | URISyntaxException
				| InterruptedException e) {
			return "verification error";
		}

		return result;
	}
	
}

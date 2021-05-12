package com.tomveselka.uniconnector.service.impl;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.xml.sax.SAXException;

import com.tomveselka.uniconnector.httpRequests.StolenDocumentsRequest;
import com.tomveselka.uniconnector.xmlParsers.ParseStolenDocumentsXml;

public class StolenDocumentsImpl {
	@Autowired
	StolenDocumentsRequest request;
	@Autowired
	ParseStolenDocumentsXml parsers;

	public String verifyOneDocument(String number, String type)
			throws URISyntaxException, IOException, InterruptedException, SAXException, ParserConfigurationException {
		String result;
		result = parsers.parseResponse(request.checkStolenDocumentsDatabase(number, type));

		return result;
	}
}

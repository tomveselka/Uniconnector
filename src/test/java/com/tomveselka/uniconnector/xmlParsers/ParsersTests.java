package com.tomveselka.uniconnector.xmlParsers;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.xml.sax.SAXException;

import com.tomveselka.uniconnector.httpRequests.StolenDocumentsRequest;
import com.tomveselka.uniconnector.xmlParsers.ParseStolenDocumentsXml;



@ExtendWith(MockitoExtension.class)
public class ParsersTests {
	@InjectMocks
	ParseStolenDocumentsXml parsers;
	
	@Test
	@Order(1) 
	void parseResponseNegativeAnser() throws SAXException, IOException, ParserConfigurationException  {
		String xmlResponse="<?xml version=\"1.0\" encoding=\"utf-8\"?><doklady_neplatne posl_zmena=\"12.8.2010\" pristi_zmeny=\"\"><dotaz typ=\"OP\" cislo=\"123456789\" serie=\"-\" /><odpoved aktualizovano=\"10.5.2021\" evidovano=\"ne\" /></doklady_neplatne>";
		String result=parsers.parseResponse(xmlResponse);
		//System.out.println(result);
		assertNotNull(result);
		assertEquals("N", result);
	}
	
	@Test
	@Order(2) 
	void parseResponsePositiveAnser() throws SAXException, IOException, ParserConfigurationException  {
		String xmlResponse="<?xml version=\"1.0\" encoding=\"utf-8\"?><doklady_neplatne posl_zmena=\"12.8.2010\" pristi_zmeny=\"\"><dotaz typ=\"OP\" cislo=\"114963209\" serie=\"-\" /><odpoved aktualizovano=\"10.5.2021\" evidovano=\"ano\" evidovano_od=\"26.4.2021\" /></doklady_neplatne>";
		String result=parsers.parseResponse(xmlResponse);
		//System.out.println(result);
		assertNotNull(result);
		assertEquals("S", result);
	}
}

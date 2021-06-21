package com.tomveselka.uniconnector.xmlParsers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.http.HttpResponse;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.tomveselka.uniconnector.controllers.IsirController;

//https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
@Component
public class ParseStolenDocumentsXml {
	public String parseResponse(HttpResponse<String> xmlResponse) {
	    Logger logger = LoggerFactory.getLogger(IsirController.class);

		if (null == xmlResponse || 200 != xmlResponse.statusCode()) {
			return "error";
		}
		String xmlResponseString = xmlResponse.body().toString();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;

		Document doc;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(new InputSource(new ByteArrayInputStream(xmlResponseString.getBytes("utf-8"))));
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("odpoved");
			Node node = nList.item(0);
			Element element = (Element) node;
			String result = element.getAttribute("evidovano");
			if ("ne".equals(result)) {
				return "N";
			} else {
				return "S";
			}
		} catch (SAXException | IOException | ParserConfigurationException e) {
			logger.info("Parsing of response body "+xmlResponse.toString()+" failed with exception "+e.toString());
			return "error";
		}

	}
}

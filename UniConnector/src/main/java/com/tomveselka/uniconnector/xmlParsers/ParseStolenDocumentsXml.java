package com.tomveselka.uniconnector.xmlParsers;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

//https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
public class ParseStolenDocumentsXml {
	public String parseResponse(String xmlResponse) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new InputSource(new ByteArrayInputStream(xmlResponse.getBytes("utf-8"))));
        doc.getDocumentElement().normalize();
        NodeList nList=doc.getElementsByTagName("odpoved");
        Node node=nList.item(0);
        Element element = (Element) node;
        String result=element.getAttribute("evidovano");
        if ("ne".equals(result)) {
        	return "N";
        }else {
        	return "S";
        }
	}
}

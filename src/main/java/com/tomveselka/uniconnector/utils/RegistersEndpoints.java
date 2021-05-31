package com.tomveselka.uniconnector.utils;

import org.springframework.stereotype.Component;

@Component
public class RegistersEndpoints {

	//https://www.mvcr.cz/clanek/neplatne-doklady-ve-formatu-xml.aspx
	private String stolenDocumentsLink="https://aplikace.mvcr.cz/neplatne-doklady/doklady.aspx";

	public String getStolenDocumentsLink() {
		return stolenDocumentsLink;
	}

	public void setStolenDocumentsLink(String stolenDocumentsLink) {
		this.stolenDocumentsLink = stolenDocumentsLink;
	}
}

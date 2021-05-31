package com.tomveselka.uniconnector.requestModels.submodels;

import java.util.ArrayList;

public class FullRequestModelClient {

	private String rc;
	private String documentType;
	private String documentNumber;
	private ArrayList<FullRequestModelEmployer> employers = new ArrayList<FullRequestModelEmployer>();

	public ArrayList<FullRequestModelEmployer> getEmployers() {
		return employers;
	}

	public void setEmployers(ArrayList<FullRequestModelEmployer> employers) {
		this.employers = employers;
	}

	public String getRc() {
		return rc;
	}

	public void setRc(String rc) {
		this.rc = rc;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
}

package com.tomveselka.uniconnector.request.submodels;

import java.util.ArrayList;

public class IsirVerificationFullResponseRequestModelClient {

	private String rc;
	private ArrayList<IsirVerificationFullResponseRequestModelEmployer> employers = new ArrayList<IsirVerificationFullResponseRequestModelEmployer>();

	public ArrayList<IsirVerificationFullResponseRequestModelEmployer> getEmployers() {
		return employers;
	}

	public void setEmployers(ArrayList<IsirVerificationFullResponseRequestModelEmployer> employers) {
		this.employers = employers;
	}

	public String getRc() {
		return rc;
	}

	public void setRc(String rc) {
		this.rc = rc;
	}
}

package com.tomveselka.uniconnector.response.submodels;

import java.util.ArrayList;

public class IsirVerificationFullResponseClient {
	private String rc;
	// was anything found at all
	private String result;
	// is Rizeni still active
	private String active;
	// if inactive, when did it end
	private String dateOfEnding;
	private ArrayList<IsirVerificationFullResponseEmployer> employers = new ArrayList<IsirVerificationFullResponseEmployer>();
	public String getRc() {
		return rc;
	}
	public void setRc(String rc) {
		this.rc = rc;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getDateOfEnding() {
		return dateOfEnding;
	}
	public void setDateOfEnding(String dateOfEnding) {
		this.dateOfEnding = dateOfEnding;
	}
	public ArrayList<IsirVerificationFullResponseEmployer> getEmployers() {
		return employers;
	}
	public void setEmployers(ArrayList<IsirVerificationFullResponseEmployer> employers) {
		this.employers = employers;
	}
}

package com.tomveselka.uniconnector.responseModels.submodels;

import java.util.ArrayList;

public class IsirVerificationFullResponseClient {
	private String rc;
	// was anything found at all
	private String result;
	// is Rizeni still active
	private String active;
	// state of proceeding
	private String state;
	// link to information about proceeding
	private String link;
	// date of check
	private String dateTimeOfCheck;
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

	public ArrayList<IsirVerificationFullResponseEmployer> getEmployers() {
		return employers;
	}

	public void setEmployers(ArrayList<IsirVerificationFullResponseEmployer> employers) {
		this.employers = employers;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDateTimeOfCheck() {
		return dateTimeOfCheck;
	}

	public void setDateTimeOfCheck(String dateTimeOfCheck) {
		this.dateTimeOfCheck = dateTimeOfCheck;
	}

	@Override
	public String toString() {
		return "IsirVerificationFullResponseClient [rc=" + rc + ", result=" + result + ", active=" + active + ", state="
				+ state + ", link=" + link + ", dateTimeOfCheck=" + dateTimeOfCheck + ", employers=" + employers + "]";
	}
}

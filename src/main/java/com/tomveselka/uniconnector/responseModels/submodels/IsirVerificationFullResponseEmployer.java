package com.tomveselka.uniconnector.responseModels.submodels;

public class IsirVerificationFullResponseEmployer {
	private String ico;
	//was anything found at all
	private String found;
	//is Rizeni still active
	private String active;
	//state of proceeding
	private String state;
	//link to information about proceeding
	private String link;
	//date of check
	private String dateTimeOfVerification;
	public String getIco() {
		return ico;
	}
	public void setIco(String ico) {
		this.ico = ico;
	}

	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
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

	public String getDateTimeOfVerification() {
		return dateTimeOfVerification;
	}
	public void setDateTimeOfVerification(String dateTimeOfVerification) {
		this.dateTimeOfVerification = dateTimeOfVerification;
	}
	public String getFound() {
		return found;
	}
	public void setFound(String found) {
		this.found = found;
	}
	@Override
	public String toString() {
		return "IsirVerificationFullResponseEmployer [ico=" + ico + ", found=" + found + ", active=" + active
				+ ", state=" + state + ", link=" + link + ", dateTimeOfVerification=" + dateTimeOfVerification + "]";
	}



}

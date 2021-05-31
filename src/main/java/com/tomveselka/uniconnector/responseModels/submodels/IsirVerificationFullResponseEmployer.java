package com.tomveselka.uniconnector.responseModels.submodels;

public class IsirVerificationFullResponseEmployer {
	private String ico;
	//was anything found at all
	private String result;
	//is Rizeni still active
	private String active;
	//state of proceeding
	private String state;
	//link to information about proceeding
	private String link;
	//date of check
	private String dateTimeOfCheck;
	public String getIco() {
		return ico;
	}
	public void setIco(String ico) {
		this.ico = ico;
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
		return "IsirVerificationFullResponseEmployer [ico=" + ico + ", result=" + result + ", active=" + active
				+ ", state=" + state + ", link=" + link + ", dateTimeOfCheck=" + dateTimeOfCheck + "]";
	}
}

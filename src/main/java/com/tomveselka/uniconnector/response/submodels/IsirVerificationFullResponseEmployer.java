package com.tomveselka.uniconnector.response.submodels;

public class IsirVerificationFullResponseEmployer {
	private String ico;
	//was anything found at all
	private String result;
	//is Rizeni still active
	private String active;
	//if inactive, when did it end
	private String dateOfEnding;
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
	public String getDateOfEnding() {
		return dateOfEnding;
	}
	public void setDateOfEnding(String dateOfEnding) {
		this.dateOfEnding = dateOfEnding;
	}
}

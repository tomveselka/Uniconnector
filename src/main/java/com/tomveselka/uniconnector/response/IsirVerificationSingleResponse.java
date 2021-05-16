package com.tomveselka.uniconnector.response;

public class IsirVerificationSingleResponse {
	private String ico;
	private String birthNumber;
	private String result;
	private String active;
	private String dateOfEnding;
	public String getBirthNumber() {
		return birthNumber;
	}
	public void setBirthNumber(String birthNumber) {
		this.birthNumber = birthNumber;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
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
	public String getDateOfEnding() {
		return dateOfEnding;
	}
	public void setDateOfEnding(String dateOfEnding) {
		this.dateOfEnding = dateOfEnding;
	}
}

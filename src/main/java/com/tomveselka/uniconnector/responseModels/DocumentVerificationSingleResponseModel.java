package com.tomveselka.uniconnector.responseModels;

public class DocumentVerificationSingleResponseModel {
	private String number;
	private String type;
	private String result;
	private String dateTimeOfCheck;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getDateTimeOfCheck() {
		return dateTimeOfCheck;
	}
	public void setDateTimeOfCheck(String dateTimeOfCheck) {
		this.dateTimeOfCheck = dateTimeOfCheck;
	}
}

package com.tomveselka.uniconnector.responseModels;

public class DocumentVerificationSingleResponseModel {
	private String number;
	private String type;
	private String found;
	private String dateTimeOfVerification;
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

}

package com.tomveselka.uniconnector.dto;

import java.time.LocalDateTime;

public class ResultSummaryDto {

	private String recordId;
	private String identifierNumber;
	private String identifierType;
	private String found;
	private String checkedDatabase;
	private LocalDateTime dateTimeOfVerification;
	private ResultIsirDto isir;
	private ResultAresDto ares;
	
	public String getIdentifierNumber() {
		return identifierNumber;
	}
	public void setIdentifierNumber(String identifierNumber) {
		this.identifierNumber = identifierNumber;
	}
	public String getIdentifierType() {
		return identifierType;
	}
	public void setIdentifierType(String identifierType) {
		this.identifierType = identifierType;
	}

	public String getCheckedDatabase() {
		return checkedDatabase;
	}
	public void setCheckedDatabase(String checkedDatabase) {
		this.checkedDatabase = checkedDatabase;
	}

	public ResultSummaryDto() {
		// TODO Auto-generated constructor stub
	}

	public String getFound() {
		return found;
	}
	public void setFound(String found) {
		this.found = found;
	}

	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public ResultIsirDto getIsir() {
		return isir;
	}
	public void setIsir(ResultIsirDto isir) {
		this.isir = isir;
	}


	public LocalDateTime getDateTimeOfVerification() {
		return dateTimeOfVerification;
	}
	public void setDateTimeOfVerification(LocalDateTime dateTimeOfVerification) {
		this.dateTimeOfVerification = dateTimeOfVerification;
	}
	public ResultAresDto getAres() {
		return ares;
	}
	public void setAres(ResultAresDto ares) {
		this.ares = ares;
	}
	@Override
	public String toString() {
		return "ResultSummaryDto [recordId=" + recordId + ", identifierNumber=" + identifierNumber + ", identifierType="
				+ identifierType + ", found=" + found + ", checkedDatabase=" + checkedDatabase
				+ ", dateTimeOfVerification=" + dateTimeOfVerification + ", isir=" + isir + ", ares=" + ares + "]";
	}
	public ResultSummaryDto(String identifierNumber, String identifierType, String found, String checkedDatabase,
			LocalDateTime dateTimeOfVerification, ResultIsirDto isir, ResultAresDto ares) {
		super();
		this.identifierNumber = identifierNumber;
		this.identifierType = identifierType;
		this.found = found;
		this.checkedDatabase = checkedDatabase;
		this.dateTimeOfVerification = dateTimeOfVerification;
		this.isir = isir;
		this.ares = ares;
	}


}

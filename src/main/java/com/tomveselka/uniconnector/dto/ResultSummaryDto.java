package com.tomveselka.uniconnector.dto;

import java.time.LocalDateTime;

import com.tomveselka.uniconnector.entity.ResultIsirEntity;

public class ResultSummaryDto {

	private String recordId;
	private String identifierNumber;
	private String identifierType;
	private String found;
	private String checkedDatabase;
	private LocalDateTime dateOfVerification;
	private ResultIsirDto isir;
	
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


	public LocalDateTime getDateOfVerification() {
		return dateOfVerification;
	}
	public void setDateOfVerification(LocalDateTime dateOfVerification) {
		this.dateOfVerification = dateOfVerification;
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
	@Override
	public String toString() {
		return "ResultSummaryDto [recordId=" + recordId + ", identifierNumber=" + identifierNumber + ", identifierType="
				+ identifierType + ", found=" + found + ", checkedDatabase=" + checkedDatabase + ", dateOfVerification="
				+ dateOfVerification + ", isir=" + isir + "]";
	}
	public ResultSummaryDto(String identifierNumber, String identifierType, String found, String checkedDatabase,
			LocalDateTime dateOfVerification, ResultIsirDto isir) {
		super();
		this.identifierNumber = identifierNumber;
		this.identifierType = identifierType;
		this.found = found;
		this.checkedDatabase = checkedDatabase;
		this.dateOfVerification = dateOfVerification;
		this.isir = isir;
	}


}

package com.tomveselka.uniconnector.dto;

import java.time.LocalDateTime;

import com.tomveselka.uniconnector.entity.ResultIsirEntity;

public class ResultSummaryDto {

	private String identifierNumber;
	private String identifierType;
	private String result;
	private String checkedDatabase;
	private LocalDateTime dateOfVerification;
	private ResultIsirEntity isirEntity;
	
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
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getCheckedDatabase() {
		return checkedDatabase;
	}
	public void setCheckedDatabase(String checkedDatabase) {
		this.checkedDatabase = checkedDatabase;
	}

	public ResultIsirEntity getIsirEntity() {
		return isirEntity;
	}
	public void setIsirEntity(ResultIsirEntity isirEntity) {
		this.isirEntity = isirEntity;
	}
	public LocalDateTime getDateOfVerification() {
		return dateOfVerification;
	}
	public void setDateOfVerification(LocalDateTime dateOfVerification) {
		this.dateOfVerification = dateOfVerification;
	}
	public ResultSummaryDto(String identifierNumber, String identifierType, String result, String checkedDatabase,
			LocalDateTime dateOfVerification, ResultIsirEntity isirEntity) {
		super();
		this.identifierNumber = identifierNumber;
		this.identifierType = identifierType;
		this.result = result;
		this.checkedDatabase = checkedDatabase;
		this.dateOfVerification = dateOfVerification;
		this.isirEntity = isirEntity;
	}

}

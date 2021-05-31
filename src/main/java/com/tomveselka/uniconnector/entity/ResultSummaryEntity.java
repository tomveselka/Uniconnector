package com.tomveselka.uniconnector.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name="summaries")
public class ResultSummaryEntity implements Serializable{

	private static final long serialVersionUID = -8078836545859959368L;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	//RC or ICO or Document number
	@Column(length=50)
	private String identifierNumber;
	
	//RC or ICO or Document
	@Column(length=10)
	private String identifierType;
	
	//result of verification
	@Column(length=50)
	private String result;
	
	//checked database
	@Column(length=10)
	private String checkedDatabase;
	
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime  dateOfVerification;

	//https://www.baeldung.com/jpa-one-to-one
	@OneToOne(mappedBy = "summary", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private ResultIsirEntity isirEntity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "ResultSummaryEntity [id=" + id + ", identifierNumber=" + identifierNumber + ", identifierType="
				+ identifierType + ", result=" + result + ", checkedDatabase=" + checkedDatabase
				+ ", dateOfVerification=" + dateOfVerification + ", isirEntity=" + isirEntity + "]";
	}
	
	 
}

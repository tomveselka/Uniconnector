package com.tomveselka.uniconnector.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "summaries")
public class ResultSummaryEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	// Id used to search
	@Column(length = 50, name = "record_id")
	private String recordId;

	// RC or ICO or Document number
	@Column(length = 50, name = "identifier_number")
	private String identifierNumber;

	// RC or ICO or Document
	@Column(length = 10, name = "identifier_type")
	private String identifierType;

	// result of verification
	@Column(length = 50, name = "record_found")
	private String found;

	// checked database
	@Column(length = 10, name = "checked_database")
	private String checkedDatabase;

	@Column(columnDefinition = "TIMESTAMP", name = "datetime_of_verification")
	private LocalDateTime dateOfVerification;

	// https://examples.javacodegeeks.com/enterprise-java/jpa-one-one-example/
	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "summary_isir_fk")
	private ResultIsirEntity isir;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getFound() {
		return found;
	}

	public void setFound(String result) {
		this.found = result;
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



	public ResultIsirEntity getIsir() {
		return isir;
	}

	public void setIsir(ResultIsirEntity isir) {
		this.isir = isir;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	@Override
	public String toString() {
		return "ResultSummaryEntity [recordId=" + recordId + ", identifierNumber=" + identifierNumber
				+ ", identifierType=" + identifierType + ", found=" + found + ", checkedDatabase=" + checkedDatabase
				+ ", dateOfVerification=" + dateOfVerification + ", isir=" + isir + "]";
	}

}

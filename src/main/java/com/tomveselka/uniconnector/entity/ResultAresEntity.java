package com.tomveselka.uniconnector.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "summaries_ares")
public class ResultAresEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 10)
	private String identifier;
	
	@Column(length = 4)
	private String existsRZP;
	
	@Column(length = 4)
	private String existsInsolvencniRejstrik;
	
	@Column(length = 4)
	private String existsROB;
	
	@Column(length = 4)
	private String existsDPH;
	
	@Column(length = 4)
	private String exitsSpotrebniDan;
	
	@Column(length = 4)
	private String existsEvidenceUpadcuKonkurz;
	
	@Column(length = 4)
	private String existsEvidenceUpadcuVyrovnani;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getExistsRZP() {
		return existsRZP;
	}

	public void setExistsRZP(String existsRZP) {
		this.existsRZP = existsRZP;
	}

	public String getExistsInsolvencniRejstrik() {
		return existsInsolvencniRejstrik;
	}

	public void setExistsInsolvencniRejstrik(String existsInsolvencniRejstrik) {
		this.existsInsolvencniRejstrik = existsInsolvencniRejstrik;
	}

	public String getExistsROB() {
		return existsROB;
	}

	public void setExistsROB(String existsROB) {
		this.existsROB = existsROB;
	}

	public String getExistsDPH() {
		return existsDPH;
	}

	public void setExistsDPH(String existsDPH) {
		this.existsDPH = existsDPH;
	}

	public String getExitsSpotrebniDan() {
		return exitsSpotrebniDan;
	}

	public void setExitsSpotrebniDan(String exitsSpotrebniDan) {
		this.exitsSpotrebniDan = exitsSpotrebniDan;
	}

	public String getExistsEvidenceUpadcuKonkurz() {
		return existsEvidenceUpadcuKonkurz;
	}

	public void setExistsEvidenceUpadcuKonkurz(String existsEvidenceUpadcuKonkurz) {
		this.existsEvidenceUpadcuKonkurz = existsEvidenceUpadcuKonkurz;
	}

	public String getExistsEvidenceUpadcuVyrovnani() {
		return existsEvidenceUpadcuVyrovnani;
	}

	public void setExistsEvidenceUpadcuVyrovnani(String existsEvidenceUpadcuVyrovnani) {
		this.existsEvidenceUpadcuVyrovnani = existsEvidenceUpadcuVyrovnani;
	}
}

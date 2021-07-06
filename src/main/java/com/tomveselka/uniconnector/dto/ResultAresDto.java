package com.tomveselka.uniconnector.dto;

import javax.persistence.Column;

public class ResultAresDto {

	private String identifier;

	private String existsRZP;

	private String existsInsolvencniRejstrik;

	private String existsROB;

	private String existsDPH;

	private String exitsSpotrebniDan;

	private String existsEvidenceUpadcuKonkurz;

	private String existsEvidenceUpadcuVyrovnani;

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

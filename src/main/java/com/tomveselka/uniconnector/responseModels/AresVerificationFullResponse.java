package com.tomveselka.uniconnector.responseModels;

import java.time.LocalDateTime;

public class AresVerificationFullResponse {
	private String existsRZP;
	private String existsInsolvencniRejstrik;
	private String existsROB;
	private String existsDPH;
	private String exitsSpotrebniDan;
	private String existsEvidenceUpadcuKonkurz;
	private String existsEvidenceUpadcuVyrovnani;
	
	private LocalDateTime dateTimeOfVerification;
	private String ico;
	private String found;
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

	public String getIco() {
		return ico;
	}
	public void setIco(String ico) {
		this.ico = ico;
	}
	public String getFound() {
		return found;
	}
	public void setFound(String found) {
		this.found = found;
	}
	public LocalDateTime getDateTimeOfVerification() {
		return dateTimeOfVerification;
	}
	public void setDateTimeOfVerification(LocalDateTime dateTimeOfVerification) {
		this.dateTimeOfVerification = dateTimeOfVerification;
	}
	@Override
	public String toString() {
		return "AresVerificationFullResponse [existsRZP=" + existsRZP + ", existsInsolvencniRejstrik="
				+ existsInsolvencniRejstrik + ", existsROB=" + existsROB + ", existsDPH=" + existsDPH
				+ ", exitsSpotrebniDan=" + exitsSpotrebniDan + ", existsEvidenceUpadcuKonkurz="
				+ existsEvidenceUpadcuKonkurz + ", existsEvidenceUpadcuVyrovnani=" + existsEvidenceUpadcuVyrovnani
				+ ", dateTimeOfVerification=" + dateTimeOfVerification + ", ico=" + ico + ", found=" + found + "]";
	}

	
	
}

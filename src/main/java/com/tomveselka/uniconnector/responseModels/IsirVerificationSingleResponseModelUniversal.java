package com.tomveselka.uniconnector.responseModels;

public class IsirVerificationSingleResponseModelUniversal {
	private String rc;
	private String ico;

	// was anything found at all
	private String result;
	// is Rizeni still active
	private String active;
	// state of proceeding
	private String state;
	// link to information about proceeding
	private String link;
	// date of check
	private String dateTimeOfVerification;
	public String getRc() {
		return rc;
	}
	public void setRc(String rc) {
		this.rc = rc;
	}
	public String getIco() {
		return ico;
	}
	public void setIco(String ico) {
		this.ico = ico;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDateTimeOfVerification() {
		return dateTimeOfVerification;
	}
	public void setDateTimeOfVerification(String dateTimeOfVerification) {
		this.dateTimeOfVerification = dateTimeOfVerification;
	}
	@Override
	public String toString() {
		return "IsirVerificationSingleResponseModelUniversal [rc=" + rc + ", ico=" + ico + ", result=" + result
				+ ", active=" + active + ", state=" + state + ", link=" + link + ", dateTimeOfVerification="
				+ dateTimeOfVerification + "]";
	}

}

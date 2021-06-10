package com.tomveselka.uniconnector.dto;

public class ResultIsirDto {
	private String identifier;
	private String found;
	private String active;
	private String state;
	private String link;
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getFound() {
		return found;
	}
	public void setFound(String result) {
		this.found = result;
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
	public ResultIsirDto(String identifier, String found, String active, String state, String link) {
		super();
		this.identifier = identifier;
		this.found = found;
		this.active = active;
		this.state = state;
		this.link = link;
	}
	public ResultIsirDto() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResultIsirDto [identifier=" + identifier + ", found=" + found + ", active=" + active + ", state="
				+ state + ", link=" + link + "]";
	}
}

package com.tomveselka.uniconnector.request;

import java.util.ArrayList;

import com.tomveselka.uniconnector.request.submodels.IsirVerificationFullResponseRequestModelClient;

public class IsirVerificationFullResponseRequestModel {
	private ArrayList<IsirVerificationFullResponseRequestModelClient> clients = new ArrayList<IsirVerificationFullResponseRequestModelClient>();

	public ArrayList<IsirVerificationFullResponseRequestModelClient> getClients() {
		return clients;
	}

	public void setClients(ArrayList<IsirVerificationFullResponseRequestModelClient> clients) {
		this.clients = clients;
	}


}

package com.tomveselka.uniconnector.response;

import java.util.ArrayList;

import com.tomveselka.uniconnector.response.submodels.IsirVerificationFullResponseClient;

public class IsirVerificationFullResponse {
	private ArrayList<IsirVerificationFullResponseClient> clients =new ArrayList<IsirVerificationFullResponseClient>();

	public ArrayList<IsirVerificationFullResponseClient> getClients() {
		return clients;
	}

	public void setClients(ArrayList<IsirVerificationFullResponseClient> clients) {
		this.clients = clients;
	}
}

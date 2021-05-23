package com.tomveselka.uniconnector.responseModels;

import java.util.ArrayList;

import com.tomveselka.uniconnector.responseModels.submodels.IsirVerificationFullResponseClient;

public class IsirVerificationFullResponseMain {
	private ArrayList<IsirVerificationFullResponseClient> clients =new ArrayList<IsirVerificationFullResponseClient>();

	public ArrayList<IsirVerificationFullResponseClient> getClients() {
		return clients;
	}

	public void setClients(ArrayList<IsirVerificationFullResponseClient> clients) {
		this.clients = clients;
	}
}

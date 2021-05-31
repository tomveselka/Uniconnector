package com.tomveselka.uniconnector.requestModels;

import java.util.ArrayList;

import com.tomveselka.uniconnector.requestModels.submodels.FullRequestModelClient;

public class FullRequestModelMain {
	private ArrayList<FullRequestModelClient> clients = new ArrayList<FullRequestModelClient>();

	public ArrayList<FullRequestModelClient> getClients() {
		return clients;
	}

	public void setClients(ArrayList<FullRequestModelClient> clients) {
		this.clients = clients;
	}


}

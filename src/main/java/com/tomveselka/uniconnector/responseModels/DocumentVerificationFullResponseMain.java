package com.tomveselka.uniconnector.responseModels;

import java.util.ArrayList;

public class DocumentVerificationFullResponseMain {
	private ArrayList<DocumentVerificationSingleResponseModel> clients =new ArrayList<DocumentVerificationSingleResponseModel>();

	public ArrayList<DocumentVerificationSingleResponseModel> getClients() {
		return clients;
	}

	public void setClients(ArrayList<DocumentVerificationSingleResponseModel> clients) {
		this.clients = clients;
	}
	
	
}

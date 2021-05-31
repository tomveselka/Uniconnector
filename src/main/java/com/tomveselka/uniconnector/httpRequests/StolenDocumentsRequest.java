package com.tomveselka.uniconnector.httpRequests;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.time.temporal.ChronoUnit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomveselka.uniconnector.utils.RegistersEndpoints;

@Service
public class StolenDocumentsRequest {
	@Autowired
	RegistersEndpoints endpoints;
	
	public HttpResponse<String> checkStolenDocumentsDatabase(String number, String type) throws URISyntaxException, IOException, InterruptedException {
		 String stolenDocumentsLink="https://aplikace.mvcr.cz/neplatne-doklady/doklady.aspx";
		String uri=stolenDocumentsLink+"?dotaz="+number+"&doklad="+type;
		// String uri=endpoints.getStolenDocumentsLink()+"?dotaz="+number+"&doklad="+type;
		System.out.println(uri);
		HttpRequest request =HttpRequest.newBuilder()
				.uri(new URI(uri))
				.timeout(Duration.of(10, ChronoUnit.SECONDS))
				.GET()
				.build();
		HttpResponse<String> response = HttpClient.newBuilder()
				.build()
				.send(request, BodyHandlers.ofString());
		System.out.println(response.statusCode());
		System.out.println(response.body().toString());
		
		return response;
	}
}

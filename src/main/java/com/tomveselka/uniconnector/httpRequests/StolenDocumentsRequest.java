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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tomveselka.uniconnector.controllers.IsirController;

@Service
public class StolenDocumentsRequest {
	
    Logger logger = LoggerFactory.getLogger(IsirController.class);
    
	private  String stolenDocumentsLink="https://aplikace.mvcr.cz/neplatne-doklady/doklady.aspx";

	public HttpResponse<String> checkStolenDocumentsDatabase(String number, String type) {
			
		String uri=stolenDocumentsLink+"?dotaz="+number+"&doklad="+type;
		// String uri=endpoints.getStolenDocumentsLink()+"?dotaz="+number+"&doklad="+type;
		System.out.println(uri);
		
		HttpResponse<String> response;
		try {
			HttpRequest request =HttpRequest.newBuilder()
					.uri(new URI(uri))
					.timeout(Duration.of(10, ChronoUnit.SECONDS))
					.GET()
					.build();
			
			response = HttpClient.newBuilder()
					.build()
					.send(request, BodyHandlers.ofString());
			System.out.println(response.statusCode());
			System.out.println(response.body().toString());
			
			return response;
		} catch (IOException | InterruptedException | URISyntaxException e) {
			logger.info("HTTP Request to check StolenDocument database with id type="+type+" and number="+number+" ended with exception"+e.toString());
			return null;
		}
		
	}
}

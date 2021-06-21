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
import org.springframework.stereotype.Component;

import com.tomveselka.uniconnector.controllers.IsirController;

@Component
public class AresRequest {

	private String aresStandardLink="https://wwwinfo.mfcr.cz/cgi-bin/ares/darv_std.cgi";
	
	Logger logger = LoggerFactory.getLogger(IsirController.class);
	
	public HttpResponse<String> standardQuerry(String ico){
		
		String uri=aresStandardLink+"?ico="+ico;
		
		HttpResponse<String> response;
		HttpRequest request;
		try {
			request = HttpRequest.newBuilder()
					.uri(new URI(uri))
					.timeout(Duration.of(10, ChronoUnit.SECONDS))
					.GET()
					.build();
			response = HttpClient.newBuilder()
					.build()
					.send(request, BodyHandlers.ofString());
			System.out.println(response.statusCode());
			System.out.println(response.body().toString());
		} catch (URISyntaxException | IOException | InterruptedException e) {
			logger.info("HTTP Request to check Ares Standard service with i="+ico+" ended with exception"+e.toString());
			return null;
		}	
		
		return response;
	}
}

package com.tomveselka.uniconnector.requests;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.http.HttpResponse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.tomveselka.uniconnector.UniConnectorApplication;
import com.tomveselka.uniconnector.config.WireMockInitializer;
import com.tomveselka.uniconnector.httpRequests.StolenDocumentsRequest;

//stolen documents to use 115029329 115048437 115044147
//https://rieckpil.de/spring-boot-integration-tests-with-wiremock-and-junit-5/

@ExtendWith(MockitoExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(initializers = { WireMockInitializer.class }, classes = {UniConnectorApplication.class })
class StolenDocumentsRequestTest {

	@InjectMocks
	StolenDocumentsRequest request;

	@Autowired
	private WireMockServer wireMockServer;

	
	@AfterEach
	  public void afterEach() {
		this.wireMockServer.resetAll();
	  }
	
	@Test
	void testGetResponseStolenDocumentsCode200() {
		String number="236416214";
		String type="0";

		wireMockServer.stubFor(
			     // WireMock.get(WireMock.urlEqualTo("/neplatne-doklady/doklady.aspx"+"?dotaz="+number+"&doklad="+type))
			      WireMock.get(WireMock.anyUrl()) 
			      .willReturn(aResponse()
			          .withStatus(200)	
			          .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
			          .withBody("aaa"))
			    );
		HttpResponse<String> response=request.checkStolenDocumentsDatabase(number, type);
		System.out.println(response.body().toString());
		assertNotNull(response.body().toString());
	}
	/*
	 * @Test void callDatabseCheckIfGetRespons() throws URISyntaxException,
	 * IOException, InterruptedException { String number="114963209"; String
	 * type="0"; String response=request.checkStolenDocumentsDatabase(number, type);
	 * System.out.println(response); assertNotNull(response);
	 * 
	 * }
	 */

}

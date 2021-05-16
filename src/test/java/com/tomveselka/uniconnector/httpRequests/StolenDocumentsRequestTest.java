package com.tomveselka.uniconnector.httpRequests;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.URISyntaxException;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tomveselka.uniconnector.httpRequests.StolenDocumentsRequest;
import com.tomveselka.uniconnector.utils.RegistersEndpoints;

//stolen OP 114963206 114963209 114963213 114963222


@ExtendWith(MockitoExtension.class)
class StolenDocumentsRequestTest {
	@InjectMocks
	StolenDocumentsRequest request;
	@Mock
	RegistersEndpoints endpoints;
	
	@BeforeEach
	void setUp() {
		//request=new StolenDocumentsRequest();
	}
	
	@Test
	void callDatabseCheckIfGetRespons() throws URISyntaxException, IOException, InterruptedException {
		String number="114963209";
		String type="0";
		String response=request.checkStolenDocumentsDatabase(number, type);
		System.out.println(response);
		assertNotNull(response);

	}
	
	
}

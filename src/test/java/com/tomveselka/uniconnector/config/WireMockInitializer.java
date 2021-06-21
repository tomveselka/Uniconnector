package com.tomveselka.uniconnector.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextClosedEvent;

import com.github.tomakehurst.wiremock.WireMockServer;

public class WireMockInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	  @Override
	  public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
		WireMockServer wireMockServer = new WireMockServer(9090);
		wireMockServer.start();
		configurableApplicationContext.getBeanFactory().registerSingleton("wireMockServer", wireMockServer);

		configurableApplicationContext.addApplicationListener(applicationEvent -> {
			if (applicationEvent instanceof ContextClosedEvent) {
				wireMockServer.stop();
			}
		});

	  }

	}

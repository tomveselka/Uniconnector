package com.tomveselka.uniconnector.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

//SOAP guide https://www.youtube.com/watch?v=WJg3NUwq6zU

@Configuration
public class SoapConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan("com.tomveselka.uniconnector.isirWsdlClasses");
		return marshaller;
	}
}

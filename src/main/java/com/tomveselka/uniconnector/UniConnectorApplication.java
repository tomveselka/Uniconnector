package com.tomveselka.uniconnector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@SpringBootApplication
public class UniConnectorApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(UniConnectorApplication.class, args);
	}

}

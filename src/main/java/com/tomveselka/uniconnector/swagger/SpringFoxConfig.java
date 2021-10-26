package com.tomveselka.uniconnector.swagger;

import java.util.Collections;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tomveselka.uniconnector.isirWsdlClasses.GetIsirWsCuzkDataRequest;
import com.tomveselka.uniconnector.isirWsdlClasses.GetIsirWsCuzkDataResponse;
import com.tomveselka.uniconnector.isirWsdlClasses.IsirWsCuzkData;
import com.tomveselka.uniconnector.isirWsdlClasses.IsirWsCuzkStatus;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
//https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
/*
 * Customisation info
*
*http://springfox.github.io/springfox/docs/current/
*http://progressivecoder.com/advanced-swagger-configuration-with-spring-boot/
*
**/
@Configuration
public class SpringFoxConfig {
	
	Class[] ignoredModels = {IsirWsCuzkData.class, IsirWsCuzkStatus.class, GetIsirWsCuzkDataResponse.class,
			GetIsirWsCuzkDataRequest.class,javax.xml.namespace.QName.class, XMLGregorianCalendar.class};
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis( RequestHandlerSelectors.basePackage("com.tomveselka.uniconnector.controllers"))              
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiInfo())
          .ignoredParameterTypes(ignoredModels);
    }
	
	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "Uniconnector API", 
	      "Describes API for checking Database of stolen documents, ISIR and ARES", 
	      "1.0.0", 
	      null, 
	      new Contact("Tomáš Veselý", "https://github.com/tomveselka", null), 
	      null, null, Collections.emptyList());
	}

}

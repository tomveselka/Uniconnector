package com.tomveselka.uniconnector.service;


import org.springframework.stereotype.Component;


@Component
public interface StolenDocuments {
	String verifyOneDocument(String number, String type);
}

package com.tomveselka.uniconnector.service;

import com.tomveselka.uniconnector.isirWsdlClasses.GetIsirWsCuzkDataResponse;
import com.tomveselka.uniconnector.response.submodels.IsirVerificationFullResponseClient;
import com.tomveselka.uniconnector.response.submodels.IsirVerificationFullResponseEmployer;


public interface IsirService {
	String simpleAnswer (GetIsirWsCuzkDataResponse response);
	IsirVerificationFullResponseClient fullAnswerClient (GetIsirWsCuzkDataResponse response);
	IsirVerificationFullResponseEmployer fullAnswerEmployer (GetIsirWsCuzkDataResponse response);
}

package com.tomveselka.uniconnector.service;

import com.tomveselka.uniconnector.isirWsdlClasses.GetIsirWsCuzkDataResponse;
import com.tomveselka.uniconnector.responseModels.submodels.IsirVerificationFullResponseClient;
import com.tomveselka.uniconnector.responseModels.submodels.IsirVerificationFullResponseEmployer;


public interface IsirService {
	String simpleAnswer (GetIsirWsCuzkDataResponse response);
	IsirVerificationFullResponseClient fullAnswerClient (GetIsirWsCuzkDataResponse response, String rc);
	IsirVerificationFullResponseEmployer fullAnswerEmployer (GetIsirWsCuzkDataResponse response, String rc);
}

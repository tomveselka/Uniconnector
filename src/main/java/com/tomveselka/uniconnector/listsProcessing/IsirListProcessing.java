package com.tomveselka.uniconnector.listsProcessing;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomveselka.uniconnector.controllers.IsirController;
import com.tomveselka.uniconnector.httpRequests.IsirRequests;
import com.tomveselka.uniconnector.request.IsirVerificationFullResponseRequestModel;
import com.tomveselka.uniconnector.request.submodels.IsirVerificationFullResponseRequestModelClient;
import com.tomveselka.uniconnector.request.submodels.IsirVerificationFullResponseRequestModelEmployer;
import com.tomveselka.uniconnector.response.IsirVerificationFullResponse;
import com.tomveselka.uniconnector.response.submodels.IsirVerificationFullResponseClient;
import com.tomveselka.uniconnector.response.submodels.IsirVerificationFullResponseEmployer;
import com.tomveselka.uniconnector.service.IsirService;

@Service
public class IsirListProcessing {

	@Autowired
	IsirRequests isirRequests;

	@Autowired
	IsirService isirServices;

	 Logger logger = LoggerFactory.getLogger(IsirListProcessing.class);
	 
	public IsirVerificationFullResponse processRequestFullList(IsirVerificationFullResponseRequestModel request) {

		ArrayList<IsirVerificationFullResponseRequestModelClient> clientInputList = request.getClients();
		ArrayList<IsirVerificationFullResponseClient> clientResultList = new ArrayList<IsirVerificationFullResponseClient>();
		for (IsirVerificationFullResponseRequestModelClient client : clientInputList) {
			IsirVerificationFullResponseClient clientResult = isirServices
					.fullAnswerClient(isirRequests.checkBirthNumber(client.getRc()));
			logger.info("Result for client with RC {} output is "+clientResult.toString(), client.getRc());
			ArrayList<IsirVerificationFullResponseRequestModelEmployer> employerInputList = client.getEmployers();
			ArrayList<IsirVerificationFullResponseEmployer> employerResultsList = new ArrayList<IsirVerificationFullResponseEmployer>();
			for (IsirVerificationFullResponseRequestModelEmployer employer : employerInputList) {
				IsirVerificationFullResponseEmployer employerResult = isirServices
						.fullAnswerEmployer(isirRequests.checkIco(employer.getIco()));
				logger.info("Result for employer with ICO  {}, who is employing client {} output is "+clientResult.toString(),employer.getIco(), client.getRc());
				employerResultsList.add(employerResult);
			}
			clientResult.setEmployers(employerResultsList);
			clientResultList.add(clientResult);
		}

		IsirVerificationFullResponse result = new IsirVerificationFullResponse();
		result.setClients(clientResultList);
		return result;

	}
}

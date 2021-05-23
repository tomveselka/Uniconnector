package com.tomveselka.uniconnector.listsProcessing;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomveselka.uniconnector.controllers.IsirController;
import com.tomveselka.uniconnector.httpRequests.IsirRequests;
import com.tomveselka.uniconnector.requestModels.FullRequestModelMain;
import com.tomveselka.uniconnector.requestModels.submodels.FullRequestModelClient;
import com.tomveselka.uniconnector.requestModels.submodels.FullRequestModelEmployer;
import com.tomveselka.uniconnector.responseModels.IsirVerificationFullResponseMain;
import com.tomveselka.uniconnector.responseModels.submodels.IsirVerificationFullResponseClient;
import com.tomveselka.uniconnector.responseModels.submodels.IsirVerificationFullResponseEmployer;
import com.tomveselka.uniconnector.service.IsirService;

@Service
public class IsirListProcessing {

	@Autowired
	IsirRequests isirRequests;

	@Autowired
	IsirService isirServices;

	 Logger logger = LoggerFactory.getLogger(IsirListProcessing.class);
	 
	public IsirVerificationFullResponseMain processRequestFullList(FullRequestModelMain request) {

		ArrayList<FullRequestModelClient> clientInputList = request.getClients();
		ArrayList<IsirVerificationFullResponseClient> clientResultList = new ArrayList<IsirVerificationFullResponseClient>();
		for (FullRequestModelClient client : clientInputList) {
			IsirVerificationFullResponseClient clientResult = isirServices
					.fullAnswerClient(isirRequests.checkBirthNumber(client.getRc()));
			logger.info("Result for client with RC {} output is "+clientResult.toString(), client.getRc());
			ArrayList<FullRequestModelEmployer> employerInputList = client.getEmployers();
			ArrayList<IsirVerificationFullResponseEmployer> employerResultsList = new ArrayList<IsirVerificationFullResponseEmployer>();
			for (FullRequestModelEmployer employer : employerInputList) {
				IsirVerificationFullResponseEmployer employerResult = isirServices
						.fullAnswerEmployer(isirRequests.checkIco(employer.getIco()));
				logger.info("Result for employer with ICO  {}, who is employing client {} output is "+clientResult.toString(),employer.getIco(), client.getRc());
				employerResultsList.add(employerResult);
			}
			clientResult.setEmployers(employerResultsList);
			clientResultList.add(clientResult);
		}

		IsirVerificationFullResponseMain result = new IsirVerificationFullResponseMain();
		result.setClients(clientResultList);
		return result;

	}
}

package com.tomveselka.uniconnector.listsProcessing;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.tomveselka.uniconnector.httpRequests.IsirRequests;
import com.tomveselka.uniconnector.request.IsirVerificationFullResponseRequestModel;
import com.tomveselka.uniconnector.request.submodels.IsirVerificationFullResponseRequestModelClient;
import com.tomveselka.uniconnector.request.submodels.IsirVerificationFullResponseRequestModelEmployer;
import com.tomveselka.uniconnector.response.IsirVerificationFullResponse;
import com.tomveselka.uniconnector.response.submodels.IsirVerificationFullResponseClient;
import com.tomveselka.uniconnector.response.submodels.IsirVerificationFullResponseEmployer;
import com.tomveselka.uniconnector.service.IsirService;

public class IsirListProcessing {

	@Autowired
	IsirRequests isirRequests;

	@Autowired
	IsirService isirServices;

	public IsirVerificationFullResponse processRequestFullList(IsirVerificationFullResponseRequestModel request) {

		ArrayList<IsirVerificationFullResponseRequestModelClient> clientInputList = request.getClients();
		ArrayList<IsirVerificationFullResponseClient> clientResultList = new ArrayList<IsirVerificationFullResponseClient>();
		for (IsirVerificationFullResponseRequestModelClient client : clientInputList) {
			IsirVerificationFullResponseClient clientResult = isirServices
					.fullAnswer(isirRequests.checkBirthNumber(client.getRc()));
			ArrayList<IsirVerificationFullResponseRequestModelEmployer> employerInputList = client.getEmployers();
			ArrayList<IsirVerificationFullResponseEmployer> employerResultsList = new ArrayList<IsirVerificationFullResponseEmployer>();
			for (IsirVerificationFullResponseRequestModelEmployer employer : employerInputList) {
				IsirVerificationFullResponseEmployer employerResult = isirServices
						.fullAnswerEmployer(isirRequests.checkIco(employer.getIco()));
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

package com.awstest.services.entity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder;
import com.amazonaws.services.cognitoidp.model.AttributeType;
import com.amazonaws.services.cognitoidp.model.SignUpRequest;
import com.awstest.services.openapi.model.CustomerSignupRequest;

@Service
public class SignupHandlerImpl {

	/*
	 * @Value("${awshelper.clientid}") private String clientid;
	 * 
	 * @Value("${awshelper.region}") private String region;
	 */

	@Autowired
	private UserServiceImpl usermgmnt;

	private static final Logger logger = LoggerFactory.getLogger(SignupHandlerImpl.class);

	public long signUpUser(CustomerSignupRequest customerSignupRequest) {
		logger.info("Signing-up for user {}", customerSignupRequest.getUsername());
//		logger.debug("Region from property: {}", region); //
//		logger.debug("ClientId from property: {}", clientid);
		AnonymousAWSCredentials awsCreds = new AnonymousAWSCredentials();
		AWSCognitoIdentityProvider cognitoIdentityProvider = AWSCognitoIdentityProviderClientBuilder.standard()
				.withCredentials(new AWSStaticCredentialsProvider(awsCreds))
				.withRegion(Regions.fromName("eu-central-1")).build();

		SignUpRequest signUpRequest = new SignUpRequest();
		// signUpRequest.setClientId(clientid);
		signUpRequest.setUsername(customerSignupRequest.getUsername());
		signUpRequest.setPassword(customerSignupRequest.getPassword());
		List<AttributeType> list = new ArrayList<>();
		AttributeType attributeType1 = new AttributeType();
		attributeType1.setName("email");
		attributeType1.setValue(customerSignupRequest.getEmail());
		list.add(attributeType1);

		signUpRequest.setUserAttributes(list);
		try {
			cognitoIdentityProvider.signUp(signUpRequest);
			logger.info("AWS user created for user {}", customerSignupRequest.getUsername());
			usermgmnt.signUpUser(customerSignupRequest);

		} catch (Exception e) { // error.setCode(HttpStatus.ALREADY_REPORTED.name());
		}
		return 0l;
	}

}

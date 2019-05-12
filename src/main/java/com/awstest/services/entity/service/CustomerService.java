package com.awstest.services.entity.service;

import com.awstest.services.openapi.model.CustomerCreationRequest;
import com.awstest.services.openapi.model.CustomerDetailsResponse;

public interface CustomerService {
	
	CustomerDetailsResponse getCustomerDetailsbyid(long customerID);
	CustomerDetailsResponse createCustomer(CustomerCreationRequest customerCreationRequest);

}

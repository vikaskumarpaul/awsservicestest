package com.awstest.services.entity.service;

import com.awstest.services.model.CustomerCreationRequest;
import com.awstest.services.model.CustomerDetailsResponse;

public interface CustomerService {
	
	CustomerDetailsResponse getCustomerDetailsbyid(long customerID);
	CustomerDetailsResponse createCustomer(CustomerCreationRequest customerCreationRequest);

}

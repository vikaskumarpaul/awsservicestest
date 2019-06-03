package com.awstest.services.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awstest.services.entity.service.CustomerService;
import com.awstest.services.openapi.api.CustomerApi;
import com.awstest.services.openapi.model.CustomerDetailsResponse;

@RestController
@RequestMapping("/customerhandler/v1")
public class CustomerRequestHenadler implements CustomerApi {
	private static final Logger logger = LoggerFactory.getLogger(CustomerRequestHenadler.class);

	@Autowired
	private CustomerService customerService;

	@Override
	public ResponseEntity<CustomerDetailsResponse> getCustomerById(@PathVariable("customerId") Long customerId) {
		HttpStatus status = HttpStatus.OK;
		CustomerDetailsResponse customerDetailsResponse = null;

		try {
			customerDetailsResponse = customerService.getCustomerDetailsbyid(customerId);
		} catch (Exception e) {
			logger.error("Failed to get customer details for customer {}", customerId);
		}

		return new ResponseEntity<CustomerDetailsResponse>(customerDetailsResponse, status);
	}

}

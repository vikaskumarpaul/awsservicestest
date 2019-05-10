package com.awstest.services.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awstest.services.controller.CustomerApi;
import com.awstest.services.entity.service.CustomerService;
import com.awstest.services.model.CustomerDetailsResponse;

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

	/*
	 * public ResponseEntity<CustomerDetails> customersignup(@Valid @RequestBody
	 * CustomerCreationRequest customercreationrequest) { CustomerDetails
	 * customerdetails = new CustomerDetails(); CustomerInfo customerrequest = new
	 * CustomerInfo();
	 * customerrequest.setContactName(customercreationrequest.getContactName());
	 * customerrequest.setAccountEmail(customercreationrequest.getAccountEmail());
	 * customerrequest.setCompanyName(customercreationrequest.getCompanyName());
	 * customerrequest.setContactEmail(customercreationrequest.getContactEmail());
	 * try { logger.info("creating customer in system for customer: {}",
	 * customercreationrequest.getContactName()); customerdetails =
	 * customerservice.createCustomer(customerrequest); } catch (Exception e) {
	 * logger.
	 * error("Failed to create Customer in system for Customer: {} due to: {}",
	 * customercreationrequest.getContactName(), e.getMessage()); return new
	 * ResponseEntity<>(HttpStatus.EXPECTATION_FAILED); } return new
	 * ResponseEntity<CustomerDetailsResponse>(customerdetails, HttpStatus.CREATED);
	 * }
	 */

}

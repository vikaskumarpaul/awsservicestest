package com.awstest.services.entity.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awstest.services.entity.Customer;
import com.awstest.services.entity.mapper.CustomerMapper;
import com.awstest.services.entity.repository.CustomerRepository;
import com.awstest.services.entity.service.CustomerService;
import com.awstest.services.openapi.model.CustomerCreationRequest;
import com.awstest.services.openapi.model.CustomerDetailsResponse;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Override
	public CustomerDetailsResponse getCustomerDetailsbyid(long customerID) {
		LOGGER.info("fetching customer details by ID {}", customerID);

		Optional<Customer> optCustomerEntity = customerRepository.findById(customerID);

		if (optCustomerEntity.isPresent()) {
			return CustomerMapper.INSTANCE.customerEntityToDetails(optCustomerEntity.get());
		}

		return null;
	}

	@Override
	public CustomerDetailsResponse createCustomer(CustomerCreationRequest customerCreationRequest) {
		LOGGER.info("fetching customer details by ID {}", customerCreationRequest.toString());

		Customer customerinserted = customerRepository
				.save(CustomerMapper.INSTANCE.customerCreationRequestToEntity(customerCreationRequest));

		if (customerCreationRequest != null) {
			return CustomerMapper.INSTANCE.customerEntityToDetails(customerinserted);
		}
		return null;
	}
}

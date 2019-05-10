package com.awstest.services.entity.service.impl;

import java.util.Arrays;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awstest.services.entity.CustomerEntity;
import com.awstest.services.entity.repository.CustomerRepository;
import com.awstest.services.entity.service.CustomerService;
import com.awstest.services.model.CustomerCreationRequest;
import com.awstest.services.model.CustomerDetailsResponse;
import com.awstest.services.model.CustomerType;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Override
	public CustomerDetailsResponse getCustomerDetailsbyid(long customerID) {
		logger.info("fetching customer details by ID {}", customerID);

		Optional<CustomerEntity> optCustomerEntity = customerRepository.findById(customerID);

		if (optCustomerEntity.isPresent()) {
			CustomerDetailsResponse customerDetailsResponse = new CustomerDetailsResponse();
			CustomerEntity customerEntity = optCustomerEntity.get();
			customerDetailsResponse.setId(customerEntity.getId());
			customerDetailsResponse.setCompanyName(Arrays.asList(customerEntity.getCompanyname()));
			customerDetailsResponse.setContactEmail(Arrays.asList(customerEntity.getUniquecustomerid()));
			customerDetailsResponse.setContactNumber(Arrays.asList(customerEntity.getVersion()));
			customerDetailsResponse.setCustomerUUID(Arrays.asList(customerEntity.getHsmuserid()));
			customerDetailsResponse.setHsmUserId(Arrays.asList(customerEntity.getHsmuserid()));
			customerDetailsResponse.setPublicKeyConfirmed(Arrays.asList(new Boolean(true)));
			customerDetailsResponse.setType(Arrays.asList(CustomerType.LARGE));
			return customerDetailsResponse;
		}

		return null;
	}

	@Override
	public CustomerDetailsResponse createCustomer(CustomerCreationRequest customerCreationRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public CustomerDetailsResponse
	 * createCustomer(CustomerCreationRequest customerCreationRequest) {
	 * CustomerEntity custEntity = customerRepository
	 * .save(CustomerMapper.INSTANCE.customerCreationRequestToEntity(customerInfo));
	 * return CustomerMapper.INSTANCE.customerEntityToDetails(custEntity); }
	 */

	// TODO: will get customer info based on the user id public
	/*
	 * List<CustomerDetailsResponse> findCustomersInfo(CustomerInfo customerInfo)
	 * throws Exception { logger.info("Finding customers for customer: {}",
	 * customerInfo.getCompanyName()); custMgmntBasePathset();
	 * CustomerDetailsResponse details = new CustomerDetailsResponse(); CustomerInfo
	 * custinfo = customermanagmentApi.getAllCustomers().get(0); if
	 * (customermanagmentApi.getApiClient().getStatusCode().equals(HttpStatus.OK)) {
	 * details.setId("999999999");
	 * details.setAccountEmail(custinfo.getAccountEmail());
	 * details.setContactName(custinfo.getContactName()); }
	 * List<CustomerDetailsResponse> listdetails = new ArrayList<>();
	 * listdetails.add(details); return listdetails; }
	 */

}

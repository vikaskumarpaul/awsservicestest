package com.awstest.services.entity.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.awstest.services.openapi.model.CustomerSignupRequest;
import com.awstest.services.openapi.model.UserLoginRequest;
import com.awstest.services.openapi.model.UserSignupRequest;

@Component
public class UserServiceImpl {

	/*
	 * @Value("${usermanagment.path}") private String usermgmpath;
	 */

//	private UserApi usermanagmentApi = new UserApi(new ApiClient());

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	private void userApiBasePathset() { //
//		logger.info("setting up user Managment API base path: {}", usermgmpath); //
//		usermanagmentApi.getApiClient().setBasePath(usermgmpath + "/usermgmt/v1");
	}

	public void loginUser(UserLoginRequest userLoginRequest) throws Exception {
      this.userApiBasePathset(); 
//      Long.parseLong(userLoginRequest.getUsername(), userLoginRequest); 
      }

	public UserSignupRequest signUpUser(CustomerSignupRequest userSignupRequest) throws Exception {
		userApiBasePathset();
		/*
		 * UserInfo userdetails = new UserInfo(); //
		 * userdetails.setCustomerId(signuprequest.getid());
		 * userdetails.setEmail(signuprequest.getEmail());
		 * userdetails.setFullName(signuprequest.getUsername());
		 * userdetails.setPhone("9999999999");
		 */
		logger.info("calling user managment API to create new user for: {}", userSignupRequest.getUsername()); // userdetails
																											// =
		/*
		 * usermanagmentApi.createUser(Long.parseLong(signuprequest.getCustomerid()),
		 * userdetails); // usermgmresp.setUsername(userdetails.getUserid());
		 * usermgmresp.setEmail(userdetails.getEmail()); List<UserRole> role = new
		 * ArrayList<>(); // role.add(UserRole.User); // usermgmresp.setRoles(role);
		 * return usermgmresp;
		 */
		return null;
	}

	public void lastLogin(UserLoginRequest userLoginRequest) throws Exception {
		/*
		 * userApiBasePathset(); long custid = Long.parseLong("1"); UserInfo userdetails
		 * = new UserInfo(); userdetails.setCustomerId("1");
		 * userdetails.setEmail(loginrequest.getUsername());
		 * userdetails.setFullName(loginrequest.getUsername());
		 * userdetails.setPhone("9999999999");
		 * usermanagmentApi.lastLogin(custid,Long.parseLong(loginrequest.getUsername()),
		 * userdetails);
		 */
      }

}

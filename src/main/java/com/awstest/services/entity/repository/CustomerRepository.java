package com.awstest.services.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awstest.services.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

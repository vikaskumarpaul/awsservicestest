package com.awstest.services.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awstest.services.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}

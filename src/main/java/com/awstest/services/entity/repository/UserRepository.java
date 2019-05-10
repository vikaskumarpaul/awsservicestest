package com.awstest.services.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awstest.services.entity.UsersEntity;

public interface UserRepository extends JpaRepository<UsersEntity, Long> {

}

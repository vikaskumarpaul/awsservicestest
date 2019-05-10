package com.awstest.services.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awstest.services.entity.DeviceServiceAssociationEntity;

public interface DeviceServiceAssociationRepository extends JpaRepository<DeviceServiceAssociationEntity, Long> {
	List<DeviceServiceAssociationEntity> findByCustomerId(Long customerId);
}

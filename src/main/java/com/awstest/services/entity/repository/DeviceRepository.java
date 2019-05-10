package com.awstest.services.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awstest.services.entity.DeviceEntity;

public interface DeviceRepository extends JpaRepository<DeviceEntity, Long> {

}

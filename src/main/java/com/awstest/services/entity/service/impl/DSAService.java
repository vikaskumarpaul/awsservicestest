package com.awstest.services.entity.service.impl;

/*import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.awsservices.entity.DeviceServiceAssociationEntity;
import com.test.awsservices.exceptions.ApplicationException;
import com.test.awsservices.exceptions.ApplicationResultCode;
import com.test.awsservices.model.DeviceServiceAssociation;
import com.test.awsservices.repository.DeviceServiceAssociationRepository;
import com.test.awsservices.util.EntityMapper;

@Service*/
public class DSAService
{

    /*
     * @Autowired DeviceServiceAssociationRepository dsaRepo;
     * 
     * private static final Logger logger =
     * LoggerFactory.getLogger(DSAService.class);
     * 
     * public DeviceServiceAssociation createDSA() { DeviceServiceAssociation
     * response = null;
     * 
     * if (newDSA != null) {
     * 
     * DeviceServiceAssociationEntity dsaEntity = new
     * DeviceServiceAssociationEntity(); dsaEntity.setDsaName("TestGroupName");
     * dsaEntity.setCreatedBy("TestCreatedBy"); dsaEntity.setCustomerId(1l);
     * dsaEntity.setLastUpdatedBy("TestLast Updated"); dsaEntity.setServiceId(1l);
     * dsaEntity.setVersion(1l); dsaEntity = dsaRepo.save(dsaEntity); if (dsaEntity
     * != null) { response = new DeviceServiceAssociation();
     * response.setId(dsaEntity.getId());
     * response.setSeviceGroupName(dsaEntity.getDsaName()); } //} return response; }
     * 
     * public List<DeviceServiceAssociation> listDSAByCustomerId(Long customerId)
     * throws ApplicationException { logger.
     * info("Looking for DeviceServiceAssociations for customer {} in DataBase",
     * customerId); List<DeviceServiceAssociationEntity> dsaEntityList =
     * dsaRepo.findByCustomerId(customerId); logger.
     * info("Total number of records fetched form DeviceServiceAssociation DB {}",
     * dsaEntityList.size()); List<DeviceServiceAssociation> dsaList = new
     * ArrayList<>(); dsaEntityList.forEach(deviceServiceEntity -> {
     * dsaList.add(EntityMapper.DSAEntityToDSA(deviceServiceEntity)); });
     * 
     * return dsaList; }
     * 
     *//**
        * Getting Device Service Association details by DSA ID by calling repository
        * 
        * @param customerId
        * @param dsaId
        * @return {@link DeviceServiceAssociation}
        *//*
           * public DeviceServiceAssociation getDSADetailsBydsaid(Long customerId, Long
           * dsaId) throws ApplicationException {
           * logger.info("Looking for DeviceServiceAssociation for dsaID {}", dsaId);
           * DeviceServiceAssociationEntity dsaentity = dsaRepo.findById(dsaId).get(); if
           * (dsaentity == null) { ApplicationException applicationException = new
           * ApplicationException();
           * applicationException.setErrorCode(ApplicationResultCode.GET_NOT_FOUND.getCode
           * ()); applicationException.setDescription(ApplicationResultCode.GET_NOT_FOUND.
           * getDescription()); applicationException.
           * setDetail("Record not found in DeviceServiceAssociation table"); throw
           * applicationException; }
           * 
           * return EntityMapper.DSAEntityToDSA(dsaentity); }
           */

}

package com.awstest.services.entity.mapper;

import java.time.OffsetDateTime;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.awstest.services.entity.CustomerEntity;
import com.awstest.services.openapi.model.CustomerDetailsResponse;

@Mapper
public interface CustomerMapper {

	CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

	@Mappings({

			@Mapping(source = "id", target = "id"),

			@Mapping(source = "companyname", target = "companyName"),

			@Mapping(source = "contactname", target = "contactName"),

			@Mapping(source = "contactemail", target = "contactEmail"),

			@Mapping(source = "publickeyconfirmed", target = "publicKeyConfirmed"),

			@Mapping(source = "uniquecustomerid", target = "customerUUID"),

			@Mapping(source = "hsmuserid", target = "hsmUserId"),

			@Mapping(source = "createdAt", target = "createdAt"),

			@Mapping(source = "updatedAt", target = "updatedAt"),

			@Mapping(source = "version", target = "version"), })
	CustomerDetailsResponse customerEntityToDetails(CustomerEntity customerEntity);

	/*
	 * @Mappings({ @Mapping(source = "companyname", target = "companyname"),
	 * 
	 * @Mapping(source = "contactname", target = "contactname"),
	 * 
	 * @Mapping(source = "contactemail", target = "contactemail"),
	 * 
	 * @Mapping(source = "publicKeyconfirmed", target = "publickeyconfirmed"),
	 * 
	 * @Mapping(source = "uniqueiustomerid", target = "uniquecustomerid"),
	 * 
	 * @Mapping(source = "hsmUserid", target = "hsmuserid") }) CustomerEntity
	 * customerCreationRequestToEntity(CustomerCreationRequest
	 * customerCreationRequest);
	 */

	default String map(OffsetDateTime datetime) {
		return datetime.toString();
	}
}

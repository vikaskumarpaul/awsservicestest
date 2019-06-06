package com.awstest.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DEVICE_SERVICE_ASSOCIATION", schema = "vikas_personal")
@Setter
@Getter
@NoArgsConstructor
public class DeviceServiceAssociationEntity extends AbstractTimestampEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "serviceid", columnDefinition = "BIGINT(50)", nullable = true)
	private Long serviceId;

	@Column(name = "dsa_name", columnDefinition = "VARCHAR(50)", nullable = true)
	private String dsaName;

	@Column(name = "created_by", columnDefinition = "VARCHAR(50)", nullable = true)
	private String createdBy;

	@Column(name = "lastupdated_by", columnDefinition = "VARCHAR(50)", nullable = true)
	private String lastUpdatedBy;

	@Column(name = "customerid", columnDefinition = "BIGINT(50)", nullable = true)
	private Long customerId;
}

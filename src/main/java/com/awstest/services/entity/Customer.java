package com.awstest.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer extends AbstractTimestampEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "companyname", columnDefinition = "VARCHAR(255)", nullable = true)
	private String companyname;

	@Column(name = "contactname", columnDefinition = "VARCHAR(255)", nullable = false)
	private String contactname;

	@Column(name = "contactemail", columnDefinition = "VARCHAR(100)", nullable = false)
	private String contactemail;

	@Column(name = "publickeyconfirmed", columnDefinition = "TINYINT(1)", nullable = false)
	private boolean publickeyconfirmed;

	@Column(name = "uniquecustomerid", columnDefinition = "VARCHAR(255)", nullable = true)
	private String uniquecustomerid;

	@Column(name = "hsmuserid", columnDefinition = "VARCHAR(255)", nullable = true)
	private String hsmuserid;

}

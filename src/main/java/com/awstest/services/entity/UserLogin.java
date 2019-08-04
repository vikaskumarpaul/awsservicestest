package com.awstest.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Table(name = "userlogin")
public class UserLogin extends AbstractTimestampEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "username", columnDefinition = "VARCHAR(100)", nullable = false)
	private String username;

	@Column(name = "password", columnDefinition = "VARCHAR(100)", nullable = false)
	private String password;

}

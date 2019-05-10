package com.awstest.services.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets UserRole
 */
public enum UserRole {

	ADMIN("ADMIN"),

	SUBADMIN("SUBADMIN"),

	USER("USER"),

	DUMMY("DUMMY");

	private String value;

	UserRole(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static UserRole fromValue(String text) {
		for (UserRole b : UserRole.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + text + "'");
	}
}

package com.awstest.services.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets UserType
 */
public enum UserType {

	ADMIN("ADMIN"),

	SUBADMIN("SUBADMIN"),

	USER("USER"),

	DUMMY("DUMMY");

	private String value;

	UserType(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static UserType fromValue(String text) {
		for (UserType b : UserType.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + text + "'");
	}
}

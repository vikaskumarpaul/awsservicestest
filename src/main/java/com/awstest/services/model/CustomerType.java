package com.awstest.services.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CustomerType
 */
public enum CustomerType {

	SMALL("Small"),

	MEDIUM("Medium"),

	LARGE("Large"),

	DUMMY("Dummy");

	private String value;

	CustomerType(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static CustomerType fromValue(String text) {
		for (CustomerType b : CustomerType.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + text + "'");
	}
}

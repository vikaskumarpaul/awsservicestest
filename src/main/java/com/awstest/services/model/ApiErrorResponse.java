package com.awstest.services.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ApiErrorResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-01T20:20:07.541+05:30[Asia/Calcutta]")

public class ApiErrorResponse {
	@JsonProperty("code")
	private Integer code;

	@JsonProperty("type")
	private String type;

	@JsonProperty("message")
	private String message;

	public ApiErrorResponse code(Integer code) {
		this.code = code;
		return this;
	}

	/**
	 * Get code
	 * 
	 * @return code
	 */
	@ApiModelProperty(value = "")

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public ApiErrorResponse type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 */
	@ApiModelProperty(value = "")

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ApiErrorResponse message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Get message
	 * 
	 * @return message
	 */
	@ApiModelProperty(value = "")

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApiErrorResponse apiErrorResponse = (ApiErrorResponse) o;
		return Objects.equals(this.code, apiErrorResponse.code) && Objects.equals(this.type, apiErrorResponse.type)
				&& Objects.equals(this.message, apiErrorResponse.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, type, message);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApiErrorResponse {\n");

		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

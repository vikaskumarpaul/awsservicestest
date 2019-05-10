package com.awstest.services.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CustomerCreationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-01T20:20:07.541+05:30[Asia/Calcutta]")

public class CustomerCreationRequest {
	@JsonProperty("companyName")
	private String companyName;

	@JsonProperty("contactName")
	@Valid
	private List<String> contactName = new ArrayList<>();

	@JsonProperty("contactEmail")
	@Valid
	private List<String> contactEmail = new ArrayList<>();

	@JsonProperty("contactNumber")
	@Valid
	private List<Integer> contactNumber = new ArrayList<>();

	@JsonProperty("type")
	@Valid
	private List<CustomerType> type = new ArrayList<>();

	public CustomerCreationRequest companyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	/**
	 * Name of the Company of the Registering Customer
	 * 
	 * @return companyName
	 */
	@ApiModelProperty(required = true, value = "Name of the Company of the Registering Customer")
	@NotNull

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public CustomerCreationRequest contactName(List<String> contactName) {
		this.contactName = contactName;
		return this;
	}

	public CustomerCreationRequest addContactNameItem(String contactNameItem) {
		this.contactName.add(contactNameItem);
		return this;
	}

	/**
	 * Contact person of thest company
	 * 
	 * @return contactName
	 */
	@ApiModelProperty(required = true, value = "Contact person of thest company")
	@NotNull

	public List<String> getContactName() {
		return contactName;
	}

	public void setContactName(List<String> contactName) {
		this.contactName = contactName;
	}

	public CustomerCreationRequest contactEmail(List<String> contactEmail) {
		this.contactEmail = contactEmail;
		return this;
	}

	public CustomerCreationRequest addContactEmailItem(String contactEmailItem) {
		this.contactEmail.add(contactEmailItem);
		return this;
	}

	/**
	 * Company Contact Email
	 * 
	 * @return contactEmail
	 */
	@ApiModelProperty(required = true, value = "Company Contact Email")
	@NotNull

	public List<String> getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(List<String> contactEmail) {
		this.contactEmail = contactEmail;
	}

	public CustomerCreationRequest contactNumber(List<Integer> contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	public CustomerCreationRequest addContactNumberItem(Integer contactNumberItem) {
		this.contactNumber.add(contactNumberItem);
		return this;
	}

	/**
	 * Contact number of the customer
	 * 
	 * @return contactNumber
	 */
	@ApiModelProperty(required = true, value = "Contact number of the customer")
	@NotNull

	public List<Integer> getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(List<Integer> contactNumber) {
		this.contactNumber = contactNumber;
	}

	public CustomerCreationRequest type(List<CustomerType> type) {
		this.type = type;
		return this;
	}

	public CustomerCreationRequest addTypeItem(CustomerType typeItem) {
		this.type.add(typeItem);
		return this;
	}

	/**
	 * Type of Customer
	 * 
	 * @return type
	 */
	@ApiModelProperty(required = true, value = "Type of Customer")
	@NotNull

	@Valid

	public List<CustomerType> getType() {
		return type;
	}

	public void setType(List<CustomerType> type) {
		this.type = type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomerCreationRequest customerCreationRequest = (CustomerCreationRequest) o;
		return Objects.equals(this.companyName, customerCreationRequest.companyName)
				&& Objects.equals(this.contactName, customerCreationRequest.contactName)
				&& Objects.equals(this.contactEmail, customerCreationRequest.contactEmail)
				&& Objects.equals(this.contactNumber, customerCreationRequest.contactNumber)
				&& Objects.equals(this.type, customerCreationRequest.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(companyName, contactName, contactEmail, contactNumber, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomerCreationRequest {\n");

		sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
		sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
		sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
		sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

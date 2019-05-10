package com.awstest.services.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-01T20:20:07.541+05:30[Asia/Calcutta]")

public class CreateUserRequest {
	@JsonProperty("customerUUID")
	@Valid
	private List<String> customerUUID = new ArrayList<>();

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
	private List<UserType> type = new ArrayList<>();

	@JsonProperty("role")
	@Valid
	private List<UserRole> role = new ArrayList<>();

	public CreateUserRequest customerUUID(List<String> customerUUID) {
		this.customerUUID = customerUUID;
		return this;
	}

	public CreateUserRequest addCustomerUUIDItem(String customerUUIDItem) {
		this.customerUUID.add(customerUUIDItem);
		return this;
	}

	/**
	 * CustomerID of the Registering Customer
	 * 
	 * @return customerUUID
	 */
	@ApiModelProperty(required = true, value = "CustomerID of the Registering Customer")
	@NotNull

	public List<String> getCustomerUUID() {
		return customerUUID;
	}

	public void setCustomerUUID(List<String> customerUUID) {
		this.customerUUID = customerUUID;
	}

	public CreateUserRequest contactName(List<String> contactName) {
		this.contactName = contactName;
		return this;
	}

	public CreateUserRequest addContactNameItem(String contactNameItem) {
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

	public CreateUserRequest contactEmail(List<String> contactEmail) {
		this.contactEmail = contactEmail;
		return this;
	}

	public CreateUserRequest addContactEmailItem(String contactEmailItem) {
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

	public CreateUserRequest contactNumber(List<Integer> contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	public CreateUserRequest addContactNumberItem(Integer contactNumberItem) {
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

	public CreateUserRequest type(List<UserType> type) {
		this.type = type;
		return this;
	}

	public CreateUserRequest addTypeItem(UserType typeItem) {
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

	public List<UserType> getType() {
		return type;
	}

	public void setType(List<UserType> type) {
		this.type = type;
	}

	public CreateUserRequest role(List<UserRole> role) {
		this.role = role;
		return this;
	}

	public CreateUserRequest addRoleItem(UserRole roleItem) {
		this.role.add(roleItem);
		return this;
	}

	/**
	 * USer Role
	 * 
	 * @return role
	 */
	@ApiModelProperty(required = true, value = "USer Role")
	@NotNull

	@Valid

	public List<UserRole> getRole() {
		return role;
	}

	public void setRole(List<UserRole> role) {
		this.role = role;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreateUserRequest createUserRequest = (CreateUserRequest) o;
		return Objects.equals(this.customerUUID, createUserRequest.customerUUID)
				&& Objects.equals(this.contactName, createUserRequest.contactName)
				&& Objects.equals(this.contactEmail, createUserRequest.contactEmail)
				&& Objects.equals(this.contactNumber, createUserRequest.contactNumber)
				&& Objects.equals(this.type, createUserRequest.type)
				&& Objects.equals(this.role, createUserRequest.role);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerUUID, contactName, contactEmail, contactNumber, type, role);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateUserRequest {\n");

		sb.append("    customerUUID: ").append(toIndentedString(customerUUID)).append("\n");
		sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
		sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
		sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

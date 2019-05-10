package com.awstest.services.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Userdetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-01T20:20:07.541+05:30[Asia/Calcutta]")

public class Userdetails {
	@JsonProperty("id")
	private Long id;

	@JsonProperty("customerUUID")
	@Valid
	private List<String> customerUUID = null;

	@JsonProperty("ContactName")
	@Valid
	private List<String> contactName = null;

	@JsonProperty("ContactEmail")
	@Valid
	private List<String> contactEmail = null;

	@JsonProperty("ContactNumber")
	@Valid
	private List<Integer> contactNumber = null;

	@JsonProperty("Type")
	@Valid
	private List<UserType> type = null;

	@JsonProperty("Role")
	@Valid
	private List<UserRole> role = null;

	public Userdetails id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 */
	@ApiModelProperty(value = "")

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Userdetails customerUUID(List<String> customerUUID) {
		this.customerUUID = customerUUID;
		return this;
	}

	public Userdetails addCustomerUUIDItem(String customerUUIDItem) {
		if (this.customerUUID == null) {
			this.customerUUID = new ArrayList<>();
		}
		this.customerUUID.add(customerUUIDItem);
		return this;
	}

	/**
	 * CustomerID of the Registering Customer
	 * 
	 * @return customerUUID
	 */
	@ApiModelProperty(value = "CustomerID of the Registering Customer")

	public List<String> getCustomerUUID() {
		return customerUUID;
	}

	public void setCustomerUUID(List<String> customerUUID) {
		this.customerUUID = customerUUID;
	}

	public Userdetails contactName(List<String> contactName) {
		this.contactName = contactName;
		return this;
	}

	public Userdetails addContactNameItem(String contactNameItem) {
		if (this.contactName == null) {
			this.contactName = new ArrayList<>();
		}
		this.contactName.add(contactNameItem);
		return this;
	}

	/**
	 * Contact person of thest company
	 * 
	 * @return contactName
	 */
	@ApiModelProperty(value = "Contact person of thest company")

	public List<String> getContactName() {
		return contactName;
	}

	public void setContactName(List<String> contactName) {
		this.contactName = contactName;
	}

	public Userdetails contactEmail(List<String> contactEmail) {
		this.contactEmail = contactEmail;
		return this;
	}

	public Userdetails addContactEmailItem(String contactEmailItem) {
		if (this.contactEmail == null) {
			this.contactEmail = new ArrayList<>();
		}
		this.contactEmail.add(contactEmailItem);
		return this;
	}

	/**
	 * Company Contact Email
	 * 
	 * @return contactEmail
	 */
	@ApiModelProperty(value = "Company Contact Email")

	public List<String> getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(List<String> contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Userdetails contactNumber(List<Integer> contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	public Userdetails addContactNumberItem(Integer contactNumberItem) {
		if (this.contactNumber == null) {
			this.contactNumber = new ArrayList<>();
		}
		this.contactNumber.add(contactNumberItem);
		return this;
	}

	/**
	 * Contact number of the customer
	 * 
	 * @return contactNumber
	 */
	@ApiModelProperty(value = "Contact number of the customer")

	public List<Integer> getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(List<Integer> contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Userdetails type(List<UserType> type) {
		this.type = type;
		return this;
	}

	public Userdetails addTypeItem(UserType typeItem) {
		if (this.type == null) {
			this.type = new ArrayList<>();
		}
		this.type.add(typeItem);
		return this;
	}

	/**
	 * Type of Customer
	 * 
	 * @return type
	 */
	@ApiModelProperty(value = "Type of Customer")

	@Valid

	public List<UserType> getType() {
		return type;
	}

	public void setType(List<UserType> type) {
		this.type = type;
	}

	public Userdetails role(List<UserRole> role) {
		this.role = role;
		return this;
	}

	public Userdetails addRoleItem(UserRole roleItem) {
		if (this.role == null) {
			this.role = new ArrayList<>();
		}
		this.role.add(roleItem);
		return this;
	}

	/**
	 * USer Role
	 * 
	 * @return role
	 */
	@ApiModelProperty(value = "USer Role")

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
		Userdetails userdetails = (Userdetails) o;
		return Objects.equals(this.id, userdetails.id) && Objects.equals(this.customerUUID, userdetails.customerUUID)
				&& Objects.equals(this.contactName, userdetails.contactName)
				&& Objects.equals(this.contactEmail, userdetails.contactEmail)
				&& Objects.equals(this.contactNumber, userdetails.contactNumber)
				&& Objects.equals(this.type, userdetails.type) && Objects.equals(this.role, userdetails.role);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, customerUUID, contactName, contactEmail, contactNumber, type, role);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Userdetails {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

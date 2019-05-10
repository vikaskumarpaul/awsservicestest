package com.awstest.services.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CustomerDetailsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-01T20:20:07.541+05:30[Asia/Calcutta]")

public class CustomerDetailsResponse {
	@JsonProperty("id")
	private Long id;

	@JsonProperty("companyName")
	@Valid
	private List<String> companyName = null;

	@JsonProperty("contactName")
	@Valid
	private List<String> contactName = null;

	@JsonProperty("contactEmail")
	@Valid
	private List<String> contactEmail = null;

	@JsonProperty("contactNumber")
	@Valid
	private List<Integer> contactNumber = null;

	@JsonProperty("type")
	@Valid
	private List<CustomerType> type = null;

	@JsonProperty("hsmUserId")
	@Valid
	private List<String> hsmUserId = null;

	@JsonProperty("publicKeyConfirmed")
	@Valid
	private List<Boolean> publicKeyConfirmed = null;

	@JsonProperty("customerUUID")
	@Valid
	private List<String> customerUUID = null;

	public CustomerDetailsResponse id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * id of the customer
	 * 
	 * @return id
	 */
	@ApiModelProperty(value = "id of the customer")

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CustomerDetailsResponse companyName(List<String> companyName) {
		this.companyName = companyName;
		return this;
	}

	public CustomerDetailsResponse addCompanyNameItem(String companyNameItem) {
		if (this.companyName == null) {
			this.companyName = new ArrayList<>();
		}
		this.companyName.add(companyNameItem);
		return this;
	}

	/**
	 * Name of the Company of the Registering Customer
	 * 
	 * @return companyName
	 */
	@ApiModelProperty(value = "Name of the Company of the Registering Customer")

	public List<String> getCompanyName() {
		return companyName;
	}

	public void setCompanyName(List<String> companyName) {
		this.companyName = companyName;
	}

	public CustomerDetailsResponse contactName(List<String> contactName) {
		this.contactName = contactName;
		return this;
	}

	public CustomerDetailsResponse addContactNameItem(String contactNameItem) {
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

	public CustomerDetailsResponse contactEmail(List<String> contactEmail) {
		this.contactEmail = contactEmail;
		return this;
	}

	public CustomerDetailsResponse addContactEmailItem(String contactEmailItem) {
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

	public CustomerDetailsResponse contactNumber(List<Integer> contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	public CustomerDetailsResponse addContactNumberItem(Integer contactNumberItem) {
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

	public CustomerDetailsResponse type(List<CustomerType> type) {
		this.type = type;
		return this;
	}

	public CustomerDetailsResponse addTypeItem(CustomerType typeItem) {
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

	public List<CustomerType> getType() {
		return type;
	}

	public void setType(List<CustomerType> type) {
		this.type = type;
	}

	public CustomerDetailsResponse hsmUserId(List<String> hsmUserId) {
		this.hsmUserId = hsmUserId;
		return this;
	}

	public CustomerDetailsResponse addHsmUserIdItem(String hsmUserIdItem) {
		if (this.hsmUserId == null) {
			this.hsmUserId = new ArrayList<>();
		}
		this.hsmUserId.add(hsmUserIdItem);
		return this;
	}

	/**
	 * Hsm Customer ID
	 * 
	 * @return hsmUserId
	 */
	@ApiModelProperty(value = "Hsm Customer ID")

	public List<String> getHsmUserId() {
		return hsmUserId;
	}

	public void setHsmUserId(List<String> hsmUserId) {
		this.hsmUserId = hsmUserId;
	}

	public CustomerDetailsResponse publicKeyConfirmed(List<Boolean> publicKeyConfirmed) {
		this.publicKeyConfirmed = publicKeyConfirmed;
		return this;
	}

	public CustomerDetailsResponse addPublicKeyConfirmedItem(Boolean publicKeyConfirmedItem) {
		if (this.publicKeyConfirmed == null) {
			this.publicKeyConfirmed = new ArrayList<>();
		}
		this.publicKeyConfirmed.add(publicKeyConfirmedItem);
		return this;
	}

	/**
	 * Public Key Confirmed
	 * 
	 * @return publicKeyConfirmed
	 */
	@ApiModelProperty(value = "Public Key Confirmed")

	public List<Boolean> getPublicKeyConfirmed() {
		return publicKeyConfirmed;
	}

	public void setPublicKeyConfirmed(List<Boolean> publicKeyConfirmed) {
		this.publicKeyConfirmed = publicKeyConfirmed;
	}

	public CustomerDetailsResponse customerUUID(List<String> customerUUID) {
		this.customerUUID = customerUUID;
		return this;
	}

	public CustomerDetailsResponse addCustomerUUIDItem(String customerUUIDItem) {
		if (this.customerUUID == null) {
			this.customerUUID = new ArrayList<>();
		}
		this.customerUUID.add(customerUUIDItem);
		return this;
	}

	/**
	 * Customer UUID
	 * 
	 * @return customerUUID
	 */
	@ApiModelProperty(value = "Customer UUID")

	public List<String> getCustomerUUID() {
		return customerUUID;
	}

	public void setCustomerUUID(List<String> customerUUID) {
		this.customerUUID = customerUUID;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomerDetailsResponse customerDetailsResponse = (CustomerDetailsResponse) o;
		return Objects.equals(this.id, customerDetailsResponse.id)
				&& Objects.equals(this.companyName, customerDetailsResponse.companyName)
				&& Objects.equals(this.contactName, customerDetailsResponse.contactName)
				&& Objects.equals(this.contactEmail, customerDetailsResponse.contactEmail)
				&& Objects.equals(this.contactNumber, customerDetailsResponse.contactNumber)
				&& Objects.equals(this.type, customerDetailsResponse.type)
				&& Objects.equals(this.hsmUserId, customerDetailsResponse.hsmUserId)
				&& Objects.equals(this.publicKeyConfirmed, customerDetailsResponse.publicKeyConfirmed)
				&& Objects.equals(this.customerUUID, customerDetailsResponse.customerUUID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, companyName, contactName, contactEmail, contactNumber, type, hsmUserId,
				publicKeyConfirmed, customerUUID);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomerDetailsResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
		sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
		sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
		sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    hsmUserId: ").append(toIndentedString(hsmUserId)).append("\n");
		sb.append("    publicKeyConfirmed: ").append(toIndentedString(publicKeyConfirmed)).append("\n");
		sb.append("    customerUUID: ").append(toIndentedString(customerUUID)).append("\n");
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

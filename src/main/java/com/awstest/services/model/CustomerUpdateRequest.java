package com.awstest.services.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CustomerUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-01T20:20:07.541+05:30[Asia/Calcutta]")

public class CustomerUpdateRequest {
	@JsonProperty("id")
	private Integer id;

	@JsonProperty("companyName")
	@Valid
	private List<String> companyName = new ArrayList<>();

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

	@JsonProperty("hsmUserId")
	@Valid
	private List<String> hsmUserId = null;

	@JsonProperty("publicKeyConfirmed")
	@Valid
	private List<Boolean> publicKeyConfirmed = null;

	@JsonProperty("customerUUID")
	@Valid
	private List<String> customerUUID = null;

	public CustomerUpdateRequest id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * id of the customer
	 * 
	 * @return id
	 */
	@ApiModelProperty(required = true, value = "id of the customer")
	@NotNull

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CustomerUpdateRequest companyName(List<String> companyName) {
		this.companyName = companyName;
		return this;
	}

	public CustomerUpdateRequest addCompanyNameItem(String companyNameItem) {
		this.companyName.add(companyNameItem);
		return this;
	}

	/**
	 * Name of the Company of the Registering Customer
	 * 
	 * @return companyName
	 */
	@ApiModelProperty(required = true, value = "Name of the Company of the Registering Customer")
	@NotNull

	public List<String> getCompanyName() {
		return companyName;
	}

	public void setCompanyName(List<String> companyName) {
		this.companyName = companyName;
	}

	public CustomerUpdateRequest contactName(List<String> contactName) {
		this.contactName = contactName;
		return this;
	}

	public CustomerUpdateRequest addContactNameItem(String contactNameItem) {
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

	public CustomerUpdateRequest contactEmail(List<String> contactEmail) {
		this.contactEmail = contactEmail;
		return this;
	}

	public CustomerUpdateRequest addContactEmailItem(String contactEmailItem) {
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

	public CustomerUpdateRequest contactNumber(List<Integer> contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	public CustomerUpdateRequest addContactNumberItem(Integer contactNumberItem) {
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

	public CustomerUpdateRequest type(List<CustomerType> type) {
		this.type = type;
		return this;
	}

	public CustomerUpdateRequest addTypeItem(CustomerType typeItem) {
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

	public CustomerUpdateRequest hsmUserId(List<String> hsmUserId) {
		this.hsmUserId = hsmUserId;
		return this;
	}

	public CustomerUpdateRequest addHsmUserIdItem(String hsmUserIdItem) {
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

	public CustomerUpdateRequest publicKeyConfirmed(List<Boolean> publicKeyConfirmed) {
		this.publicKeyConfirmed = publicKeyConfirmed;
		return this;
	}

	public CustomerUpdateRequest addPublicKeyConfirmedItem(Boolean publicKeyConfirmedItem) {
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

	public CustomerUpdateRequest customerUUID(List<String> customerUUID) {
		this.customerUUID = customerUUID;
		return this;
	}

	public CustomerUpdateRequest addCustomerUUIDItem(String customerUUIDItem) {
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
		CustomerUpdateRequest customerUpdateRequest = (CustomerUpdateRequest) o;
		return Objects.equals(this.id, customerUpdateRequest.id)
				&& Objects.equals(this.companyName, customerUpdateRequest.companyName)
				&& Objects.equals(this.contactName, customerUpdateRequest.contactName)
				&& Objects.equals(this.contactEmail, customerUpdateRequest.contactEmail)
				&& Objects.equals(this.contactNumber, customerUpdateRequest.contactNumber)
				&& Objects.equals(this.type, customerUpdateRequest.type)
				&& Objects.equals(this.hsmUserId, customerUpdateRequest.hsmUserId)
				&& Objects.equals(this.publicKeyConfirmed, customerUpdateRequest.publicKeyConfirmed)
				&& Objects.equals(this.customerUUID, customerUpdateRequest.customerUUID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, companyName, contactName, contactEmail, contactNumber, type, hsmUserId,
				publicKeyConfirmed, customerUUID);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomerUpdateRequest {\n");

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

package com.automobile.customer;

public class Customer {
	private String customerId;
	private String customerName;
	private String phoneNumber;
	private String email;
	
	public Customer(String customerId, String customerName, String phoneNumber, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}

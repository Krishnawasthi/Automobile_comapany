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
	
	// Register Customer
	public void registerCustomer() {
	    System.out.println(customerName + " has been registered successfully.");
	}

	// Login
	public void login() {
	    System.out.println(customerName + " logged into the system.");
	}

	// Logout
	public void logout() {
	    System.out.println(customerName + " logged out successfully.");
	}

	// Place Order
	public void placeOrder() {
	    System.out.println(customerName + " placed a new vehicle order.");
	}

	// Cancel Order
	public void cancelOrder() {
	    System.out.println(customerName + " cancelled the order.");
	}

	// View Order History
	public void viewOrderHistory() {
	    System.out.println("Displaying order history of " + customerName + ".");
	}

	// Display Customer Details
	public void displayCustomerDetails() {
	    System.out.println("Customer ID : " + customerId);
	    System.out.println("Customer Name : " + customerName);
	    System.out.println("Phone Number : " + phoneNumber);
	    System.out.println("Email : " + email);
	}
	
}

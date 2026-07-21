package com.automobile.order;
import com.automobile.customer.Customer;
import com.automobile.vehicle.Vehicle;

public class Order {
	private String orderId;
	private String orderDate;
	private double totalAmount;
	private String orderStatus;
	
	//HAS - A with Customer
	
	private Customer customer;
	
	//HAS - A with Vehicle
	
	private Vehicle vehicle;
	
	
	public Order(String orderId, String orderDate, double totalAmount, String orderStatus, Customer customer, Vehicle vehicle) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		this.orderStatus = orderStatus;
		this.customer = customer;
		this.vehicle = vehicle;
	}


	public Vehicle getVehicle() {
		return vehicle;
	}


	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
	// Confirm Order
	public void confirmOrder() {
	    System.out.println("Order " + orderId + " has been confirmed.");
	}

	// Cancel Order
	public void cancelOrder() {
	    System.out.println("Order " + orderId + " has been cancelled.");
	}

	// Update Order Status
	public void updateOrderStatus() {
	    System.out.println("Order status updated to: " + orderStatus);
	}

	// Calculate Total Amount
	public void calculateTotalAmount() {
	    System.out.println("Total amount to be paid: ₹" + totalAmount);
	}

	// Display Order Details
	public void displayOrderDetails() {
	    System.out.println("Order ID : " + orderId);
	    System.out.println("Order Date : " + orderDate);
	    System.out.println("Order Status : " + orderStatus);
	    System.out.println("Total Amount : ₹" + totalAmount);
	}
	
}

package com.automobile.vehicle;

public class Vehicle {
	         
   String vehicleId;
   String vehicleName;
   String model;
   String type;
   double price;
   String color;
   String manufacturingDate;
   String status;            // In Production, Ready, Sold
   
   public Vehicle(String vehicleId, String vehicleName, String model, String type, double price, String color, String manufacturingDate, String status){
	   
	   this.vehicleId = vehicleId;
	   this.vehicleName = vehicleName;
	   this.model = model;
	   this.type = type; 
	   this.price = price;
	   this.color = color;
	   this.manufacturingDate = manufacturingDate;
	   this.status =  status;      
	   
	   
   }

   public String getVehicleId() {
	return vehicleId;
   }

   public void setVehicleId(String vehicleId) {
	this.vehicleId = vehicleId;
   }

   public String getVehicleName() {
	return vehicleName;
   }

   public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
   }

   public String getModel() {
	return model;
   }

   public void setModel(String model) {
	this.model = model;
   }

   public String getType() {
	return type;
   }

   public void setType(String type) {
	this.type = type;
   }

   public double getPrice() {
	return price;
   }

   public void setPrice(double price) {
	this.price = price;
   }

   public String getColor() {
	return color;
   }

   public void setColor(String color) {
	this.color = color;
   }

   public String getManufacturingDate() {
	return manufacturingDate;
   }

   public void setManufacturingDate(String manufacturingDate) {
	this.manufacturingDate = manufacturingDate;
   }

   public String getStatus() {
	return status;
   }

   public void setStatus(String status) {
	this.status = status;
   }
   
}

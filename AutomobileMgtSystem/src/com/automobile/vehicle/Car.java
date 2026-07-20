package com.automobile.vehicle;

public class Car extends Vehicle{
	int numberOfDoors;
	String fuelType;
	String transmission;
	
	public Car(String vehicleId, String vehicleName, String model, String type, double price, 
	    		String color, 
	    		String manufacturingDate,
	    		String status,
	    		int numberOfDoors,
		        String fuelType,
		        String transmission){
	 	   
	       super(vehicleId, vehicleName,model,type,price,color,manufacturingDate, status);
	       
	 	   this.numberOfDoors = numberOfDoors;
	 	   this.fuelType      = fuelType;
	 	   this.transmission  = transmission;
    }

	 public int getNumberOfDoors() {
		 return numberOfDoors;
	 }

	 public void setNumberOfDoors(int numberOfDoors) {
		 this.numberOfDoors = numberOfDoors;
	 }

	 public String getFuelType() {
		 return fuelType;
	 }

	 public void setFuelType(String fuelType) {
		 this.fuelType = fuelType;
	 }

	 public String getTransmission() {
		 return transmission;
	 }

	 public void setTransmission(String transmission) {
		 this.transmission = transmission;
	 }
	 
	 
	 
}

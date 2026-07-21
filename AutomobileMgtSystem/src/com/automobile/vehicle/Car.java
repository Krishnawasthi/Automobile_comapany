package com.automobile.vehicle;

public class Car extends Vehicle{
	  private int numberOfDoors;
	  private String fuelType;
	  private String transmission;
	
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
	 //methods
	 @Override
	 public void startEngine() {
		 System.out.println("start the car");
	 }
	 public void drive() {
		 System.out.println("lets drive the car");
	 }
		 
	 public void applyBrake() {
		 System.out.println("traffic aheads lets break");
	 }
	 
	 public void displayVehicleDetails()
	 {
		 super.displayVehicleDetails();
		 System.out.println("Number of Doors : " + numberOfDoors);
		 System.out.println("Fuel Type : " + fuelType);
		 System.out.println("Transmission : " + transmission);
		 
	 }
	
	 
	 
	 
}

package com.automobile.vehicle;

public class ElectricCar extends Car {
	  private String batteryCapacity;
	  private int   chargingTime;
	  private int   range;
     
    public  ElectricCar(String vehicleId, String vehicleName, String model, String type, double price, 
	    		String color, 
	    		String manufacturingDate,
	    		String status,String batteryCapacity,
                int   chargingTime,
                int  range,
                int numberOfDoors,
		        String fuelType,
		       String transmission){
	 	   
	       super(vehicleId, vehicleName,model,type,price,color,manufacturingDate, status, numberOfDoors, fuelType, transmission);
	       
	 	   this.batteryCapacity = batteryCapacity;
	 	   this.chargingTime  = chargingTime;
	 	   this.range = range;
	 	   
	    }

	 public String getBatteryCapacity() {
		 return batteryCapacity;
	 }

	 public void setBatteryCapacity(String batteryCapacity) {
		 this.batteryCapacity = batteryCapacity;
	 }

	 public int getChargingTime() {
		 return chargingTime;
	 }

	 public void setChargingTime(int chargingTime) {
		 this.chargingTime = chargingTime;
	 }

	 public int getRange() {
		 return range;
	 }

	 public void setRange(int range) {
		 this.range = range;
	 }
     //methods
	 @Override
	 public void startEngine() {
		System.out.println("Electric car started Silently");
	 }
	 @Override
	 public void displayVehicleDetails() {
		 
		super.displayVehicleDetails(); 
		
		System.out.println("Battery Capacity : " + batteryCapacity);
		System.out.println("Charging Time : " + chargingTime + " hours");
		System.out.println("Range : " + range + " km");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

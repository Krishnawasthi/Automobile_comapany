package com.automobile.vehicle;

public class ElectricCar extends Vehicle {
    String batteryCapacity;
     int   chargingTime;
     int  range;
     
    public  ElectricCar(String vehicleId, String vehicleName, String model, String type, double price, 
	    		String color, 
	    		String manufacturingDate,
	    		String status,String batteryCapacity,
                int   chargingTime,
                int  range){
	 	   
	       super(vehicleId, vehicleName,model,type,price,color,manufacturingDate, status);
	       
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
     
}

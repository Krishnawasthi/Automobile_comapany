package com.automobile.vehicle;

	public class SUV extends Vehicle {

	    double groundClearance;   // in mm or cm
	    boolean fourWheelDrive;   // true = 4WD, false = 2WD
	    int seatingCapacity;   // 5, 7, 8 person
	    
	   public  SUV(String vehicleId, String vehicleName, String model, String type, double price, 
	    		String color, 
	    		String manufacturingDate,
	    		String status,double groundClearance,  
	            boolean fourWheelDrive,
	            int seatingCapacity){
	 	   
	       super(vehicleId, vehicleName,model,type,price,color,manufacturingDate, status);
	 	   this.groundClearance = groundClearance;
	 	   this.fourWheelDrive  = fourWheelDrive;
	 	   this.seatingCapacity = seatingCapacity;   
	    }

		public double getGroundClearance() {
			return groundClearance;
		}

		public void setGroundClearance(double groundClearance) {
			this.groundClearance = groundClearance;
		}

		public boolean isFourWheelDrive() {
			return fourWheelDrive;
		}

		public void setFourWheelDrive(boolean fourWheelDrive) {
			this.fourWheelDrive = fourWheelDrive;
		}

		public int getSeatingCapacity() {
			return seatingCapacity;
		}

		public void setSeatingCapacity(int seatingCapacity) {
			this.seatingCapacity = seatingCapacity;
		}
	    
	}


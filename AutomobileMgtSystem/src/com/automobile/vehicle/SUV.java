package com.automobile.vehicle;

	public class SUV extends Car {

		  private double groundClearance;   // in mm or cm
		  private boolean fourWheelDrive;   // true = 4WD, false = 2WD
		  private int seatingCapacity;   // 5, 7, 8 person
	    
	   public  SUV(String vehicleId, String vehicleName, String model, String type, double price, 
	    		String color, 
	    		String manufacturingDate,
	    		String status,
	    		double groundClearance,  
	            boolean fourWheelDrive,
	            int seatingCapacity,
	            int numberOfDoors,
		        String fuelType,
		       String transmission){
	 	   
	       super(vehicleId, vehicleName,model,type,price,color,manufacturingDate, status, numberOfDoors,  fuelType, transmission);
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
		
		//methods
		@Override
		public void startEngine()
		{
		    System.out.println("SUV engine started. Ready for off-road driving.");
		}
		public void enableFourWheelDrive()
		{
		System.out.println("Enable the supports of  FourWheelDrive ");
		}
		public void disableFourWheelDrive(){
			System.out.println("Disable the supports of  FourWheelDrive ");
		}
		
		@Override
		public void displayVehicleDetails() {
			super.displayVehicleDetails();

			    System.out.println("Ground Clearance : " + groundClearance);
			    System.out.println("Four Wheel Drive : " + fourWheelDrive);
			    System.out.println("Seating Capacity : " + seatingCapacity);
			}
		}
	    
	

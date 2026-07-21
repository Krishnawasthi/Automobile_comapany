package com.automobile.main;
import com.automobile.employee.*;
import com.automobile.department.*;
import com.automobile.vehicle.*;
import com.automobile.customer.*;
import com.automobile.order.*;
import com.automobile.company.*;

public class Main
{
 public static void main(String args[]) {
	 
	 Employee emp1 = new Engineers(
		        "E101",
		        "Krishna",
		        50000,
		        "9876543210",
		        "krishna@gmail.com",
		        "Software",
		        "Project Phoenix",
		        "B.Tech",
		        2
		        
		);
	 
	 Employee emp2 = new SalesWorker(
		        "E102",
		        "Rahul",
		        45000,
		        "9999999999",
		        "rahul@gmail.com",
		        100,
		        80,
		        "Delhi"
		); 
	 
	 Employee emp3 = new ProductionWorker(
		        "E103",
		        "Amit",
		        40000,
		        "8888888888",
		        "amit@gmail.com",
		        "Morning",
		        "Machine-12",
		        35
		);
	 
	 Employee emp4 = new DepartmentManager(
		        "E104",
		        "Neha",
		        70000,
		        "7777777777",
		        "neha@gmail.com",
		        "HR",
		        25,
		        15000
		);
	 
	
	 
	 emp1.login();
	 emp1.logout();
	 emp1.work();
	 emp1.displayEmployeeDetails();
	 
	 System.out.println("----------------------------------------------------");
	 
	 emp2.login();
	 emp2.logout();
	 emp2.work();
	 emp2.displayEmployeeDetails();
	 
	 System.out.println("----------------------------------------------------");
	 
	 emp3.login();
	 emp3.logout();
	 emp3.work();
	 emp3.displayEmployeeDetails();
	 
	 System.out.println("----------------------------------------------------");
	 
	 emp4.login();
	 emp4.logout();
	 emp4.work();
	 emp4.displayEmployeeDetails();
	 
	 System.out.println("----------------------------------------------------");
	 
	 
	
	 System.out.println("---------------------Downcasting Employee---------------------");

	// Employee -> Engineers
	Engineers engineer = (Engineers) emp1;
	System.out.println("Specialization : " + engineer.getSpecialization());
	System.out.println("Project Assigned : " + engineer.getProjectAssigned());
	System.out.println("Qualification : " + engineer.getQualification());
	System.out.println("Experience : " + engineer.getYearsOfExperience() + " Years");

	System.out.println();

	// Employee -> SalesWorker
	SalesWorker salesWorker = (SalesWorker) emp2;
	System.out.println("Sales Target : " + salesWorker.getSalesTarget());
	System.out.println("Sales Achieved : " + salesWorker.getSalesAchieved());
	System.out.println("Sales Region : " + salesWorker.getSalesRegion());

	System.out.println();

	// Employee -> ProductionWorker
	ProductionWorker productionWorker = (ProductionWorker) emp3;
	System.out.println("Shift : " + productionWorker.getShift());
	System.out.println("Machine Assigned : " + productionWorker.getMachineAssigned());
	System.out.println("Vehicles Produced : " + productionWorker.getVehiclesProduced());

	System.out.println();

	// Employee -> DepartmentManager
	DepartmentManager manager = (DepartmentManager) emp4;
	System.out.println("Managed Department : " + manager.getManagedDepartment());
	System.out.println("Team Size : " + manager.getTeamSize());
	System.out.println("Bonus : " + manager.getBonus());;
		 
	 System.out.println("----------------------------------------------------");
	 
	 // creating object vehicles 
	 Vehicle vehicle = new Car(
		        "CAR101",
		        "Hyundai i20",
		        "Asta",
		        "Hatchback",
		        950000,
		        "Fiery Red",
		        "14-09-2026",
		        "Ready",
		        4,
		        "Diesel",
		        "Manual"
		);
	 
	 Vehicle vehicle1 = new ElectricCar(
		        "EV101",
		        "Tata Nexon EV",
		        "XZ+",
		        "Electric SUV",
		        1800000,
		        "Blue",
		        "16-09-2026",
		        "Ready to Move",
		        "40 kWh",
		        6,
		        350,
		        4,
		        "Electric",
		        "Automatic"
		);
	 
	 Vehicle vehicle2 = new SUV(
		        "SUV101",
		        "Mahindra Scorpio N",
		        "Z8",
		        "SUV",
		        2200000,
		        "Napoli Black",
		        "15-09-2026",
		        "Ready to Move",
		        210.0,
		        true,
		        7,
		        4,
		        "Diesel",
		        "Manual"
		);
		
	 vehicle.startEngine();
	 vehicle.displayVehicleDetails();

	 System.out.println("----------------------");

	 vehicle1.startEngine();
	 vehicle1.displayVehicleDetails();

	 System.out.println("----------------------");

	 vehicle2.startEngine();
	 vehicle2.displayVehicleDetails();
	 
	 System.out.println("---------------------Downcasting Vehicle---------------------");

	// Vehicle -> Car
	Car car = (Car) vehicle;
	System.out.println("Fuel Type : " + car.getFuelType());
	System.out.println("Transmission : " + car.getTransmission());
	System.out.println("Doors : " + car.getNumberOfDoors());

	System.out.println();

	// Vehicle -> ElectricCar
	ElectricCar electricCar = (ElectricCar) vehicle1;
	System.out.println("Battery Capacity : " + electricCar.getBatteryCapacity());
	System.out.println("Charging Time : " + electricCar.getChargingTime());
	System.out.println("Range : " + electricCar.getRange());

	System.out.println();

	// Vehicle -> SUV
	SUV suv = (SUV) vehicle2;
	System.out.println("Ground Clearance : " + suv.getGroundClearance());
	System.out.println("Four Wheel Drive : " + suv.isFourWheelDrive());
	System.out.println("Seating Capacity : " + suv.getSeatingCapacity());

	suv.enableFourWheelDrive();
	 
 }
 
}

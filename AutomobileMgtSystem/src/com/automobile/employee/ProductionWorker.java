package com.automobile.employee;

public class ProductionWorker extends Employee {
	 private String shift;                // Morning, Evening, Night
	 private String machineAssigned;
	 private int vehiclesProduced;
	
	 
	 //constructors
	public ProductionWorker(String empId, String name,double salary,String phoneNumber,String email)
	{
		
		super(empId, name, salary,phoneNumber,email);
		
	}

	public ProductionWorker(String empId, String name,double salary,String phoneNumber,String email, String shift, String machineAssigned, int vehiclesProduced)
	{
		
		this(empId, name, salary,phoneNumber,email);
		this.shift = shift;
		this.machineAssigned = machineAssigned;
		this.vehiclesProduced = vehiclesProduced;
		
	}
	
//getter and setter methods for shift
	
	
    public String getShift() {
		
		return shift;
	}
	public void setShift(String shift) {
		
		this.shift =  shift;
	}
	
//getter and setter methods for machineAssigned
	
	
    public String getMachineAssigned() {
		
		return machineAssigned;
	}
	public void setMachineAssigned(String machineAssigned) {
		
		this.machineAssigned =  machineAssigned;
	}
	
//getter and setter methods for vehiclesProduced
	
	
    public int getVehiclesProduced() {
		
		return vehiclesProduced;
	}
	public void setVehiclesProduced(int vehiclesProduced) {
		
		this.vehiclesProduced =  vehiclesProduced;
	}
	
	//methods are here
	
	public void assembleVehicle() 
	{
		System.out.println(getName() + " is aassembling vehicles. ");
	}
	
	public void inspectVehicle()
	{
		System.out.println(getName() + " is inspecting vehicles. ");
	}
	@Override
	public void work()
	{
	    System.out.println(getName() + " is assembling and inspecting vehicles.");
	}
	
	
	
}

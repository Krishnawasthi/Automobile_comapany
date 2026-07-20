package com.automobile.employee;

public class SalesWorker extends Employee{
	private double salesTarget;
	private double salesAchieved;
	private String salesRegion;
	
	//constructor
	public SalesWorker(String empId, String name,double salary,String phoneNumber,String email)
	{
		
		super(empId, name, salary,phoneNumber,email);
		
	}
	
	public SalesWorker(String empId, String name,double salary,String phoneNumber,String email, double salesTarget,double salesAchieved, String salesRegion)
	{
		
		this(empId, name, salary,phoneNumber,email);
		this.salesTarget = salesTarget;
		this.salesAchieved =salesAchieved;
		this.salesRegion = salesRegion;
		
	}
	
	//getter and setter methods for salesTarget
	
	
    public double getSalesTarget() {
		
		return salesTarget;
	}
	public void setSalesTarget(double salesTarget) {
		
		this.salesTarget =  salesTarget;
	}
	
	//getter and setter methods for salesAchieved
	
	
    public double getSalesAchieved() {
		
		return salesAchieved;
	}
	public void setSalesAchieved(double salesAchieved) {
		if(salesAchieved >= 0) {
		this.salesAchieved =  salesAchieved;
		}
	}
	
	
//getter and setter methods for salesAchieved
	
	
    public String getSalesRegion() {
		
		return salesRegion;
	}
	public void setSalesRegion(String salesRegion) {
		
		this.salesRegion =  salesRegion;
	}
	
	
}

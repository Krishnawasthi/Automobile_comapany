package com.automobile.employee;

public class DepartmentManager extends Employee {
	private String managedDepartment;
	private int    teamSize;
	private double bonus;
	
	public DepartmentManager(String empId, String name,double salary,String phoneNumber,String email)
	{
		
		super(empId, name, salary,phoneNumber,email);
		
	}
	
	public DepartmentManager(String empId, String name,double salary,String phoneNumber,String email, String managedDepartment, int teamSize, double bonus)
	{
		
		this(empId, name, salary,phoneNumber,email);
		this. managedDepartment =  managedDepartment;
		this.teamSize =teamSize;
		this.bonus = bonus;
		
	}
	
//getter and setter methods for managedDepartment
	
	
    public String getManagedDepartment() {
		
		return managedDepartment;
	}
	public void setManagedDepartment(String  managedDepartment) {
		
		this.managedDepartment =  managedDepartment;
	}
	
//getter and setter methods for teamSize
	
	
    public int getTeamSize() {
		
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		
		this.teamSize =  teamSize;
	}
	
//getter and setter methods for bonus
	
	
    public double getBonus() {
		
		return bonus;
	}
	public void setBonus(double bonus) {
		
		this.bonus =  bonus;
	}
	
	//normal methods
	@Override
	public void work()
	{
		System.out.println(getName() + " is selling vehicles.");
	}
	
	
}

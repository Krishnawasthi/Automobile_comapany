package com.automobile.employee;

public class Engineers  extends Employee {

	private String specialization;      // Mechanical, Electrical, Software
	private String projectAssigned;
	private String qualification;
	private int yearsOfExperience;
	
	
	//constructor
	public Engineers(String empId, String name,double salary,String phoneNumber,String email)
	{
		
		super(empId, name, salary,phoneNumber,email);
		
		
	}
	
	
	public Engineers(String empId, String name,double salary,String phoneNumber,String email, String specialization)
	{
		this(empId, name, salary,phoneNumber,email);
		this.specialization =  specialization;
		
	}
	public Engineers(String empId, String name,double salary,String phoneNumber,String email, String specialization, String projectAssigned)
    {
    	this(empId, name, salary,phoneNumber,email,specialization);
		
		this.projectAssigned = projectAssigned;
		
	}
	
	public Engineers(String empId, String name,double salary,String phoneNumber,String email,String specialization, String projectAssigned, String qualification,int yearsOfExperience)   
   {
	   this(empId, name, salary,phoneNumber,email,specialization,projectAssigned);
	   
	    this.qualification = qualification;
		this.yearsOfExperience = yearsOfExperience;
   }
   
   //getter and setter methods for specialization s

	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	//getter and setter methods for  projectAssigned
	
	public String getProjectAssigned() {
		
		return  projectAssigned;
	}
	public void setProjectAssigned(String projectAssigned) {
		
		this.projectAssigned =  projectAssigned;
	}
	
	//getter and setter methods for qualification
	
	
     public String getQualification() {
		
		return qualification;
	}
	public void setQualification(String qualification) {
		
		this.qualification =  qualification;
	}
	
	//getter and setter methods for  yearsOfExperience
	
	
    public int getYearsOfExperience() {
		
		return  yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience)
	    {
		
		if(yearsOfExperience > 0) 
		{
			
		this. yearsOfExperience =   yearsOfExperience;
		
		}
		else
		{
			System.out.println("Invalid experience");
		}
	}
	
	//methods for different Behaviour
	
	public void designVehicle()
	{
	  System.out.println(getName() + "is designing");
	}
	
	@Override
	public void work() {
	    System.out.println(getName() + " is designing and testing new vehicles.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.automobile.employee;

public class Employee {
	    private String empId;
	    private String name;
	    private int age;
	    private double salary;
	    private String phoneNumber;
	    private String email;
	
	    
	//constructor
	public Employee(String empId){
		
		this.empId = empId;
	}
	
   public  Employee(String empId, String name){
		
    	this(empId);
    	this.name  = name;
    	
		
	}
    public Employee(String empId,String name, double salary){
		
    	this(empId, name);
    	this.salary = salary;
    	
	}
    public Employee(String empId,String name, double salary,String phoneNumber, String email ){
		
	    this(empId, name, salary);
    	this.phoneNumber = phoneNumber;
    	this.email = email;
	}
    
    //getter and setter method for empId 
    
    public String getEmpId() {  //no setter for empId to making it more secure
    	return empId;   
    }
    
     
    
 //getter and setter method for name
    
    
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	
    	this.name = name;
    }
    
//getter and setter method for age
    
    
    public int getAge() {
    	return age;
    }
    public void setAge(int age) {
    	if(age > 18)
    	{
    	this.age = age;
    	}
    	else
    	{
    		System.out.println("You are under 18");
    	}
    }
    
//getter and setter method for salary
    
    
    public double getSalary() {
    	return salary;
    }
    public void setSalary(double salary) {
    	if(salary > 0) {
    	this.salary = salary;
    	}
    	else { 
    		System.out.println("Invalid salary");
    	}
    }
    
//getter and setter method for phoneNumber
    
    public String getPhoneNumber() {
    	return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber ) {
    	
    	this.phoneNumber = phoneNumber;
    }
    
//getter and setter method for Email
    
    
    public String getEmail() {
    	return email;
    }
    public void setEmail(String email) {
    	
    	this.email = email;
    }
    
    //methods for different Behaviour
    
    public void login() 
    {
    	
       System.out.println(name + " logged into the system.");
    	
    }
    
    public void logout()
    
    {
       System.out.println(name + " logged out successfully.");
    }
    public void work()
    {
    	
       System.out.println(name + " is working.");
    	
    }
    
    public void displayEmployeeDetails()
    {
    	
    	
    }
    }
  

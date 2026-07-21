package com.automobile.company;

import com.automobile.employee.Employee; 
import com.automobile.department.Department;

public class AutomobileCompany 
{
	private String companyId;
	private String companyName;
	private String companyLocation;
	private String companyCEO;
	
	 // HAS-A Relationship
	//automobile HAS - A Employee
	private Employee employee;
	
	//automobile HAS - A Department
	
	private Department department;
	
	
	
	
	
	public AutomobileCompany(String companyId, String companyName, String companyLocation, String companyCEO, Employee employee, Department department) {
		
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyLocation = companyLocation;
		this.companyCEO = companyCEO;
		
		this.employee = employee;
		this.department = department;
	}


	public String getCompanyId() {
		return companyId;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCompanyLocation() {
		return companyLocation;
	}


	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}


	public String getCompanyCEO() {
		return companyCEO;
	}


	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	
	//getter and setter for employee
	
	public Employee getEmployee(){
		
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		
		this.employee = employee;
	}
	//getter and setter for department
	
	public Department getDepartment() {
		
		return department;
	}
	
	public void setDepartment(Department department){
		
		this.department = department;
	}
	//methods for company
	// Hire Employee
	public void hireEmployee() {
	    System.out.println("Employee has been hired successfully.");
	}

	// Remove Employee
	public void removeEmployee() {
	    System.out.println("Employee has been removed from the company.");
	}

	// Manufacture Vehicle
	public void manufactureVehicle() {
	    System.out.println("Vehicle is being manufactured.");
	}

	// Sell Vehicle
	public void sellVehicle() {
	    System.out.println("Vehicle has been sold successfully.");
	}

	// Deliver Vehicle
	public void deliverVehicle() {
	    System.out.println("Vehicle has been delivered to the customer.");
	}


	//method to accessing the all the details of this method
	public void displayCompanyDetails()
	{
		System.out.println("Company ID : " + companyId);
		System.out.println("Company Name : " + companyName);
	    System.out.println("Location : " + companyLocation);
	    System.out.println("Company CEO : " + companyCEO);
		
	    System.out.println();
        System.out.println("Employee Details");
        System.out.println("----------------");
        
        System.out.println("Employee ID : " + employee.getEmpId());
        System.out.println("Employee Name : " + employee.getName());
        System.out.println("Employee age : " + employee.getAge());
        System.out.println("Employee Salary : " + employee.getSalary());
        System.out.println("Employee Phone Number : " + employee.getPhoneNumber());
        System.out.println("Employee Email : " + employee.getEmail());
        
        System.out.println();
        System.out.println("Department Details");
        System.out.println("----------------");
        
        System.out.println(department.getDepartmentName());
        System.out.println(department.getDepartmentId());
        department.displayDepartmentDetails();
        
        
        
        
	}
	
}

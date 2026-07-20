package com.automobile.department;

import com.automobile.employee.DepartmentManager;

public class Department {
	 private String departmentId;
	 private String departmentName;
	 private String location;
	 private DepartmentManager departmentManager;
    
    public Department(String departmentId, String departmentName, String location, DepartmentManager departmentManager)
    {
    	 this.departmentId = departmentId;
         this.departmentName = departmentName;
         this.location = location;
         this.departmentManager = departmentManager;
    }

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public DepartmentManager getDepartmentManager() {
		return departmentManager;
	}

	public void displayDepartmentDetails() {
		
		System.out.println("Department Id : "+ departmentId);
		System.out.println("Department Name : "+ departmentName);
		System.out.println("Department Location  : "+ location);
		System.out.println();
		System.out.println("Department Manager details");
		System.out.println("---------------------------------");
		System.out.println("Manager of department: "+ departmentManager.getManagedDepartment());
		System.out.println("Name of Manager: "+ departmentManager.getName());
		System.out.println("Employee Id of Manager:  "+ departmentManager.getEmpId());
		System.out.println("Email of Manager:  "+ departmentManager.getEmail());
		System.out.println("Phone Number of Manager:  "+ departmentManager.getPhoneNumber());
		System.out.println("Bonus given to Manager:  "+departmentManager.getBonus());
		
}
}
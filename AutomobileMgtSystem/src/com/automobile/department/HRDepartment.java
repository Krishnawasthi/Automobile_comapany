package com.automobile.department;
import com.automobile.employee.DepartmentManager;
public class HRDepartment extends Department
{
	private int totalEmployees;
	private int newHires;
	private int interviewsScheduled;
	private double recruitmentBudget;
	
	public HRDepartment(String departmentId, String departmentName, String location,
     DepartmentManager departmentmanager,
	 int totalEmployees,
	 int newHires,
	 int interviewsScheduled,
	 double recruitmentBudget)
	{
		super(departmentId, departmentName, location,departmentmanager);
   	    this.totalEmployees      =  totalEmployees;
        this.newHires            = newHires;
        this.interviewsScheduled =interviewsScheduled;
        this.recruitmentBudget   = recruitmentBudget ;
	}

	public int getTotalEmployees() {
		return totalEmployees;
	}

	public void setTotalEmployees(int totalEmployees) {
		this.totalEmployees = totalEmployees;
	}

	public int getNewHires() {
		return newHires;
	}

	public void setNewHires(int newHires) {
		this.newHires = newHires;
	}

	public int getInterviewsScheduled() {
		return interviewsScheduled;
	}

	public void setInterviewsScheduled(int interviewsScheduled) {
		this.interviewsScheduled = interviewsScheduled;
	}

	public double getRecruitmentBudget() {
		return recruitmentBudget;
	}

	public void setRecruitmentBudget(double recruitmentBudget) {
		this.recruitmentBudget = recruitmentBudget;
	}				
						
				    
	
}

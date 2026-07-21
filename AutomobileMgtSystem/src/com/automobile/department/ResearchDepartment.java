package com.automobile.department;
import com.automobile.employee.DepartmentManager;
public class ResearchDepartment extends Department  
{
	private String researchProject;
	private double researchBudget;
	private int engineersCount;
	private String technologyUsed;
	
	ResearchDepartment(String departmentId, String departmentName, String location,DepartmentManager departmentmanager, String researchProject,
	 double researchBudget,
	 int engineersCount,
	 String technologyUsed)
			
    {
		
		super(departmentId, departmentName,location,departmentmanager);
    	 this.researchProject = researchProject;
         this.researchBudget = researchBudget;
         this.engineersCount= engineersCount;
         this.technologyUsed = technologyUsed ;
    }

	public String getResearchProject() {
		return researchProject;
	}

	public void setResearchProject(String researchProject) {
		this.researchProject = researchProject;
	}

	public double getResearchBudget() {
		return researchBudget;
	}

	public void setResearchBudget(double researchBudget) {
		this.researchBudget = researchBudget;
	}

	public int getEngineersCount() {
		return engineersCount;
	}

	public void setEngineersCount(int engineersCount) {
		this.engineersCount = engineersCount;
	}

	public String getTechnologyUsed() {
		return technologyUsed;
	}

	public void setTechnologyUsed(String technologyUsed) {
		this.technologyUsed = technologyUsed;
	}
	//methods
	public void developPrototype() {
		
		System.out.println("ResearchDepartment.developPrototype()");
	}
			
	public void testNewTechnology() {
		
		System.out.println("ResearchDepartment.testNewTechnology()");
	}
	
	@Override
	public void manageDepartment() {
		System.out.println("Research Department is developing new vehicle technologies."); 
	}
	public void displayDepartmentDetails() {
		System.out.println("....All th details of the ResearchDepartment ");
	
		super.displayDepartmentDetails();
		System.out.println("ResearchDepartment is wroking on       : " + researchProject);
		System.out.println("researchBudget to  ResearchDepartment : " +  researchBudget);
		System.out.println("engineersCount at  ResearchDepartment    : " +  engineersCount);
		System.out.println("technologyUsed  in thsi project in ResearchDepartment : " + technologyUsed);
	}					
		   
			
	
}

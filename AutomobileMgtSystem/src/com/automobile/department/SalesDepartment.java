package com.automobile.department;
import com.automobile.employee.DepartmentManager;

public class SalesDepartment extends Department 
{
	private String salesRegion;
	private double monthlySalesTarget;
	private double monthlySalesAchieved;
	private int customersHandled;
	
	SalesDepartment(String departmentId, String departmentName, String location, DepartmentManager departmentManager, String salesRegion, 
			double monthlySalesTarget,
			double monthlySalesAchieved,
			int customersHandled)
    {
		
		super(departmentId, departmentName,location, departmentManager);
    	 this.salesRegion = salesRegion;
         this.monthlySalesTarget = monthlySalesTarget;
         this.monthlySalesAchieved = monthlySalesAchieved;
         this.customersHandled = customersHandled ;
    }

	public String getSalesRegion() {
		return salesRegion;
	}

	public void setSalesRegion(String salesRegion) {
		this.salesRegion = salesRegion;
	}

	public double getMonthlySalesTarget() {
		return monthlySalesTarget;
	}

	public void setMonthlySalesTarget(double monthlySalesTarget) {
		this.monthlySalesTarget = monthlySalesTarget;
	}

	public double getMonthlySalesAchieved() {
		return monthlySalesAchieved;
	}

	public void setMonthlySalesAchieved(double monthlySalesAchieved) {
		this.monthlySalesAchieved = monthlySalesAchieved;
	}

	public int getCustomersHandled() {
		return customersHandled;
	}

	public void setCustomersHandled(int customersHandled) {
		this.customersHandled = customersHandled;
	}
	//methods
	
   	public void promoteVehicle() {
		System.out.println("SalesDepartment.promoteVehicle()");
	}
	public void achieveSalesTarget(){
		System.out.println("SalesDepartment.achieveSalesTarget()");
		
	}
		@Override
		public void manageDepartment() {
			System.out.println("Sales department is  managing SalesDepartment"); 
		}
		
		
		public void displayDepartmentDetails() {
		System.out.println("....All th details of the SalesDepartment ");
		super.displayDepartmentDetails();
		System.out.println("Sales are spreading to       : " +  salesRegion);
		System.out.println("monthlySalesTarget of SalesDepartment : " + monthlySalesTarget);
		System.out.println("monthlySalesAchieved of  SalesDepartment   : " + monthlySalesAchieved);
		System.out.println("SalesDepartment handeled customers almost : " + customersHandled);
  }
}
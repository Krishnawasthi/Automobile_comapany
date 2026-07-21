package com.automobile.department;
import com.automobile.employee.DepartmentManager;
public class ManufacturingDepartment extends Department
{
	private int productionCapacity;
	private int machinesAvailable;
	private int workersCount;
	private String productionShift;
	
	ManufacturingDepartment(String departmentId, String departmentName, String location, DepartmentManager departmentmanager,int productionCapacity,
	int machinesAvailable,
    int workersCount,
	String productionShift)
	 {
		
		super(departmentId, departmentName,location,departmentmanager);
    	 this.productionCapacity = productionCapacity;
         this.machinesAvailable = machinesAvailable;
         this.workersCount = workersCount;
         this.productionShift = productionShift ;
    }

	public int getProductionCapacity() {
		return productionCapacity;
	}

	public void setProductionCapacity(int productionCapacity) {
		this.productionCapacity = productionCapacity;
	}

	public int getMachinesAvailable() {
		return machinesAvailable;
	}

	public void setMachinesAvailable(int machinesAvailable) {
		this.machinesAvailable = machinesAvailable;
	}

	public int getWorkersCount() {
		return workersCount;
	}

	public void setWorkersCount(int workersCount) {
		this.workersCount = workersCount;
	}

	public String getProductionShift() {
		return productionShift;
	}

	public void setProductionShift(String productionShift) {
		this.productionShift = productionShift;
	}
	//methods
	
	public void manufactureVehicle(){
		
		System.out.println("ManufacturingDepartment.manufactureVehicle()");
	}
	public void qualityInspection() {
		System.out.println("ManufacturingDepartment.voidqualityInspection()");
	}
	@Override
	public void manageDepartment() {
		System.out.println("ManufacturingDepartment.manageDepartment() managing managerDepartment"); 
	 }
	public void displayDepartmentDetails() {
		System.out.println("....All th details of theManufacturingDepartment ");
	
		super.displayDepartmentDetails();
		System.out.println("productionCapacity of  Manufacturing department :  " + productionCapacity);
		System.out.println(" machinesAvailable in Manufacturing department : " +  machinesAvailable);
		System.out.println("workersCount at  Manufacturing department : " +  workersCount);
		System.out.println("productionShift for Manufacturing department : " + productionShift);
	}					
		   
}

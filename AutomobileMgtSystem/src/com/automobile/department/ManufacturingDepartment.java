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
	
					
		   
}

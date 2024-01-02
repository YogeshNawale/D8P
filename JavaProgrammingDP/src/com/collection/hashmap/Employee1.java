package com.collection.hashmap;

class Employee1 {
	int empId;
	String eName;
	double salary;
	int deptId;

	public Employee1() {
		// TODO Auto-generated constructor stub
	}

	public Employee1(int empId, String eName, double salary, int deptId) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.salary = salary;
		this.deptId = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", eName=" + eName + ", salary=" + salary + ", deptId=" + deptId + "]";
	}

}

class Department1 {
	int deptId;
	String deptName, location;

	public Department1() {
		// TODO Auto-generated constructor stub
	}

	public Department1(int deptId, String deptName, String location) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

//	@Override
//	public int hashCode() {
//		System.out.println("in hashCode() method");
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + deptId;
//		result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
//		result = prime * result + ((location == null) ? 0 : location.hashCode());
//		// System.out.println(result);
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		Department1 other = (Department1) obj;
//		
//		if (this.deptId != other.deptId)
//			return false;
//		if (this.deptName == null) {
//			if (other.deptName != null)
//				return false;
//		} else if (!deptName.equals(other.deptName))
//			return false;
//		if (this.location == null) {
//			if (other.location!= null)
//				return false;
//		} else if (!location.equals(other.location))
//			return false;
//		
//		return true;
//	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return deptId;
	}

	@Override
	public boolean equals(Object obj) {
		Department1 other= (Department1) obj;
		
		if(this.deptId==other.deptId)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Department1 [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
	}

}

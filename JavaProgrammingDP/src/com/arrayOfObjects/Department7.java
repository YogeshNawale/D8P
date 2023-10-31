package com.arrayOfObjects;
/*
 * 7)Employee class is as follows .
		Employee {
			int empno ;
			String name ;
			Department dept ;}
		Where dept is object of department class. Department class as deptId and deptname.
		Write a program to create array of 3 employees. Each employee will have different department

 */
public class Department7 {
	private int deptId;
	private String deptname;
	
	public Department7() {
		deptId=0;
		deptname="";
	}
	public Department7(int deptId, String deptname) {
		this.deptId = deptId;
		this.deptname = deptname;
	}


	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	public String toString() {
		return "Department [ID : "+ deptId + " Name : "+ deptname + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

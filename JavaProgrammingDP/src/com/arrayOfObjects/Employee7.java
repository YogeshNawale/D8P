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
public class Employee7 {

	private int empno;
	private String name;
	private Department7 dept;
	
	public Employee7() {
		
	}
	 
	public Employee7(int empno, String name, Department7 dept) {
		this.empno = empno;
		this.name = name;
		this.dept = dept;
	}

	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Department7 getDept() {
		return dept;
	}


	public void setDept(Department7 dept) {
		this.dept = dept;
	}


	public String toString() {
		return "Employee7 [ Number = " + empno + ", Name=" + name +  dept + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee7[] earr= new Employee7[3];
		earr[0]= new Employee7(10,"Yogesh",new Department7(100,"Developer") );
		earr[1]= new Employee7(11,"Amit",new Department7(100,"Software Developer"));
		earr[2]= new Employee7(13,"Ashok",new Department7(100,"Hardware Developer"));
		
		for (int i=0; i< earr.length; i++) {
			System.out.println(earr[i]);
		} 
		
	}

}

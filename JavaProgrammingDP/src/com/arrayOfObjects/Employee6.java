package com.arrayOfObjects;
/*
 * 6)Write a Java program to create array of Employee objects.
	Employee class has empNo , name. Array size should be 5.Make use of for loop.

 */
public class Employee6 {

	private int empNo;
	private String name;
	
	public Employee6() {
		
	}
	
	public Employee6(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}
	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Employee [Number "+ empNo + " Name "+ name + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee6[] earr= new Employee6[5];
		earr[0]= new Employee6(10,"Yogesh");
		earr[1]= new Employee6(11,"Amit");
		earr[2]= new Employee6(12,"Amol");
		earr[3]= new Employee6(13,"Ashok");
		earr[4]= new Employee6(14,"Abhi");
		
		for (int i=0; i<earr.length; i++)
			System.out.println(earr[i]);
		
	}

}

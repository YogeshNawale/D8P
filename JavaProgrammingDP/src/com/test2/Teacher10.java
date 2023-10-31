package com.test2;
/*
 * .  Create class Teacher with following fields [3]
	Tid,Tname,MobileNo
	Parameterized constructor
	abstract void salary()
•	Create class Hourlybased which is derived class from teacher with fields
	 rate_per_hr,
	int hrs;
	Parameterized constructor
	void salary()
•	Create class SalaryBased which is derived class from teacher
	with fields
	 int salary;
	Parameterized constructor
	void salary()
	Write main to create objects of HourlyBased teacher and SalaryBased teacher and also call respective salary method
 	and also show runtime polymorphism

 */
public abstract class Teacher10 {

	int tid; 
	String tname;
	long mobileNo;
	
	Teacher10(int tid,String tname,long mobileNo){
		this.tid=tid;
		this.tname=tname;
		this.mobileNo=mobileNo;
	}
	abstract void salary();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

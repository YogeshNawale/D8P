package com.test2;

public class SalaryBased10 extends Teacher10 {
	int salary;
	
	SalaryBased10(int tid, String tname, long mobileNo,int salary) {
		super(tid, tname, mobileNo);
		this.salary=salary;
		 
	}

	
	@Override
	void salary() {
		System.out.println(salary);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher10 obj= new SalaryBased10(02,"Ashok",872135112,35000);
		obj.salary();
	
	}

	

}

package com.inheritance;

public class Manager extends Employee {

	int noofemp;
	double bonus;
	
	public Manager() {
		// TODO Auto-generated constructor stub
		System.out.println("default con. of Manager");
	}
	public Manager(int eid,String name,double sal,MyDate d,int noofemp,double b)
	{
		//default constructor of super class
	//	super();
		super(eid,name,sal,d);
		System.out.println("para. con. of Manager");
		this.noofemp=noofemp;
		this.bonus=b;
	}
	public String toString()
	{
		//return "Emp id "+ getEid()+"Name "+getEname()+" Salary "+getSalary() +" No of Employees "+ noofemp +" Bonus "+bonus ;
		return super.toString()+" No of Employee "+noofemp + " Bonus "+bonus;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Manager m=new Manager();
		//System.out.println(m);
		
		Manager m1=new Manager(101,"Pooja",45000,new MyDate(12,10,2023),5 , 10000);
		System.out.println(m1);
	

	}

}

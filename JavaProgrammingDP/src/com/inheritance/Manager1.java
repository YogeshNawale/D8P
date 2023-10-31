package com.inheritance;

public  class Manager1 extends Employee1 {
	int noofemp;
	double bonus;
	
	public Manager1() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("default con. of Manager1");
		noofemp=0;
		bonus=0.0;
	}
	public Manager1(int eid, String name, double sal, MyDate1 d, int noofemp, double bonus)
	{
		super(eid,name,sal,d);
		System.out.println("para. con. of Manager1");
		this.noofemp=noofemp;
		this.bonus=bonus;
	}
	
	public int getNoofemp() {
		return noofemp;
	}
	public void setNoofemp(int noofemp) {
		this.noofemp = noofemp;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double calculateSalary() {
		double s= super.getSalary()  + noofemp*bonus;
		super.setSalary(s);
		return s;
	}
	public String toString()
	{
		
		return super.toString()+" No of Employee "+noofemp + " Bonus "+bonus;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager1 obj = new Manager1(03,"Suraj", 50000,new MyDate1(25,10,2023),100,100.5);
		obj.calculateSalary();
		System.out.println(obj);
	}

}

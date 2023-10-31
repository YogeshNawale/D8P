package com.inheritance;

public class WageEmp1 extends Employee1 {

	private int hrs;
	private int rate;
	
	public WageEmp1() {
		super();
		System.out.println("Default constructor of WageEmp1");
		hrs=0;
		rate=0;
	}
	public WageEmp1(int eid, String name, double sal, MyDate1 d,int hrs, int rate) {
		super(eid,name, sal, d);
		System.out.println("Parameter constructor of WageEmp1");
		this.hrs=hrs;
		this.rate=rate;
	}
	public void setHrs(int hrs) {
		this.hrs=hrs;
	}
	public int getHre() {
		return hrs;
	}
	public void setRate(int rate) {
		this.rate=rate;
	}
	public int getRate() {
		return rate;
	}
	
	public double calculateSalary() {
		double s = super.getSalary()+ hrs*rate;
		super.setSalary(s);
		return s;
	}
	
	public String toString() {
		return super.toString()+" Time : "+ hrs+ " Rate : "+ rate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WageEmp1 obj= new WageEmp1(02,"Sumit", 50000, new MyDate1(25,10,2023), 200,10);
		obj.calculateSalary();
		System.out.println(obj);
	}

}

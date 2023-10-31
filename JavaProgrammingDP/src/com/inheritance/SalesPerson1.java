package com.inheritance;

public class SalesPerson1 extends WageEmp1{

	private int sales;
	private double comm;
	
	public SalesPerson1() {
		super();
		System.out.println("I am in default cons in SalesPerson1");
		sales=0;
		comm=0.0;
	}
	public SalesPerson1(int eid, String name, double sal, MyDate1 d,int hrs, int rate,int sales, double com) {
		super(eid, name, sal,d,hrs,rate);
		System.out.println("Parameter constructor of SalesPerson1");
		this.sales=sales;
		this.comm=com;
	}
	
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public double calculateSalary() {
		double s= super.calculateSalary() + sales*comm;
		super.setSalary(s);
		return s;
		
	}
	public String toString() {
		return super.toString()+ " Sales "+ sales+ " Commission "+ comm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SalesPerson1 obj= new SalesPerson1(01, "AMit", 50000, new MyDate1(25,10,2023),100,50,10000,0.1);
		obj.calculateSalary();
		System.out.println(obj);
	}

}

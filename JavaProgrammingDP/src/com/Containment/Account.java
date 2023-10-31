package com.Containment;

public class Account {

	private int accNo;
	private String name;
	private double balance;
	static double intRate;
	
	static
	{
		intRate=5.8;
	}
	
	Account(){
		
	}
	
	Account(int accNo,String name, double balance){
		this.accNo=accNo;
		this.name=name;
		this.balance=balance;
		
	}
	
	public void setAccNo(int accNo) {
		this.accNo=accNo;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	} 
	
	public double getBalance() {
		return balance;
	}
	public static double getIntRate() {
		return intRate;
	}
	public static void setIntRate(double intRate) {
		Account.intRate = intRate;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account obj= new Account();
		System.out.println(obj);
		Account obj1= new Account(1,"Yogesh",89300);
		System.out.println(obj1);
	}

}

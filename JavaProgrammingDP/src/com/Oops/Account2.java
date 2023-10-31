package com.Oops;
// Setter and getter method
public class Account2 {
	
	private int accNo;
	private String ownerName;
	private double balance;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int acc) {
		accNo=acc;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String owName) {
		ownerName=owName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double bal) {
		balance=bal;
	}
	
	public void setData(int acc, String owName, double bal) {
		accNo=acc;
		ownerName=owName;
		balance=bal;
	}
	public void displayData() {
		System.out.println("Account No. is : "+ accNo);
		System.out.println("Owner Name is : "+ ownerName);
		System.out.println("Account Balance is : "+ balance);
	}
	public static void main(String[] args) {
	
		Account2 obj= new Account2();
		obj.setAccNo(1);
		obj.setOwnerName("Yogesh");
		obj.setBalance(638300);
		obj.displayData();
		obj.setData(2, "Sumit", 120000);
		obj.displayData();
		double a=obj.getBalance();
		System.out.println(a);
		

	}

}

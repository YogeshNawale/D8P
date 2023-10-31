package com.Oops;
// to increase account Number using static 
public class StaticAccount {

	static int count=100;
	private int accNo=count;
	private String accName;
	private double accSal;
	
	public StaticAccount()  {
		accNo=count++;
	}
	
	public void setData(  String aName, double aSal) {
		 
		accName=aName;
		accSal=aSal;
		
	}
	
	public void displayData() {
		System.out.println("Account No : "+accNo);
		System.out.println("Account Name : "+accName);
		System.out.println("Account Salary : "+accSal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticAccount obj= new StaticAccount();
		obj.setData("Yogesh", 50000);
		obj.displayData();
		
		StaticAccount obj1= new StaticAccount();
		obj1.setData("Abhi", 40000);
		obj1.displayData();
		
		StaticAccount obj2= new StaticAccount();
		obj2.setData("Rohan", 60000);
		obj2.displayData();
	}

}

package com.Oops;
/**	Write class Account3. Declare data members in it as below. Static float intrestRate, accNo, accName,
 *  balance,etc
 *  Initialize intrestRate in static init block. 
 *  Define static method getIntrestRate() to access intrest rate.
 *  Write another class AccountMain with main() method and call getIntrestRate() method using Account3 class name in it.
 	Note SI=(p*r*t)/100
  */
public class Account3 {
	
	int accNo;
	String accName;
	double balance,principle;
	static float intrestRate;
	float simpleIntrest;
	int time;
	
	static {
		intrestRate=5.5f;
	}
	
	public Account3() {
		accNo=0;
		accName=null;
		balance=0.0;
		principle=0.0;
		time=0;
	}
	public Account3(int aNo,String aName,double bal,int t) {
		accNo=aNo;
		accName=aName;
		balance=bal;
		principle=bal;
		time=t;	
	}
	
	public void calculateSI() {
		
		simpleIntrest=((float)principle*intrestRate*time)/100;
	}
	
	public void calculateBal() {
		balance= principle+simpleIntrest;
	}
	
	public static void getIntrestRate(float sI) {
		intrestRate=sI;
	}
	
	public void displayData() {
		System.out.println("Account No. is : "+ accNo);
		System.out.println("Account Name is : "+ accName);
		System.out.println("Account Balance is : "+ principle);
		System.out.println("Intrest Rate is : "+ intrestRate);
		System.out.println("Time in Years is : "+ time);
		System.out.println("Simple Intrest is : "+ simpleIntrest);
		System.out.println("Account Balance is : "+ balance);
		System.out.println("_______________________\n");
	}
	public static void main(String[] args) {
		
		Account3 obj= new Account3(1,"Yogesh",150000,5);
		obj.calculateSI();
		obj.calculateBal();
		obj.displayData();
		
		
		Account3.getIntrestRate(5.2f);
		obj.calculateSI();
		obj.calculateBal();
		obj.displayData();
		
		
		

	}

}

package com.inheritance;

public class BankMain8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount8 obj= new SavingAccount8( 233234,"Yogesh Nawale","Saving Account","pune","Sbin000126",50000,5);
		obj.calculatedeposit(7000);
		obj.calculateWithdraw(3000);
		obj.calculateSI();
		obj.calculateBal();
		System.out.println(obj);
		
		
		FixedDepositAccount8 obj1= new FixedDepositAccount8(12455,"Abhi Nawale","Fixed Deposit","Pune","SBI02342",50000,5);
		obj1.calculateSI();
		obj1.calculateBal();
		System.out.println(obj1);
	}

}

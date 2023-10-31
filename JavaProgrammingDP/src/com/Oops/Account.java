package com.Oops;

public class Account {

	String ac_name,branch_name, ifsc_code;
	long ac_number;
	double balance,deposit,withdraw,orig_balance;
	
	public void setData(String name,long number,String branch , String ifsc, double bal,double depo, double withdr) {
		
		ac_name=name;
		ac_number=number;
		branch_name=branch;
		ifsc_code=ifsc;
		balance=bal;
		orig_balance=balance;
		deposit=depo;
		withdraw=withdr;
				
	}
	
	public void calculatedeposit() {
		
		balance=balance+deposit;
		
	}
	
	public void calculateWithdraw(){
		
		balance=balance-withdraw;
	}	
	
	public void displayData() {
		
		System.out.println("Enter Account Name "+ ac_name);
		System.out.println("Enter Account Number "+ ac_number);
		System.out.println("Enter Branch Name "+ branch_name);
		System.out.println("Enter IFSC Code "+ ifsc_code);
		System.out.println("Enter Account Balance "+ orig_balance);
		System.out.println("Enter Amount Deposited "+ deposit);
		System.out.println("Enter Amount Withdrawn "+ withdraw);
		System.out.println("Account Remaning Balance "+ balance);
	} 
	
	public static void main(String[] args) {
	
		Account obj= new Account();
		obj.setData("Yogesh", 67432572332l, "Pune", "SBI 3243JK3", 50000, 2000, 5000);
		obj.calculatedeposit();
		obj.calculateWithdraw();
		obj.displayData();
		
		
	}

}

package com.Containment;

public class Bank {
	
	private String bankName, address, ifscCode;
	private Account acc;
	
	public Bank() {
		
		bankName="";
		address="";
		ifscCode="";
		acc= new Account();
	}
	
	public Bank(String bankName, String address, String ifscCode, Account a) {
		
		this.bankName=bankName;
		this.address=address;
		this.ifscCode=ifscCode;
		this.acc=a;
		
	}
	
	public void setBankName(String bankName) {
		this.bankName=bankName;
	}
	public String getBankName() {
		return bankName;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setIfscCode(String ifscCode) {
		this.ifscCode=ifscCode;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setAcc (Account acc){
		this.acc=acc;
	}
	public Account getAcc()
	{
		return acc;
	}
	

	@Override
	public String toString() {
		return "Bank [ bankName=" + bankName + ", address=" + address +", ifscCode="+ ifscCode +", account="
				+ acc + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account d= new Account(1,"Yogesh",89300);
		Bank obj= new Bank("IDBI", "Pune", "IBKL89213",d);
		System.out.println(obj);
		
		Bank obj1= new Bank("IDBI", "Pune", "IBKL89213",new Account(2,"Abhi",55300));
		System.out.println(obj1);
	}

}

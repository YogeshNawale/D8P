package com.inheritance;

public class SavingAccount8 extends Account8 {

	String ac_type, branch_name, ifsc_code;
	double balance, deposit, withdraw, orig_balance;
	static float intrestRate;
	float simpleIntrest;
	int time;

	static {
		intrestRate=5.5f;
	}

	public SavingAccount8() {
		System.out.println("Default Const of SavingAccount8");
		ac_type="";
		branch_name="";
		ifsc_code="";
		balance=0.0;
		orig_balance=balance;
		simpleIntrest=0.0f;
		time=0;
		
	}
	public SavingAccount8(int accNo, String name,String type, String branch, String ifsc, double bal,int time) {
		
		super(accNo, name);
		System.out.println("Parametric Const of SavingAccount8");

		ac_type = type;
		branch_name = branch;
		ifsc_code = ifsc;
		balance = bal;
		orig_balance = balance;
		this.time=time;

	}

	public String getAc_type() {
		return ac_type;
	}
	public void setAc_type(String ac_type) {
		this.ac_type = ac_type;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	public double getOrig_balance() {
		return orig_balance;
	}
	public void setOrig_balance(double orig_balance) {
		this.orig_balance = orig_balance;
	}
	public static float getIntrestRate() {
		return intrestRate;
	}
	public static void setIntrestRate(float intrestRate) {
		SavingAccount8.intrestRate = intrestRate;
	}
	public float getSimpleIntrest() {
		return simpleIntrest;
	}
	public void setSimpleIntrest(float simpleIntrest) {
		this.simpleIntrest = simpleIntrest;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public void calculatedeposit(double depo) {

		deposit = depo;
		balance = balance + deposit;

	}

	public void calculateWithdraw(double withd) {
		withdraw = withd;
		balance = balance - withdraw;
		

	}
public void calculateSI() {
		
		simpleIntrest=((float)balance*intrestRate*time)/100;
	}
	
	public void calculateBal() {
		balance= balance+simpleIntrest;
	}
	
	public static void getIntrestRate(float sI) {
		intrestRate=sI;
	}
	
	@Override
	public String toString() {
		return super.toString()+"SavingAccount [ac_type=" + ac_type + ", branch_name=" + branch_name + ", ifsc_code=" + ifsc_code
				+ ", balance=" + balance + ", deposit=" + deposit + ", withdraw=" + withdraw + ", orig_balance="
				+ orig_balance + ", simpleIntrest=" + simpleIntrest + ", time=" + time + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SavingAccount8 obj= new SavingAccount8( 233234,"Yogesh Nawale","Saving Account","pune","Sbin000126",50000,5);
	obj.calculatedeposit(7000);
	obj.calculateWithdraw(3000);
	obj.calculateSI();
	obj.calculateBal();
	System.out.println(obj);
	}

}

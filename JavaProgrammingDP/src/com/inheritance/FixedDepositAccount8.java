package com.inheritance;

public class FixedDepositAccount8 extends Account8 {
	String ac_type, branch_name, ifsc_code;
	double balance;
	static float intrestRate;
	float simpleIntrest;
	int time;

	static {
		intrestRate = 7.2f;
	}

	public FixedDepositAccount8() {
		System.out.println("Default Const of FixedDepositAccount8");
		ac_type = "";
		branch_name = "";
		ifsc_code = "";
		balance = 0.0;
		simpleIntrest = 0.0f;
		time = 0;

	}

	public FixedDepositAccount8(int accNo, String name, String type, String branch, String ifsc, double bal, int time) {

		super(accNo, name);
		System.out.println("Parametric Const of FixedDepositAccount8");

		ac_type = type;
		branch_name = branch;
		ifsc_code = ifsc;
		balance = bal;
		this.time = time;

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

	public static float getIntrestRate() {
		return intrestRate;
	}

	public static void setIntrestRate(float intrestRate) {
		FixedDepositAccount8.intrestRate = intrestRate;
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

	public void calculateSI() {

		simpleIntrest = ((float) balance * intrestRate * time) / 100;
	}

	public void calculateBal() {
		balance = balance + simpleIntrest;
	}

	@Override
	public String toString() {
		return super.toString()+ "FixedDepositAccount8 [ac_type=" + ac_type + ", branch_name=" + branch_name + ", ifsc_code=" + ifsc_code
				+ ", balance=" + balance + ", simpleIntrest=" + simpleIntrest + ", time=" + time + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FixedDepositAccount8 obj= new FixedDepositAccount8(12455,"Abhi Nawale","Fixed Deposit","Pune","SBI02342",50000,5);
		obj.calculateSI();
		obj.calculateBal();
		System.out.println(obj);
	
	}

}

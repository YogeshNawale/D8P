package com.test2;

public class Hourlybased10 extends Teacher10 {
	int rate_per_hr;
	int hrs;

	Hourlybased10(int tid, String tname, long mobileNo, int rate_per_hr, int hrs) {
		super(tid, tname, mobileNo);
		this.rate_per_hr = rate_per_hr;
		this.hrs = hrs;
	}

	@Override
	void salary() {
		int salary=rate_per_hr* hrs;
		System.out.println(salary);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher10 obj= new Hourlybased10(1,"Amit",987146163,55,700);
		obj.salary();
	}

}

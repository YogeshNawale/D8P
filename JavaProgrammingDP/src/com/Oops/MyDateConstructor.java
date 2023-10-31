package com.Oops;

public class MyDateConstructor {
	private int dd, mm, yy;

	public MyDateConstructor() {
		dd = 17;
		mm = 10;
		yy = 2023;

	}

	public MyDateConstructor(int dd, int mm, int yy) {
		this.dd = dd;
		mm = this.mm;
		yy = this.yy;
	}

	public void setDd(int d) {
		dd = d;
	}

	public int getDd() {
		return dd;
	}

	public void setMm(int m) {
		mm = m;
	}

	public int getMm() {
		return mm;
	}

	public void setYy(int y) {
		yy = y;
	}

	public int getYy() {
		return yy;
	}

	public void setData(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}

	public void printdata() {
		System.out.println("The Date is " + dd + "/" + mm + "/" + yy);
	}

	public static void main(String[] args) {

		MyDateConstructor obj = new MyDateConstructor(18, 11, 2023);
		obj.printdata();

		MyDateConstructor obj1 = new MyDateConstructor(1, 10, 2023);
		obj1.printdata();

		obj.setData(17, 10, 2023);
		obj.printdata();
	}

}

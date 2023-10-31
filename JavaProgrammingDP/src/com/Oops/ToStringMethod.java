package com.Oops;

public class ToStringMethod {
	private int dd, mm, yy;

	public ToStringMethod() {
		dd = 17;
		mm = 10;
		yy = 2023;

	}

	public ToStringMethod(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}

	public String toString() {
		return "Date is " + dd + "/" + mm + "/" + yy;
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

		ToStringMethod obj = new ToStringMethod(18, 11, 2023);
		System.out.println(obj);

		ToStringMethod obj1 = new ToStringMethod(1, 10, 2023);
		System.out.println(obj1);

		obj.setData(17, 10, 2023);
		obj.printdata();
	}

}

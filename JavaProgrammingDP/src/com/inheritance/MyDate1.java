package com.inheritance;

public class MyDate1 {
	// data member
	private int dd, mm, yy;

	public MyDate1() {

		System.out.println("I am in default Const of Mydate1");
		dd = 17;
		mm = 10;
		yy = 2023;

	}

	public MyDate1(int dd, int mm, int yy) {

		System.out.println(" parametric cons of Mydate1");

		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void setDd(int d) {
		dd = d;
	}

	public void setMm(int m) {
		mm = m;
	}

	public void setYy(int y) {
		yy = y;
	}

	public int getDd() {
		return dd;
	}

	public int getMm() {
		return mm;
	}

	public int getYy() {
		return yy;
	}

	

	public String toString() {
		return dd + "/" + mm + "/" + yy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

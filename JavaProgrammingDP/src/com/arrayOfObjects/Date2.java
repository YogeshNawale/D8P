package com.arrayOfObjects;

public class Date2 {
	// data member
	private int dd, mm, yy;

	public Date2() {

		System.out.println("I am in default Const");
		dd = 17;
		mm = 10;
		yy = 2023;

	}

	public Date2(int dd, int mm, int yy) {

		System.out.println("I am in parameterized const");
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

	public void setData(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}

	public boolean compare (Date2 o) {
		boolean result =false;
		if(this.dd==o.dd && this.mm==o.mm && this.yy==o.yy)
			result=true;
		
		return result;
	}
	public String toString() {
		return dd + "/" + mm + "/" + yy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

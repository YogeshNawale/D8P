package com.Oops;

public class AddOf2Objects {
	private int dd, mm, yy;

	public AddOf2Objects() {
		dd = 17;
		mm = 10;
		yy = 2023;

	}

	public AddOf2Objects(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
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

	public void add(AddOf2Objects obj1) {
		System.out.println(obj1.dd);
		System.out.println(obj1.mm);
		System.out.println(obj1.yy);

		System.out.println(this.dd);
		System.out.println(this.mm);
		System.out.println(this.yy);
		
		System.out.println();
		
		int d= this.dd+obj1.dd;
		int m= this.mm+obj1.mm;
		int y= this.yy+obj1.yy;
		System.out.println("The Date is " + d + "/" + m + "/" + y);
	}

	public static void main(String[] args) {

		AddOf2Objects obj = new AddOf2Objects(18, 11, 2023);
		obj.printdata();

		AddOf2Objects obj1 = new AddOf2Objects(1, 10, 2023);
		obj1.printdata();

		obj.add(obj1);

	}

}

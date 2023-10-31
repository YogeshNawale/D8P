package com.Oops;

import java.util.Scanner;

public class DateSetterGetter {

	private int dd, mm, yy;
	
	public void setDd(int d) {
		dd=d;
	}
	
	public int getDd() {
		return dd;
	}
	
	public void setMm(int m) {
		mm=m;
	}

	public int getMm() {
		return mm;
	}
	
	public void setYy(int y) {
		yy=y;
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date");
		int d = sc.nextInt();
		System.out.println("Enter Month");
		int m = sc.nextInt();
		System.out.println("Enter Year");
		int y = sc.nextInt();

		DateSetterGetter obj;
		obj = new DateSetterGetter();
		obj.setDd(d);
		obj.setMm(m);
		obj.setYy(y);
		obj.printdata();

		

	}

}

package com.Oops;

import java.util.Scanner;

public class DisplayDate {
	int dd, mm, yy;

	public void setData(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}

	public void printdata() {
		System.out.println("The Date is " + dd + "/" + mm + "/" + yy);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Date");
		int d= sc.nextInt();
		System.out.println("Enter Month");
		int m= sc.nextInt();
		System.out.println("Enter Year");
		int y= sc.nextInt();
		
		DisplayDate obj;
		obj = new DisplayDate();
		obj.setData(d, m, y);
		obj.printdata();
		
		
		DisplayDate obj1= new DisplayDate();
		obj1.setData(16, 8, 2010);
		obj1.printdata();
	}

}

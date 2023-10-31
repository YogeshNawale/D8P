package com.Oops;

import java.util.Scanner;

public class ElectricityBill1 {
	String meterNo, customerID, customerName, customerEmail, month;
	double units, bill, totalBill;

	public void setData(String metNo, String iD, String name, String email, String mon) {
		meterNo = metNo;
		customerID = iD;
		customerName = name;
		customerEmail = email;
		month = mon;
	}

	public void calculateBill(double unit) {
		units = unit;

		if (units <= 50) {
			bill = (0.5 * units);
			totalBill = bill + (0.2 * bill); // 20% Surcharge
			System.out.println("Total bill is : " + totalBill);
		} else if (units <= 150) {
			bill = (0.5 * 50) + (0.75 * (units - 50));
			totalBill = bill + (0.2 * bill);
			System.out.println("Total bill is : " + totalBill);
		} else if (units <= 250) {
			bill = (0.5 * 50) + (0.75 * 100) + (1.20 * (units - 150));
			totalBill = bill + (0.2 * bill);
			System.out.println("Total bill is : " + totalBill);
		} else {
			bill = (0.5 * 50) + (0.75 * 100) + (1.20 * 100) + (1.20 * (units - 250));
			totalBill = bill + (0.2 * bill);
			System.out.println("Total bill is : " + totalBill);
		}
	}

	public void displayData() {

		System.out.println("Enter Meter No. " + meterNo);
		System.out.println("Enter Customer ID " + customerID);
		System.out.println("Enter Customer Name " + customerName);
		System.out.println("Enter Customer Email " + customerEmail);
		System.out.println("Enter Month " + month);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ElectricityBill1 obj = new ElectricityBill1();
		obj.setData("A-12", "1", "Yogesh", "yogesh@gmail.com", "jan");
		obj.displayData();
		System.out.println("Enter number of Units consumed");
		double unit = sc.nextDouble();
		obj.calculateBill(unit);
		
		
	}

}

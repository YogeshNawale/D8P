package com.overRiding;
/*
 * ) A bank has a principal amount and a rate of interest which is 2%. A savings account has a
 *  rate of interest 3% while a current account has 5%. 
 * 	Write a method that displays the rate of interest based on whether the account is default/ savings/ current.
 */
public class Bank {

	private double principal;
	private double roi;
	
	public void displayROI() {
		System.out.println(roi);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank a= new Default();
		a.displayROI();
		Bank b= new Saving();
		b.displayROI();
		Bank c= new Current();
		c.displayROI();
	}

}
class Default extends Bank{
	private double principal;
	private double roi=2;
	public void displayROI() {
		System.out.println("Default account ROI : "+roi);
	}
}
class Saving extends Bank{
	private double principal;
	private double roi=3;
	public void displayROI() {
		System.out.println("Saving account ROI : "+roi);
	}
}
class Current extends Bank{
	private double principal;
	private double roi=5;
	public void displayROI() {
		System.out.println("Current account ROI : "+roi);
	}
}
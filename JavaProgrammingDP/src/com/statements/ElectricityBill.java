package com.statements;
import java.util.*;
public class ElectricityBill {

	public static void main(String[] args) {
		double units,rate,bill,Totalbill;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of Units consumed");
		units=sc.nextDouble();
		
		if (units<=50)
		{
			bill=(0.5*units);
			Totalbill=bill+(0.2*bill);	// 20% Surcharge
			System.out.println("Total bill is : " + Totalbill);
		}
		else if (units<=150)
		{
			bill=(0.5*50)+(0.75*(units-50));
			Totalbill=bill+(0.2*bill);
			System.out.println("Total bill is : " + Totalbill);
		}
		else if (units<=250)
		{
			bill=(0.5*50)+(0.75*100)+(1.20*(units-150));
			Totalbill=bill+(0.2*bill);
			System.out.println("Total bill is : " + Totalbill);
		}
		else 
		{
			bill=(0.5*50)+(0.75*100)+(1.20*100)+(1.20*(units-250));
			Totalbill=bill+(0.2*bill);
			System.out.println("Total bill is : " + Totalbill);
		}
		
	}

}

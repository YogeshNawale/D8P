package com.statements;
import java.util.*;
public class GrossSalary {

	public static void main(String[] args) {
		double salary,GrossSalary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		salary=sc.nextDouble();
		
		if (salary<=10000)
		{
			// HRA=20% DA=80%
			GrossSalary = ((0.2*salary)+(0.8*salary)+salary);
					System.out.println(GrossSalary);
		}
		else if (salary<=20000)
		{
			// HRA=25% DA=90%
			GrossSalary = ((0.25*salary)+(0.9*salary)+salary);
					System.out.println(GrossSalary);
		}
		else if (salary>20000)
		{
			// HRA=30% DA=95%
			GrossSalary = ((0.30*salary)+(0.95*salary)+salary);
					System.out.println(GrossSalary);
		}
		else
		{
			System.out.println("Invalid Salary");
		}

	}

}

package com.Oops;

import java.util.Scanner;

public class SwitchCountryName {

	Scanner sc= new Scanner(System.in);
	String countryName;

	public void SetData(String cName) {
		countryName = cName;

	}

	public void checkData() {
		
		switch(countryName) {
		case "India":
			System.out.println("National game of India is Hockey");
			break;
		case "China":
			System.out.println("National game of China is Table Tennis");
			break;
		case "Bangladesh":
			System.out.println("National game of Bangladesh is Kabaddi");
			break;
		case "Italy":
			System.out.println("National game of Italy is Football");
			break;
		case "United States":
			System.out.println("National game of United States is baseball");
			break;
		default:
			System.out.println("Invaild Country Name");
			
		}
	}
	public static void main(String[] args) {
		/*
		 * National game of India is Hockey, China is Table Tennis, Bangladesh is
		 * Kabaddi, Italy is Football, United States is baseball. Write a Java program
		 * to read country name as user-input and to print the country’s national game.
		 * Use switch
		 */
		Scanner sc= new Scanner(System.in);
		SwitchCountryName obj= new SwitchCountryName();
		System.out.println("Enter Country Name as follows India, China, Bangladesh, Italy, United States");
		String country= sc.next();
		obj.SetData(country);
		obj.checkData();
	}

}

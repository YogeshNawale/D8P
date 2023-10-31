package com.statements;
import java.util.*;
public class BloodDonation {

	public static void main(String[] args) {
		// prog to check if candidate is eligible for blood donation or not.
		//Conditions wt. must be 50 or more and age is more than 18
		
			int wt, age;
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter age of Candidate");
			age=sc.nextInt();
			System.out.println("Enter Weight of Candidate");
			wt=sc.nextInt();
			
			if (age>18 && wt>=50)
			{
				System.out.println("Eligible for Blood Donation");
			}
			else
			{
				System.out.println("Not Eligible for Blood Donation");
			}
			
			
			
	}

}

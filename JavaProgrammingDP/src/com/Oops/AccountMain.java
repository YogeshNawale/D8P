package com.Oops;
/**	Write class Account3. Declare data members in it as below. Static float intrestRate, accNo, accName,
 *  balance,etc
 *  Initialize intrestRate in static init block. 
 *  Define static method getIntrestRate() to access intrest rate.
 *  Write another class AccountMain with main() method and call getIntrestRate() method using Account3 class name in it.
 	Note SI=(p*r*t)/100
  */
public class AccountMain {

	public static void main(String[] args) {
		
		AccountMain obj= new AccountMain();
		Account3.getIntrestRate(4.5f);
		
	}

}

package com.test1;
/*
 * Q2. Write Java Program to find highest digit among the digits forming a number.
 * 	 E.g. If number given is 6745, then output should be 7.
 */
public class MaximumDigit {

	private int num,max;
	
	public MaximumDigit() {
		
	}
	public MaximumDigit(int num){
		this.num=num;
	}
	public void checkMax() {
		max=0;
		while(num>0) {
			int digit=num%10;
			if(digit>max)
				max=digit;
			num=num/10;
		}
		System.out.println("Maximum Digit is = "+ max);
	} 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaximumDigit obj= new MaximumDigit(1348963);
		obj.checkMax();
	}

}

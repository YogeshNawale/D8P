package com.stringassignment;
// Check entered String is valid mobile number.

public class CheckValidMobileNumberString {

	public static void main(String[] args) {

		String str = "9803453243";

		char ch[] = str.toCharArray();
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < ch.length; i++) {
			count++;
			if ((ch[i] >= '0') && (ch[i] <= '9')) {
				flag = true;
			}

		}
		System.out.println(count);
		
		if(flag && count==10) {
			System.out.println("Valid Mobile Number");
		}
		else
			System.out.println("Invalid Mobile Number");

	}

}

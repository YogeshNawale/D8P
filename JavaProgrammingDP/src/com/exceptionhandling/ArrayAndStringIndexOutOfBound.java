package com.exceptionhandling;
//8. WAP to show the scenario in which IndexOutBound Exception (Both ArrayInexOutOfBound and 
// StringIndexOutOfBound) exception is generated and handle this exception.

public class ArrayAndStringIndexOutOfBound {

	public static void main(String[] args) {
		String str="Java";
		try {
			for(int i=0; i<=str.length();i++)
				System.out.println(str.charAt(i));
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Main End");

	}

}

package com.exceptionhandling;

public class ArithmeticException1 {
	
	public void show () {
		try{
			int res=10/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmeticException1 obj= new ArithmeticException1() ;
		System.out.println("Main Start");
		obj.show();

		System.out.println("Main Ends");
	}

}

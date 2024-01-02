package com.exceptionhandling;

public class TryCatchDemo {

	public void sumOfArray(int arr[]) {
		int sum=0;
		
		for(int i=0; i<=arr.length;i++) {
			sum=sum+arr[i];
		}
	}
	public static void main(String[] args) {
		
		TryCatchDemo obj= new TryCatchDemo();
		int arr[]=null;
		
		try {
		obj.sumOfArray(arr);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			//e.getMessage();
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally");
		}
		
		
		
	}

}

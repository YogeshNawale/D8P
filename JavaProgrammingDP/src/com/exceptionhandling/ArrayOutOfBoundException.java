package com.exceptionhandling;
/*	1. WAP which throws ArrayIndexOutBoundsException. In the console, observe the stack trace and the 
		line number from where the Exception is thrown
	2. WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.
*/
import java.util.Scanner;

public class ArrayOutOfBoundException {

	
	public void displayElement(int a,int arr[]) throws ArrayIndexOutOfBoundsException {
		
		if(a<0||a>(arr.length-1))
			throw new ArrayIndexOutOfBoundsException();
	}
	
	public void displayArray(int arr[]) {
		try {
			for (int i=0; i<=arr.length;i++)
				System.out.print (arr[i]+"\t");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		
		ArrayOutOfBoundException obj= new ArrayOutOfBoundException();
		 
		
		try{
			System.out.println("Enter the index of element to be displayed");
			int i=sc.nextInt();
			obj.displayElement(i,a);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		
		obj.displayArray(a);
		
		System.out.println("Main ends");
	}

}

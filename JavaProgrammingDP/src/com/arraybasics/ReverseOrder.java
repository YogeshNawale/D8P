package com.arraybasics;

import java.util.Scanner;

public class ReverseOrder {

	public static int[] createArray() {
		int num[];
		System.out.println("Enter size of Array : ");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		num=new int [size];
		
		for(int i=0; i<num.length; i++) {
			System.out.println("Please enter  " + (i+1) + " Element " );
			num[i]=sc.nextInt();
		}
		sc.close();
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

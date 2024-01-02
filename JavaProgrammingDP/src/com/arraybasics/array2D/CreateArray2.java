package com.arraybasics.array2D;

import java.util.Scanner;

//2.	WAP to accept data in 2D array where rows are fixed and columns are variable.
public class CreateArray2 {

	public void createArray() {
		
		int arr[][] ;
		Scanner sc = new Scanner(System.in);
		
		arr=new int[3][];
		for (int i=0; i<arr.length; i++ ) {
			System.out.println("Enter size of " + (i+1) + " Coloum");
			int col=sc.nextInt();
			arr[i]=new int [col];
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the Element");
				int ele= sc.nextInt();
				arr[i][j]=ele;
			}
		}
		
		for(int a[]: arr ) {
			for(int ele : a) {
				System.out.print (ele + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateArray2 obj= new CreateArray2();
		obj.createArray();
	}

}

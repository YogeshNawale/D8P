package com.arraybasics.array2D;
//12.	WAP to find sum of lower triangular matrix.
public class SumOfLowerTraingularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 } };
		
		 
		for (int a1[] : a) {
			for (int ele : a1) {
				System.out.print(ele + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		int sum=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(i==j || i>j)
					sum=sum+a[i][j];
			}
		}
		System.out.println("Sum of Lower Traingular Matrix is : "+ sum);
	}

}

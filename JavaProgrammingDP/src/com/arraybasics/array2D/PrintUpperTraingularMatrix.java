package com.arraybasics.array2D;

public class PrintUpperTraingularMatrix {

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
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(i==j || j>i)
					System.out.print (a[i][j]+"\t");
				else
					System.out.print ("\t");
			}
			System.out.println();
		}
	
	}

}

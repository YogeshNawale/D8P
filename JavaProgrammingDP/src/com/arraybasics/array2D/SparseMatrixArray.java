package com.arraybasics.array2D;

//7.	WAP to check if a matrix is a Sparse matrix (in which most of the elements are 0). 
//		Print “Sparse” if it is Sparse else print “Not sparse”
public class SparseMatrixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 1, 0, 0 }, { 0, 5, 0 }, { 0, 0, 9 } };
		int count = 0;
		int countEle = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				countEle++;
				if (arr[i][j] == 0)
					count++;
			}

		}
		System.out.println("No. of zero Elements "+count);
		System.out.println("Total No. of Elements "+countEle);
		
		if (count > (countEle / 2))
			System.out.println("Sparse Matrix");
		else
			System.out.println(" Not Sparse Matrix");

	}
}

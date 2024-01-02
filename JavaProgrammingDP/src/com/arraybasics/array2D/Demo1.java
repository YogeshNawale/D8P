package com.arraybasics.array2D;

public class Demo1 {

	public void createArray() {
		int arr[][] = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;

		printArray(arr);
	}

	public void printArray(int p[][]) {

		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				System.out.print(p[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void createArray1() {
		int arr[][] = { { 10, 20, 30 }, { 40, 50 }, { 60 }, { 70, 80, 90, 100 } };

		// using enhanced for loop
//		for(int a[]: arr) {
//			for(int ele: a) {
//			System.out.print (ele+ "  ");
//			}
//			System.out.println();
//		}

		// using for loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + "\t");
			System.out.println();

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 a = new Demo1();
		a.createArray();
		a.createArray1();
	}

}

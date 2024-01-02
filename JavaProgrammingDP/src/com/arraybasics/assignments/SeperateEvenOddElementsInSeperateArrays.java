package com.arraybasics.assignments;

//9.	WAP to put even and odd elements of array in two separate arrays.
public class SeperateEvenOddElementsInSeperateArrays {

	public static int[] createEvenArray(int num[]) {
		int counteven = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				counteven++;
			}
		}
		int even[] = new int[counteven];
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even[j] = num[i];
				j++;
			}
		}
		return even;
	}
	
	public static int[] createOddArray(int num[]) {
		int countodd = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				countodd++;
			}
		}
		int odd[] = new int[countodd];
		int j = 0;
		for (int i = 0; i < num.length; i++) {
		if (num[i] % 2 != 0) {
				odd[j] = num[i];
				j++;
			}
		}
		return odd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = Array1.createArray();
		Array1.printArray(arr);

		int even[] = createEvenArray(arr);
		Array1.printArray(even);
	
		int odd[] = createOddArray(arr);
		Array1.printArray(odd);
	}

}

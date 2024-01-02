package com.arraybasics.assignments;

//12.	WAP to print all unique elements in the array.
public class UniqueNumberArray {
	public static void countUnique(int num[]) {
		
		int count = 0;

		for (int i = 0; i < num.length; i++) {
			boolean isUnique = true;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				boolean isNotPrinted = true;
				for (int k = i - 1; k >= 0; k--) {
					if (num[i] == num[k]) {
						isNotPrinted = false;
						break;
					}
				}

				if (isNotPrinted) {
					count++;
					System.out.println(num[i] + " is a Unique.");
				}
			}

		}

		System.out.println("Number of Unique elements = " + count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= Array1.createArray();
		Array1.printArray(a);
		countUnique(a);
	}

}

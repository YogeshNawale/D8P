package com.arraybasics.assignments;

import java.util.Arrays;

//14.	WAP to count frequency of each element in an array.
public class FrequencyElementsArray {

	// int num[] = { 1, 2, 3, 1, 2, 5, 7, 2, 3 };

	public static void countFrequency(int num[]) {

		for (int i = 0; i < num.length; i++) {
			int flag = 0;
			int count = 0;

			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					flag = 1;
					break;
				}
			}

			if (flag == 1)
				continue;

			for (int j = 0; j <= i; j++) {
				if (num[i] == num[j])
					count++;
			}
			System.out.println(" Frequency of Element "+ num[i] + " is = " + count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = Array1.createArray();
		System.out.println(Arrays.toString(a));

		countFrequency(a);
	}

}

package com.modularapproach;

import java.util.Scanner;

//Prog to find Frequency Of Number
public class ProgFrequencyOfNum {

	public void calculateFreq(int num) {
		int count;
		for (int i = 0; i <= 9; i++) {
			count = 0;
			int temp = num;
			while (temp > 0) {

				int digit = temp % 10;
				if (digit == i)
					count++;
				temp = temp / 10;
			}
			if (count > 0){
				System.out.println("The Frequency of number "+ i +" is "+ count);
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		ProgFrequencyOfNum obj = new ProgFrequencyOfNum();
		obj.calculateFreq(num);
	}

}

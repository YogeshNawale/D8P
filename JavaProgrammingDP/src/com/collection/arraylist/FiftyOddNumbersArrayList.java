package com.collection.arraylist;

import java.util.ArrayList;

//  Create arraylist of integers. Add first 50 odd numbers to arraylist.
public class FiftyOddNumbersArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		int count = 1;
		int i=1;
		
		while(count<=50) {
			al1.add(i);
			i=i+2;
			count++;
		}

//		for (int i = 1;count<=50; i++) {
//			if(i%2!=0 ) {
//				al1.add(i);
//				count++;
//			}
//		}
		System.out.println(al1);
		System.out.println(al1.size());

	}

}

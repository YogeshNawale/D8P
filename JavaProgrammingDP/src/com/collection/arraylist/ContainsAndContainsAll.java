package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*  11.   Create arraylist ‘arrList’ within an arraylist. Use contains and containsall method 
 * 				to check if given element and arraylists are present in ‘arrList’
	12.   iterate through arraylist using foreach.
*/
public class ContainsAndContainsAll {

	public static void main(String[] args) {
		 
		ArrayList<Integer> arrList= new ArrayList<>();
		arrList.add(21);
		arrList.add(12);
		arrList.add(123);
		arrList.add(432);
		arrList.add(12);
		arrList.add(53);
		arrList.add(11);
		
		System.out.println(arrList);
		
		System.out.println(arrList.contains(12));
		System.out.println(arrList.contains(10));
		
		ArrayList<Integer> arrList1= new ArrayList<>(Arrays.asList(21,32,42,21));
		System.out.println(arrList.containsAll(arrList1));
		
		for(int i=0;i<arrList.size();i++) {
			System.out.print(arrList.get(i)+"\t");
		}
		System.out.println();
		for(int a: arrList) 
			System.out.print(a+"\t");


	}

}

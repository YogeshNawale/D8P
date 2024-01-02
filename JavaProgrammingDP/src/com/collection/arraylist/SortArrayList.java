package com.collection.arraylist;
//.        Sort arraylist of Strings.
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> str= new ArrayList<>();
		str.add("Yogesh");
		str.add("Amit");
		str.add("Sumit");
		str.add("Sudarshan");
		str.add("Suraj");
		str.add("adarsh");
		System.out.println(str);
		
		Collections.sort(str);
		System.out.println(str);
		
		ArrayList<String> str1= new ArrayList<>();
		str1.add("Yogesh");
		str1.add("Amit");
		str1.add("Sumit");
		str1.add("sudarshan");
		str1.add("Suraj");
		str1.add("adarsh");
		System.out.println(str1);
		
		Collections.sort(str1, String.CASE_INSENSITIVE_ORDER);
		System.out.println(str1);

	}

}

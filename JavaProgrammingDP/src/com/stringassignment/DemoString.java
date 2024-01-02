package com.stringassignment;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.  String create with new operator and without new
		String str= new String ("Aaaaa");
		String str1="Aaaa";
		 str="Aaaa";
		String str3=str1;
		//2.Compare string using == when we create without new see same reference is there
		
		if(str==str1)
			System.out.println("Same");
		else
			System.out.println("Not same");
		
		
		System.out.println(str.equals(str1));
		
		System.out.println(str);
		//.  3.Compare string using new operator when new is present see different reference is there
		
		String str4= new String("Bbbbb");
		if(str4==str1)
			System.out.println("Same");
		else
			System.out.println("Not same");
		
	}

}

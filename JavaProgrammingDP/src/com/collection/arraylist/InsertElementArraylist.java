package com.collection.arraylist;

import java.util.ArrayList;

//4.        Create arraylist of 10 integers. Insert an element at 7th position.
public class InsertElementArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> obj= new ArrayList<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(8);
		obj.add(9);
		obj.add(10);
		System.out.println(obj);
		
		obj.add(6, 77);
		System.out.println(obj);
		
		
		
	}

}

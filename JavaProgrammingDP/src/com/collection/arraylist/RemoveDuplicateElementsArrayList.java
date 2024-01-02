package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

//.     Create arraylist of characters. Remove duplicate characters from the list. 
//		E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’} Output should be {‘d’ , ‘g’ , ‘h’}
public class RemoveDuplicateElementsArrayList {

	public static void main(String[] args) {
		ArrayList<Character> chList=new ArrayList<>();
		chList.add('a');
		chList.add('d');
		chList.add('a');
		chList.add('s');
		chList.add('g');
		chList.add('a');
		chList.add('d');
		chList.add('d');
		chList.add('k');
		chList.add('d');
		chList.add('k');
		System.out.println(chList);
		
		
		for(int i=0; i<chList.size(); i++) {
			
			for(int j=i+1; j<chList.size();j++) {
				int count=0;
				if(chList.get(i)==chList.get(j)) {
					count++;
					
				}
				if(count>0) {
					chList.remove(j);
					j--;
				}
			}
		}
		System.out.println(chList);
		
		ArrayList<Character> chList1=new ArrayList<>();
		chList1.add('a');
		chList1.add('d');
		chList1.add('a');
		chList1.add('s');
		chList1.add('g');
		chList1.add('a');
		chList1.add('d');
		chList1.add('k');
		chList1.add('d');
		chList1.add('k');
		//System.out.println(chList1);
		
		

	}

}

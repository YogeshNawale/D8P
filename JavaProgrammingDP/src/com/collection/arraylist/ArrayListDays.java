package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

//.     Create arraylist of string. Add 7 days to list ( Monday , Sunday etc) 
//		Remove elements from list for which string length is more than 7
public class ArrayListDays {

	public static void main(String[] args) {
		ArrayList<String> days=new ArrayList<>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wenesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("sunday");
		
		System.out.println(days);
		
		Iterator<String> itr= days.iterator();
		while(itr.hasNext()) {
			if(itr.next().length()>7) {
				itr.remove();
				
			}
		}
		System.out.println(days);
		
		
	}

}

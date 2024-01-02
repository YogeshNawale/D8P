package com.test5;

import java.util.ArrayList;
// write a code to remove duplicate elements 
public class Q1 {

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<String>();
		al.add("Sun");
		al.add("Mon");
		al.add("Sun");
		al.add("Wed");
		al.add("Sun");
		al.add("Sun");
		al.add("Mon");
		al.add("Mon");
		al.add("Sun");
		al.add("Wed");
		
		
		for(int i=0; i<al.size();i++) {
			for (int j=i+1; j<al.size(); j++) {
				if(al.get(i).equals(al.get(j))) {
					al.remove(j);
					j--;
				}
			}
		}
		
		System.out.println(al);
	}

}

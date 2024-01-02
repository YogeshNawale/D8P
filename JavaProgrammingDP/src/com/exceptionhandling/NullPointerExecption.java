package com.exceptionhandling;
//9. WAP to show 3 different scenario in which null pointer exceptions generated, and handle that exception.

public class NullPointerExecption {

	public static void main(String[] args) {
		int arr[]=null;
		String str=null;
		
		
		try {
			for(int i=0; i<str.length(); i++)
				System.out.println(i);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		try {
			for(int i=0; i<arr.length; i++)
				System.out.println(i);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}

		try {
			str.substring(4);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		try {
			str.length();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}

}

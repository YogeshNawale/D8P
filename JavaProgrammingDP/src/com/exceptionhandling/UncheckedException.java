package com.exceptionhandling;
// 6. WAP to show unchecked exception
public class UncheckedException {

	public static void main(String[] args) {

		String str=null;
		try {
			for(int i=0; i<str.length(); i++)
				System.out.println(i);
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main ends");
	}

}

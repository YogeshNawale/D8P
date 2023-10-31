package com.Oops;

public class OverloadingMainMethod {

	public static void main(int args) {
		System.out.println("Integer");
	} 
	public static void main(String[] args) {
		System.out.println("String");
		
		main(9);
	
		
	}

}

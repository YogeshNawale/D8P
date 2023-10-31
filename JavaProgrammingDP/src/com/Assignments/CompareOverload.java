package com.Assignments;
/* Design a class to overload a function compare( ) as follows:
	(a) void compare (int, int) – to compare two integer values and print the greater of the two integers.
	(b) void compare (char,char) – to compare the numeric value of two characters and print the 
	character with higher numeric value. 	*/

public class CompareOverload {

	public void compare(int a, int b ) {
		if(a>b)
		System.out.println(a+" is greater.");
		else
			System.out.println(b+" is greater.");
	}
	
	public void compare(char a, char b) {
		int i=(int) a;
		int j=(int) b;
		if (i>j) 
			System.out.println(a+" is greater.");
		else
			System.out.println(b+" is greater.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompareOverload obj= new CompareOverload();
		obj.compare(10, 11);
		obj.compare('a', 'c');
	}
	
		
	
}

package com.test6;
//Q4. Find first non-repeating letter in the given string.			[1]
public class Q4 {

	public static void main(String[] args) {
		
		String str= "I am java developer. I";
		System.out.println(str);
		
		for (int i=0; i<str.length()-1;i++) {
			int flag=0;
			for (int j=i+1; j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("First non recurring character is : "+ str.charAt(i));
				break;
			}
		}
	}

}

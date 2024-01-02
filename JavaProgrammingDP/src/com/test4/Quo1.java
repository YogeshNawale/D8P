package com.test4;

public class Quo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="yes";
		String s2="yes";
		String s3=new String (s1);
		System.out.println(s3);
		System.out.println(s1==s2);
		System.out.println(s1=s2);
		System.out.println(s3==s1);
		System.out.println(s1.equals(s2));
		
		
		
		String x=new String ("xyz");
		x=x.toUpperCase();
		System.out.println(x);
		String y=x.replace('Y', 'y');
		System.out.println(y);
		y=y+"abc";
		System.out.println(y);
		
		x=x+y;
		
	}

}

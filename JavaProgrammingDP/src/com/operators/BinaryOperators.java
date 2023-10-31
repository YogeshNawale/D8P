package com.operators;

public class BinaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a;
		//a = 51%9*2/2+2;
		//System.out.print(a);
	
		//int a;
		//a = 2*2/4+2*(7/2+1);
		//System.out.print(a);
		
		//int a;
		//a = 8%3*(6+2)/2;
		//System.out.print(a);
		
		//int a;
		//a = (7+2*4)*6*2/3;
		//System.out.print(a);
		
		//int a;
		//a = 7*2/(8+4*6)+(4*4/2);
		//System.out.print(a);
		
		
		int a=7, b=8, c=2, d=6; 
		boolean x1=(a>b || b>c) ;
		System.out.println(x1);
		boolean x2=(a<b || b<c) ;
		System.out.println(x2);
		boolean x3=(a>b && c>b && d>c) ;
		System.out.println(x3);
		boolean x4=(b>c && b>a && b>d) ;
		System.out.println(x4);
		boolean x5=(c<b && c<b && c<d) ;
		System.out.println(x5);
		boolean x6=(a< ++d && a<b) ;
		System.out.println(x6);
		boolean x7=(d>c || d>b) ;
		System.out.println(x7);
		boolean x8=(++a>b || b>c) ;
		System.out.println(x8);
		
	}

}

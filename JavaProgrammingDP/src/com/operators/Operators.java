package com.operators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a=2;
		// int b=3;
		// int z= ++a + ++b + a-- - --b +a ;
		// System.out.println("value of a is :"+ a + "value of b is :"+ b + "value of z is :"+ z);
		
		//int a=2;
		//int b=3;
		//int z= a++ + b++ + ++b - a ;
		//System.out.println("value of a is :"+ a + "value of b is :"+ b + "value of z is :"+ z);
		
		//int a=2;
		//int b=3;
		//int z= --b + --a + a++ + b++ -b ;
		//System.out.println("value of a is :"+ a + "value of b is :"+ b + "value of z is :"+ z);
		
		//int a=2;
		//int b=3;
		//int z=--a - --b - b-- -b -(a*2)  ;
		//System.out.println("value of a is :"+ a + "value of b is :"+ b + "value of z is :"+ z);
		
		//int a=1;
		//int b=1;
		//int z= a++ + b++ - b-- - a-- - --a - --b;
		//System.out.println("value of a is :"+ a + "value of b is :"+ b + "value of z is :"+ z);
		
		//int a=1;
		//int b=1;
		//int z= a-- - (a/2)- --a + a++ + ++b ;
		//System.out.println("value of a is :\t"+ a + "\t value of b is :"+ b + "\tvalue of z is :"+ z);
		
		 //int a=2;
		 //int b=2;
		 //int z= a++ + b++ ;
		 //System.out.println("value of a is :"+ a + "value of b is :"+ b + "value of z is :"+ z);
		 //int z1= ++a + b++ + b  ;
		 //System.out.println("value of a is :"+ a + "value of b is :"+ b + "value of z is :"+ z1);
		 //int z2= a-- - --b -a ;
		 //System.out.println("value of a is :"+ a + "value of b is :"+ b + "value of z is :"+ z2);
		
		 //int a=2;
		 //int b=3;
		 //int z= ++a + ++b ;
		 //System.out.println("value of a is :"+ a + "\tvalue of b is :\t"+ b + "\tvalue of z is :\t"+ z);
		 //int z1= ++a + b++ + a  ;
		 //System.out.println("value of a is :"+ a + "\tvalue of b is :\t"+ b + "\tvalue of z is :\t"+ z1);
		 //int z2= a++ + b++ +b + a ;
		 //System.out.println("value of a is :"+ a + "\tvalue of b is :\t"+ b + "\tvalue of z is :\t"+ z2);
		 //int z3= --a - --b -b  ;
		 //System.out.println("value of a is :"+ a + "\tvalue of b is :\t"+ b + "\tvalue of z is :\t"+ z3);
		 //int z4= a-- - b-- - --a ;
		 //System.out.println("value of a is :"+ a + "\tvalue of b is :\t"+ b + "\tvalue of z is :\t"+ z4);
		 
		 //int a=2;
		 //int b=2;
		 //int c=2;
		 //int z= c++ + a++ + b++ ;
		 //System.out.println("value of a is :"+ a + "\tvalue of b is :\t"+ b + "\tvalue of c is :\t"+ c + "\tvalue of z is :\t"+ z);
		 //int z1= ++a - ++b - ++c ;
		 //System.out.println("value of a is :"+ a + "\tvalue of b is :\t"+ b + "\tvalue of c is :\t"+ c + "\tvalue of z is :\t"+ z1);
		 //int z3= --a - b-- + c-- ;
		 //System.out.println("value of a is :"+ a + "\tvalue of b is :\t"+ b + "\tvalue of c is :\t"+ c + "\tvalue of z is :\t"+ z3);
		 //int z4= a++ - --b - ++c ;
		 //System.out.println("value of a is :"+ a + "\tvalue of b is :\t"+ b + "\tvalue of c is :\t"+ c + "\tvalue of z is :\t"+ z4);
		 //int z5= --a - --b - --c ;
		 //System.out.println("value of a is :"+ a + "\tvalue of b is :\t"+ b + "\tvalue of c is :\t"+ c + "\tvalue of z is :\t"+ z5); 
	
		 int a=0;
		 int b=0;
		 int c=0;
		 int a1= ++a - --c + b++ ;
		 System.out.println("value of a1 is :"+ a1 + "\tvalue of b is :\t"+ b + "\tvalue of c is :\t"+ c + "\tvalue of a1 is :\t"+ a1);
		 int a2= --a1 + c++ + ++b ;
		 System.out.println("value of a1 is :"+ a1 + "\tvalue of b is :\t"+ b + "\tvalue of c is :\t"+ c + "\tvalue of a2 is :\t"+ a2);
		 int a3= a2++ + c-- - --b ;
		 System.out.println("value of a2 is :"+ a2 + "\tvalue of b is :\t"+ b + "\tvalue of c is :\t"+ c + "\tvalue of a3 is :\t"+ a3);
		 int b1= ++c - ++a3 ;
		 System.out.println("value of a3 is :"+ a3 + "\tvalue of b is :\t"+ b + "\tvalue of c is :\t"+ c + "\tvalue of b1 is :\t"+ b1);
		 int b2= --c - --a3 - --b1 ;
		 System.out.println("value of a3 is :"+ a3 + "\tvalue of b1 is :\t"+ b1 + "\tvalue of c is :\t"+ c + "\tvalue of b2 is :\t"+ b2);
		 int c1= ++a3 - ++b2 - ++c ;
		 System.out.println("value of a3 is :"+ a3 + "\tvalue of b2 is :\t"+ b2 + "\tvalue of c is :\t"+ c + "\tvalue of c1 is :\t"+ c1);
		 int c2= --a3 - --b2 - --c1 -a ;
		 System.out.println("value of a3 is :"+ a3 + "\tvalue of b2 is :\t"+ b2 + "\tvalue of c is :\t"+ c + "\tvalue of c2 is :\t"+ c2);

	} 
	} 



package com.operators;

public class Assignmentoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=2,c=3;
		a-=b*=c*=10;
				System.out.println("value of a ="+ a +"\t\t\t"+"value of b ="+ b +"\t\t" +"value of c ="+ c );
		c+=a*=b-=2;
				System.out.println("value of a ="+ a +"\t\t"+"value of b ="+ b +"\t\t" +"value of c ="+ c );
		c-=a+=b+=3;
				System.out.println("value of a ="+ a +"\t\t"+"value of b ="+ b +"\t\t" +"value of c ="+ c );
		a+=c*=b*=4;
				System.out.println("value of a ="+ a +"\t\t"+"value of b ="+ b +"\t\t" +"value of c ="+ c );
		a*=b*=c*=5;
				System.out.println("value of a ="+ a +"\t\t"+"value of b ="+ b +"\t\t" +"value of c ="+ c );
				
			
		
	}

}

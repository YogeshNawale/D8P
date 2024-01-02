package com.test6;

/*
 * Q5.Print pattern :	
 0  1  2  3         
 4  5  6  
 7  8              
 9
 */
public class Q5Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=0;
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
		
		System.out.println("________________________________________________");
		System.out.println("Convert to ternary?");
		int a=1,b=2,c=3,g;
		if(a>b)	{			
			if(a>c)
				g=a;
			else
				g=c;
		}
		else{
			if(b>c)
				g=b;
			else
				g=c;
		}
		System.out.println(g);
		
		g=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(g);

	}

}

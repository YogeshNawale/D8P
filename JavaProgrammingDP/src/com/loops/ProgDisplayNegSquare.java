package com.loops;

public class ProgDisplayNegSquare {

	public static void main(String[] args) {
		 // WAP to display number between 1 to 50. 
		// If number is odd then display it in negative form.
		// If number is even then display its square.
		
		int i;
		for (i=1; i<=50; i++)
		{
			if(i%2==0)
				System.out.println(i*i);
			else
				System.out.println(i*-1);
		}

	}

}

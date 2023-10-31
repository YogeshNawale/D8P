package com.loops;

public class WhileDisplayNumNegOdd {

	public static void main(String[] args) {
		 // WAP to display number between 1 to 50. 
		// If number is odd then display it in negative form.
		// If number is even then display its square.
		
		int i=1;
		while (i<51)
		{
			if(i%2==0)
				{
				System.out.println(i*i);
				i++;
				}
			else
				{
				System.out.println(i*-1);
				i++;
				}
		}
	}

}

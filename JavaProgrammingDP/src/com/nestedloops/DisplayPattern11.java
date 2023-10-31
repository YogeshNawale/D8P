package com.nestedloops;

public class DisplayPattern11 {

	public static void main(String[] args) {
		/* Display pattern
		 *****
		  ****
		   ***
		    **
		     *			*/
		
		for (int i=5; i>=1; i--)
		{
			for (int j=5; j>=(i-1); j--)
			{
				if (i==j)
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}

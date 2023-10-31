package com.loops;

public class ProgDisplayContinue {

	public static void main(String[] args) {
		// WAP to display number between 1 to 50. 
		// Skip any number if it is divisible by 3 and 9 
		
		int i;
		for(i=1; i<=50; i++)
			{
				if (i%3==0 && i%9==0)
					continue;
				else
					System.out.println(i);
			}	
			
	}

}

package com.loops;

public class WhileDiplayContinue {

	public static void main(String[] args) {
		// WAP to display number between 1 to 50. 
		//Skip the number if it is divisible by 3 and 9.
		
		int i=1;
		while(i<51)
		{
			if (i%3==0 && i%9==0)
				{
				i++;
				continue;
				}
			else
				{
				System.out.println(i);
				i++;
				}
			
			
		}
	}

}

package com.loops;

public class WhileDispalyProg {

	public static void main(String[] args) {
		// WAP to display number between 1 to 50. If number is divisible by 3 then display 'think'.
		// If number is divisible by 5 then display 'quotient'.
		// If number is divisible by 3 and 5 then display 'think quotient'
				
				int i=1;
				
				while(i<=50)				 {
					 if (i%3==0 && i%5==0)
						 System.out.println("think quotient");
					 else if (i%3==0)
						 System.out.println("think");
					 else if (i%5==0)
						 System.out.println("quotient");
					 else
						 System.out.println(i);
					 if(i>51)
						 break;
					 i++;
				 } 
	}

}

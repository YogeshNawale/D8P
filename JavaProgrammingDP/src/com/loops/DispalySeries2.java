package com.loops;

public class DispalySeries2 {

	public static void main(String[] args) {
		// WAP to display the given series till 10th term
		// 1  8  27  65  125.....
		
		int i;
		int cube;
		for(i=1; i<=10; i++)
			{
			cube=i*i*i;
			System.out.print(cube+"  ");
			}
		

	}

}

package com.modularapproach;
// 3  9  10  30  31   93.....
import java.util.Scanner;

public class ProgSeries3 {

	public void calculateSeries(int n) {
		int num=3;
		
		for (int i=1; i<=n; i=i+2) {
			if(i==1) {
				System.out.print(num+" ");
			}
			else {
			
				int temp=num*3;
				int temp1=temp+1;
				System.out.print(temp+" "+ temp1+" ");
				num=temp1;
			}
		}
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range ");
		int n = sc.nextInt();
		
		
		ProgSeries3 obj= new ProgSeries3();
		obj.calculateSeries(n);
		
	}

}

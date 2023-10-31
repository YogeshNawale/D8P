package com.operators;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enter marks of five subjects and find total, average and percentage
		double sub1, sub2, sub3, sub4, sub5, total, average, perc;
		sub1=90;
		sub2=89;
		sub3=85;
		sub4=80;
		sub5=81.5;
		total= sub1+sub2+sub3+sub4+sub5;
		average=total/5;
		perc= (total/500)*100;
		
		System.out.println("total= "+ total + "\tAverage= " + average + "\tPercentage= " + perc);
	}

}

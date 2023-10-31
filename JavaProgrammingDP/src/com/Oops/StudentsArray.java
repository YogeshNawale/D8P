package com.Oops;
//  Write a student class which has Roll no. , name, perc, grade and array of integer for marks of 5 subjects.

public class StudentsArray {

	private int rollNo;
	private String name;
	private float perc;
	private char grade;
	private int arr[];
	
	public StudentsArray() {
		arr= new int[5];
		int rollNo;
		String name;
		
	} 
	
	public StudentsArray(int rNo, String sName, int a[]) {
		rollNo=rNo;
		name=sName;
		arr=a;
	}
	
	public float calculatePerc() {
		int sum=0;
		for (int i:arr)
			sum=sum+i;
		
		perc=((float)sum/500)*100;
		return perc;
	}
	public void calculateGrade() {
		if (perc>80)
			System.out.println("Grade of Student is A" );
		else if (perc>60)
			System.out.println("Grade of Student is B" );
		else if (perc>40)
			System.out.println("Grade of Student is C" );
		else if (perc<40)
			System.out.println("Grade of Student is D" );
	}
	
	
	public void displayData() {
		System.out.println("Roll No of Student is : " + rollNo);
		System.out.println("Name of Student is : " + name);
		System.out.println("Percentage of Student is : " + perc);
		this.calculateGrade();
		
	}
	
	
	public static void main(String[] args) {

		int arr1[]= {50,70,70,80,60};
		
		StudentsArray obj= new StudentsArray(1,"Yogesh",arr1);
		obj.calculatePerc();
		obj.displayData();
		
		int arr2[]= {50,66,55,61,52};
		StudentsArray obj1= new StudentsArray(2,"Sumit",arr2);
		obj1.calculatePerc();
		obj1.displayData();
		

	}

}

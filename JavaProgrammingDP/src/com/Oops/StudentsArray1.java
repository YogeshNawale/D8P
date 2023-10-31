package com.Oops;

public class StudentsArray1 {
	private int rollNo;
	private String name;
	private float perc;
	private char grade;
	private int arr[];
	
	public StudentsArray1() {
		arr= new int[5];
		int rollNo;
		String name;
		
	} 
	
	public StudentsArray1(int rNo, String sName, int a[]) {
		this.rollNo=rNo;
		this.name=sName;
		this.arr=a;
		calculatePerc();
		calculateGrade();
	}
	public int getRollNo()
	{
		return rollNo;
	}
	
	public String getEnameName()
	{
		return name;
	}
	public float calculatePerc() {
		int sum=0;
		for (int i:arr)
			sum=sum+i;
		
		perc=((float)sum/500)*100;
		return perc;
	}
	
	
	public char calculateGrade() {
		
		if (perc>80)
			  grade= 'A';
		else if (perc>60)
			 grade= 'B';
		else if (perc>40)
			  grade= 'C';
		else 
			  grade= 'D';
		return grade;
		 
	}

	public String toString() {
		return " Roll No of Student is :  " + rollNo + "\n Name of Student is : " + name + "\n Percentage of Student is : "
				+ perc + "\n Grade of Student is : " + grade ;
	} 
	
	
	
	public static void main(String[] args) {

		int arr1[]= {50,70,70,80,60};
		
		StudentsArray1 obj= new StudentsArray1(1,"Yogesh",arr1);
		System.out.println(obj);
		
		int arr2[]= {50,66,55,61,52};
		StudentsArray1 obj1= new StudentsArray1(2,"Sumit",arr2);
		System.out.println(obj1);

	}

}

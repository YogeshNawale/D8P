package com.Oops;
// Write a employee class with appropriate data members and member methods.
// Student id, name, contact, email, 5 subject marks out of 100, percentage, grade.
public class Student {
	int sid;
	String name;
	long contact;
	String email;
	int sub1,sub2,sub3,sub4,sub5;
	float perc;
	char grade;
	
	public void setData(int id, String sname, long conta,String semail, int s1, int s2, int s3,
			int s4, int s5) {
		
		sid=id;
		name=sname;
		contact=conta;
		email=semail;
		sub1=s1;
		sub2=s2;
		sub3=s3;
		sub4=s4;
		sub5=s5;
	}
	
	public void calculatePercGrade() {
		
		 perc=(float) ((sub1+sub2+sub3+sub4+sub5)*(100.0/500.0));
		 System.out.println(" Percentage of Student is : "+ perc);
		 
		 if(perc>=80)
			 System.out.println("Grade of Student is : "+ "A");
		 else if(perc>=60)
			 System.out.println("Grade of Student is : "+ "B");
		 else if(perc>=40)
			 System.out.println("Grade of Student is : "+ "C");
		 else
			 System.out.println("Grade of Student is : "+ "D");
		
	}

	public void displayData() {
		
		System.out.println("Enter Student Id "+ sid);
		System.out.println("Enter Student name "+ name);
		System.out.println("Enter Student contact "+ contact);
		System.out.println("Enter Student email "+ email);
		System.out.println("Enter Subject 1 Marks "+ sub1);
		System.out.println("Enter Subject 2 Marks "+ sub2);
		System.out.println("Enter Subject 3 Marks "+ sub3);
		System.out.println("Enter Subject 4 Marks "+ sub4);
		System.out.println("Enter Subject 5 Marks "+ sub5);
	}
	public static void main(String[] args) {
		
		Student obj1= new Student();
		obj1.setData(1, "Yogesh N", 9404716890l, "ynawale@gmail.com", 56, 85, 90, 92, 81);
		obj1.displayData();
		obj1.calculatePercGrade();
		
		System.out.println("______________________");
		
		Student obj2= new Student();
		obj1.setData(2, "Anil K", 903487589L, "anilk@gmail.com", 65, 56, 78, 33, 56);
		obj1.displayData();
		obj1.calculatePercGrade();
		
		System.out.println("______________________");
		Student obj3= new Student();
		obj3.setData(3, "Amit K", 9438234243l, "amitk@gmail.com", 32, 40, 50, 30, 29);
		obj3.displayData();
		obj3.calculatePercGrade();
		
	}

}

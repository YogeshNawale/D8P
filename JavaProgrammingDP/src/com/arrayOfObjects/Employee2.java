package com.arrayOfObjects;

import com.inheritance.MyDate;

/*2.	WAP to print the employees from Employee[] array who has same joining date. 
 * 		You have Employee class which has 4 attributes id, name, salary, date 
 * 		(date is another object which has 3 attributes day, month, year) and 
 * 		add employee objects to your array
*/
public class Employee2 {
	private int eid;
	private String name;
	private double salary;
	private Date2 doj;
	
	// default constructor
	public Employee2() {	
		System.out.println("I am in default Constructor in Employee");
		eid=0;
		name="";
		salary=0;
		doj=new Date2();
	}
	//Parameterized constructor
	public Employee2 (int eid,String name,double salary,Date2 d) {
		System.out.println("I am in parameterized Constructor in Employee");
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.doj=d;
	}
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setDoj(Date2 o)
	{
		this.doj=o;
	}
	public int getEid()
	{
		return eid;
	}
	
	public String getEname()
	{
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public Date2 getDoj()
	{
		return doj;
	}
		
	
	
	
	public String toString()
	{
		return "Eid "+eid+" Ename "+name+" Salary : "+ salary +" Date of Joining "+doj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2[] arr= new Employee2[5];
		arr[0]=new Employee2(01,"Amit",50000,new Date2(20,10,2023));
		arr[1]=new Employee2(02,"Aman",55000,new Date2(25,10,2023));
		arr[2]=new Employee2(03,"Ashok",50000,new Date2(20,10,2023));
		arr[3]=new Employee2(04,"Yogesh",45000,new Date2(25,10,2023));
		arr[4]=new Employee2(05,"Amol",50000,new Date2(20,10,2023));
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("________________________________________________");
			System.out.println("Same Date of Joining for : " +arr[i]);
			for (int j = 0; j < arr.length; j++)
				if (i!=j && arr[i].getDoj().compare(arr[j].getDoj())){
			
					System.out.println( arr[j]);
					
				}

		}
		
		
	}

}

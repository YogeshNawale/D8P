package com.arrayOfObjects;
/*
 * 3.	Create class Dept(did, dname), class MyDate(day, month, year)
		a.	Class Employee(emp_id, emp_name, salary, date(object), dept(object)). 
		Create array of Employee and display the array elements.
4.	Same as above but print Employees whose dept_name is same.

 */
public class Dept3 {
	private int id;
	private String name;
	
	
	public Dept3(){
		System.out.println("I am in default Const in Dept3");

		id=0;
		name="";
		
	}
	public Dept3(int id,String name ) {
		System.out.println("I am in parameterized const in Dept3");
		this.id=id;
		this.name=name;
		 
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public boolean compare (Dept3 o) {
		boolean result =false;
		if(this.id==o.id && this.name==o.name)
			result=true;
		
		return result;
	}
	public String toString() {
		return " Department ID : "+id+" Department Name : "+ name  ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

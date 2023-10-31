package com.Oops;
// Practice on Instance 
import com.Assignments.Employee;

public class InstanceAndStaticBlock {
	private int emp_id;
	private String name;
	private double sal;
	static String companyName="Think Quotient";
	
	{
		System.out.println("I am in instance init block");
		
	}
	
	static {
		System.out.println("I am in static init block");
		companyName="New Name";
	}
	
	public InstanceAndStaticBlock(){
		int emp_id;
		String name;
		double sal;
	}
	
	public InstanceAndStaticBlock(int id, String n, double s ) {
		emp_id=id;
		name=n;
		sal=s;
	}
	
	public void setEmp_id(int id) {
		emp_id=id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	} 
	public void setSal(double s) {
		sal=s;
	}
	public double getSal() {
		return sal;
	}
	
	public void setData(int id, String n, double s) {
		emp_id=id;
		name=n;
		sal=s;
		
	}
	
	public void displayData() {
		System.out.println("Employee ID is :     "+ emp_id);
		System.out.println("Employee Name is :   "+ name);
		System.out.println("Employee Salary is : "+ sal);
		System.out.println("Company Name :       "+companyName);
	}
	
	public void compareSal(InstanceAndStaticBlock obj1) {
		if(this.sal>obj1.sal)
			System.out.println(this.emp_id+"."+this.name +" has greater salary than "+ obj1.emp_id+"."+ obj1.name);
		else
			System.out.println(obj1.emp_id+"."+ obj1.name +" has greater salary than "+ this.emp_id+"."+this.name);
	}
	public static void setCompanyName(String coName) {
		companyName=coName;
	}
	
	public static void main(String[] args) {
		
		InstanceAndStaticBlock obj= new InstanceAndStaticBlock();
		obj.setEmp_id(1);
		obj.setName("Yogesh");
		obj.setSal(50000);
		obj.displayData();
		
		InstanceAndStaticBlock.setCompanyName("Think Quotient Pvt Ltd");
		
		InstanceAndStaticBlock obj1= new InstanceAndStaticBlock(2,"Sumit",40000);
		obj1.displayData();
		
		obj.compareSal(obj1);
		
		InstanceAndStaticBlock obj2= new InstanceAndStaticBlock();
		
	}

	

}

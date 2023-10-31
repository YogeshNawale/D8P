package com.inheritance;

public class Employee {
	private int eid;
	private String name;
	private double salary;
	private MyDate doj;
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor of Employee");
		eid=0;
		name="";
		doj=new MyDate();
		salary=0;
		
	}
	public double getSalary()
	{
		return salary;
	}
	public Employee (int eid,String name,double sal,MyDate d)
	{
		System.out.println("Parametric  constructor of Employee");
		this.eid=eid;
		this.name=name;
		this.salary=sal;
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
	public void setDoj(MyDate o)
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
	public MyDate getDoj()
	{
		return doj;
	}
		
	
	
	
	public String toString()
	{
		return "Eid "+eid+" Ename "+name+ " Salary "+salary+" Date of Joining "+doj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee obj=new Employee();
			System.out.println(obj);
			MyDate d=new MyDate(10,10,2023);
			Employee obj1=new Employee(101, "Kusum",50000, d);
			System.out.println(obj1);
			
			Employee obj2=new Employee();
			obj2.setDoj(new MyDate(20,10,2023));
			obj2.setEid(102);
			obj2.setName("Hardik");
			
			int id=obj.getEid();
			String name=obj.getEname();
			MyDate doj=obj.getDoj();
			System.out.println(id);
			System.out.println(name);
			System.out.println(doj);

	}

}

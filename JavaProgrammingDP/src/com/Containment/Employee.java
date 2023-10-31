package com.Containment;

public class Employee {
	private int eid;
	private String name;
	private MyDate doj;
	
	// default constructor
	public Employee() {		  
		eid=0;
		name="";
		doj=new MyDate();
	}
	//Parameterized constructor
	public Employee (int eid,String name,MyDate d)
	{
		this.eid=eid;
		this.name=name;
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
		return "Eid "+eid+" Ename "+name+" Date of Joining "+doj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee obj=new Employee();
			System.out.println(obj);
			MyDate d=new MyDate(10,10,2023);
			Employee obj1=new Employee(101, "Kusum", d);
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

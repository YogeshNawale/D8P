package com.cloning.shallowcloning;


public class Employee implements Cloneable,Comparable{

	int eid,sal;
	String name;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eid, int sal, String name) {
		super();
		this.eid = eid;
		this.sal = sal;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", sal=" + sal + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Employee e=(Employee) o;
		if(this.sal==e.sal)
			return 0;
		else if(this.sal>e.sal)
			return 1;
		else
			return -1;
		//return this.name.compareTo(e.name);
	}
	@Override
	public   Employee clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Employee) super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Employee  e1=new Employee(101, 35000, "Peter");
		Employee e2=(Employee) e1.clone();
		System.out.println(e1);
		System.out.println(e1.hashCode());
		System.out.println(e2);
		System.out.println(e2.hashCode());

		
		Employee obj1=new Employee(101, 45000, "Pratik");
		Employee obj2=new Employee(102, 67000, "Anand");
		
		System.out.println(obj1);
		System.out.println(obj2);
		int res=obj1.compareTo(obj2);
		if(res==0)
		{
			System.out.println(obj1.name +" and  "+obj2.name +" has same salary");
			
		}
		else if(res==1)
			System.out.println(obj1.name+" has higher salary than " +obj2.name);
		else
			System.out.println(obj2.name+" has higher salary than " +obj1.name);
	
	}




}

package com.collection.linkedhashset;



public class Employee {

	private int eid;
	private String ename;
	private double sal;
	
	public Employee() {
		
	}
	public Employee(int eid, String ename, double sal) {
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;
	}
	public void setEId(int eid) {
		this.eid=eid;
	}
	public int getEId() {
		return eid;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	

	@Override
	public int hashCode() {
		 
		return (int) (eid+sal+ename.hashCode()%71);
	}
	@Override
	public boolean equals(Object o) {
		 if(this==o)
			 return true;
		 if(o==null)
			 return false;
		 if(this.getClass()!=o.getClass())
			 return false;
		 
		Employee e= (Employee) o;
		if(this.eid==e.eid && this.ename.equals(e.ename) && this.sal==e.sal )
			return true;
		else return false;
	}
}

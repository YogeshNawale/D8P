package com.test6;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 * Q3.Entries in map is being added like,							 [2]
 		map.put(new Emp(12,”Amit”),”Sales”); 
 		map.put(new Emp(12,”Amit”),” Marketing”); 
	What is expected correct output if we display map?  
 	What precaution should be taken for that and why? Write code for the same.
 
 */
class Employee{
	private int eid;
	private String ename;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(eid, ename);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid && Objects.equals(ename, other.ename);
	}
	
}
public class Q3 {

	public static void main(String[] args) {
		Map <Employee,String> map= new HashMap<>();
		map.put(new Employee(12,"Amit"),"Sales"); 
 		map.put(new Employee(12,"Amit"),"Marketing");
 		
 		System.out.println(map);

	}

}

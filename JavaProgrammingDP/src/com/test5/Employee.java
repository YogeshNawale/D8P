package com.test5;

import com.collection.treemap.Book;

public class Employee {
	private int eid;
	private String ename;
	private Dept d;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, Dept d) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.d = d;
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

	public Dept getD() {
		return d;
	}

	public void setD(Dept d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", Dept" + d + "]";
	}

}

class Dept {
	private int did;
	private String dname;

	public Dept() {
		// TODO Auto-generated constructor stub
	}

	public Dept(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return did;
	}

	@Override
	public boolean equals(Object obj) {
		Dept other = (Dept) obj;

		if (this.did == other.did)
			return true;
		else
			return false;

	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}

}

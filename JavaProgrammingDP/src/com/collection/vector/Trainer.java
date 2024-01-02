package com.collection.vector;

public class Trainer {
	String name;
	int exp;
	String qualification;
	
	
	public Trainer() {
		 
	}

	public Trainer(String name, int exp, String qualification) {
		 
		this.name = name;
		this.exp = exp;
		this.qualification = qualification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Trainer [name=" + name + ", exp=" + exp + ", qualification=" + qualification + "]";
	}
	
	
	
}

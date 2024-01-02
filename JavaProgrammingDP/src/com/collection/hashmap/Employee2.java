package com.collection.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Employee2 {
	private int eid;
	private String ename;
	private Double salary;
	ArrayList<String> skills;

	public Employee2() {

	}

	public Employee2(int eid, String ename, Double salary, ArrayList<String> skills) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.skills = skills;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee2 [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", skills=" + skills + "]";
	}

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<>(Arrays.asList("Core Java", "SQL", "Anguler"));
		ArrayList<String> al2 = new ArrayList<>(Arrays.asList("C", "C++", "Anguler"));
		ArrayList<String> al3 = new ArrayList<>(Arrays.asList(".Net", "SQL", "Anguler"));
		ArrayList<String> al4 = new ArrayList<>(Arrays.asList("C++", "SQL", "DOS"));

		ArrayList<Employee2> e = new ArrayList<>();

		e.add(new Employee2(101, "Yogesh", 70000.0, al1));
		e.add(new Employee2(102, "Suraj", 80000.0, al2));
		e.add(new Employee2(103, "Adarsh", 75000.0, al3));
		e.add(new Employee2(104, "Abhishek", 65000.0, al4));

		Map<String, ArrayList<Employee2>> hm = new HashMap<>();

		Iterator<Employee2> itr = e.iterator();
		while (itr.hasNext()) {
			Employee2 etemp = itr.next();
			ArrayList<String> stemp = etemp.getSkills();
			Iterator<String> skill = stemp.iterator();
			while (skill.hasNext()) {
				String str = skill.next();
				if (hm.containsKey(str)) {
					ArrayList<Employee2> list = hm.get(str);
					list.add(etemp);
					hm.put(str, list);
				} else {
					ArrayList<Employee2> list = new ArrayList<>();
					list.add(etemp);
					hm.put(str, list);
				}
			}

		}
		
		Set<Entry<String,ArrayList<Employee2>>> s= hm.entrySet();
		for(Entry<String,ArrayList<Employee2>> ele : s) {
			System.out.println("Skill : "+ele.getKey());
			
			ArrayList<Employee2> alist=ele.getValue();
			for(Employee2 std : alist)
				System.out.println("\t"+std);
		}
	}
}

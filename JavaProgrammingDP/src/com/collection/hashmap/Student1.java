package com.collection.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*2>WAP to create a ArrayList Student which contain rollno,name,arrayList marks,percentage ,grade.
	From Above arrayList create a Map which having key as a grade and value is ArrayList<Student> .
 * 
 */
public class Student1 {
	private int rollNo;
	private String name;
	private ArrayList<Integer> marks;
	private double perc;
	private String grade;

	public Student1() {

	}

	public Student1(int rollNo, String name, ArrayList<Integer> marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.perc=calculatePerc();
		this.grade=calculateGrade();

	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getMarks() {
		return marks;
	}

	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}

	public double getPerc() {
		return perc;
	}

	public void setPerc(double perc) {
		this.perc = perc;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double calculatePerc() {
		double sum = 0;
		for (int a : marks) {
			sum = (double) sum + a;
		}
		perc = sum / 5;
		return perc;
	}

	public String calculateGrade() {
		if (perc >= 90)
			grade = "A";
		else if (perc >= 80)
			grade = "B";
		else if (perc >= 70)
			grade = "C";
		else if (perc >= 60)
			grade = "D";
		else if (perc >= 50)
			grade= "E";
		else
			grade="F";
		
		return grade;
	}

	@Override
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", perc=" + perc + ", grade="
				+ grade + "]";
	}

	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(78);
		al1.add(79);
		al1.add(68);
		al1.add(58);
		al1.add(62);

		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(88);
		al2.add(86);
		al2.add(78);
		al2.add(78);
		al2.add(72);

		ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(65,34,65,34,34));
		ArrayList<Integer> al4 = new ArrayList<>(Arrays.asList(55,34,45,34,44));
		ArrayList<Integer> al5 = new ArrayList<>(Arrays.asList(85,94,95,84,74));
		ArrayList<Integer> al6 = new ArrayList<>(Arrays.asList(95,94,95,84,94));
		
		Student1 s1= new Student1(101, "Yogesh", al1);
		Student1 s2= new Student1(102, "Amit", al2);
		Student1 s3= new Student1(103, "Suraj", al3);
		Student1 s4= new Student1(104, "Sudarshan", al4);
		Student1 s5= new Student1(105, "Prashant", al5);
		Student1 s6= new Student1(106, "Adarsh", al6);

		
		ArrayList<Student1> arrlist= new ArrayList <> ();
		arrlist.add(s1);
		arrlist.add(s2);
		arrlist.add(s3);
		arrlist.add(s4);
		arrlist.add(s5);
		arrlist.add(s6);
		
		for(Student1 s: arrlist)
			System.out.println(s);
		
		System.out.println("*********************************************************************");

		Map<String,ArrayList<Student1>> hm= new HashMap<>();
		
		Iterator<Student1> itr=arrlist.iterator();
		
		while(itr.hasNext()) {
			Student1 s=itr.next();
			if(hm.containsKey(s.getGrade())) {
				ArrayList<Student1> list= hm.get(s.getGrade());
				list.add(s);
				hm.put(s.getGrade(), list);
			}
			else {
				ArrayList<Student1> alist=new ArrayList<>();
				alist.add(s);
				hm.put(s.getGrade(), alist);
			}
		}
		
		Set<Entry<String,ArrayList<Student1>>> s= hm.entrySet();
		for(Entry<String,ArrayList<Student1>> ele : s) {
			System.out.println("Grade : "+ele.getKey());
			
			ArrayList<Student1> alist=ele.getValue();
			for(Student1 std : alist)
				System.out.println("\t"+std);
		}

		
	}

}

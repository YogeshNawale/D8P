package com.exceptionhandling;
class InvaidMarksExecption extends Exception {
	int m1,m2,m3,m4,m5;
	public InvaidMarksExecption() {
		
	}
	public InvaidMarksExecption(int m1, int m2, int m3, int m4, int m5) {
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		
	}
	@Override
	public String toString() {
		return "Invaid Marks  [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + ", m5=" + m5 + "]";
	}
	
}
public class Student {
	String name;
	int m1,m2,m3,m4,m5;
	
	public Student() {
		
	}
	public Student(String name, int m1, int m2, int m3, int m4, int m5) throws InvaidMarksExecption {
		
		if(m1<0||m1>100||m2<0||m2>100||m3<0||m3>100||m4<0||m4>100||m5<0||m5>100)
			throw new InvaidMarksExecption(m1,m2,m3,m4,m5);
		
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + ", m5=" + m5 + "]";
	}
	public static void main(String[] args) {
		try {
			Student obj= new Student("Yogesh",45,-33,65,776,76);
			System.out.println(obj);
		}catch(InvaidMarksExecption e) {
			System.out.println(e);
		}
	}

}

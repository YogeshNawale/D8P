package com.accessmodifier;

public class Student {

	public int rollNo=10;
	protected int admissionNo=101;
	int age=21;
	private int courseId=01;
	
	public void doPublic() {
		
	} 
	void doDefault() {
		
	}
	protected void doProtected() {
		
	}
	private void doPrivate() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj= new Student();
		obj.rollNo=10;
		obj.doPublic();
		
		obj.admissionNo=101;
		obj.doProtected();
		
		obj.age=21;
		obj.doDefault();
		
		obj.courseId=01;
		obj.doPrivate();
		
	}

}

class TQPPStudent extends Student {
	
	public void checkStudentVariableAccess() {
		  rollNo=12;
		  admissionNo=102;
		  age=22;
		  // courseId=01; cannot call private variable in other class
		  
	}
	public void checkStudentMethodAccess(){
		doPublic();
		doDefault();
		doProtected();
		// doPrivate(); cannot call private method in other class
	}
}
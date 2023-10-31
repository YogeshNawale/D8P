package com.accessmodifier2;
import com.accessmodifier.*;

public class OtherPackageStudent extends Student{

	public void checkStudentVariableAccess() {
		rollNo=12; 
		admissionNo=102;// protected variable called through inheritance in other package 
		//age=22;   	cannot default variable in other package
		//courseId=01;  cannot call private variable in other package
	}
	public void checkStudentMethodAccess() {
		doPublic();
		//doDefault(); cannot call defaut method in other package
		doProtected(); //called  protected method in other package through inheritance
		//doPrivate(); cannot call private method in other package
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

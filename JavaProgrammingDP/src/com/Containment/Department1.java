package com.Containment;

/*	WAP to have Department class created with id, name . Student class has roll, name and 
 * Department object should have id and name. Assign and print individual values in main method
*/
public class Department1 {

	private int id;
	private String name;
	private Student1 stud;
	
	public Department1(){
		id=0;
		name="";
		stud=new Student1();
	}
	public Department1(int id,String name,Student1 stud) {
		this.id=id;
		this.name=name;
		this.stud=stud;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setStudent1(Student1 stud) {
		this.stud=stud;
	}
	public Student1 getStudent1() {
		return stud;
	}
	public String toString() {
		return "Department ID : "+id+"\tDepartment Name : "+ name +"\t"+ stud;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department1 obj=new Department1(1,"Science",new Student1(101,"Yogesh"));
		System.out.println(obj);
		
		Student1 d= new Student1(102,"Amit");
		Department1 obj1= new Department1(2,"Arts",d);
		System.out.println(obj1);
	}

}

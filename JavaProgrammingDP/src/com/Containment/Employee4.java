package com.Containment;
/*	Create Employee class which has attributes (id, name, salary, dept,
mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter
*/
public class Employee4 {
	private int id;
	private String name;
	private double salary;
	private MyDate4 doj;
	private dept4 dept;
	
	 public Employee4(){
		System.out.println("I am in default const of Empolyee4");
		id=0;
		name="";
		salary=0.0;
		doj=new MyDate4();
		dept= new dept4();
	}
	public Employee4(int id, String name, double sal, dept4 dept ,MyDate4 doj ){
		System.out.println("I am in parameterized const in Employee4");

		this.id=id;
		this.name=name;
		this.salary=sal;
		this.doj=doj;
		this.dept=dept;
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
	public String getName(){
		return name;
	}
	public void setSalary(double sal) {
		salary=sal;
	}
	public double getSalary() {
		return salary;
	}
	public void setMyDate(MyDate4 doj) {
		this.doj=doj;
	} 
	public MyDate4 getMyDate() {
		return doj;
	}
	public void setDept(dept4 dep) {
		dept=dep;
	}
	public dept4 getDept() {
		return dept;
	}
	
	public String toString() {
		return "Employee[ID : "+ id + " Name : "+ name + " Salary : "+ salary + dept + doj+ "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dept4 d= new dept4(01,"Software Developer");
		MyDate4 j= new MyDate4(22,10,2023);
		Employee4 obj= new Employee4 (1,"Yogesh",50000 , d,j);
		System.out.println(obj);
		
		Employee4 obj1= new Employee4(2,"Amit", 60000, new dept4(2,"Manager"), new MyDate4(20,10,2023));
		System.out.println(obj1);
	}

}

package com.Containment;
/*	Create Employee class which has attributes (id, name, salary, dept,
mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter
*/
public class dept4 {
	private int id;
	private String name;
	
	
	public dept4(){
		System.out.println("I am in default Const in dept4");

		id=0;
		name="";
		
	}
	public dept4(int id,String name ) {
		System.out.println("I am in parameterized const in dept4");
		this.id=id;
		this.name=name;
		 
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
	
	public String toString() {
		return " Department ID : "+id+" Department Name : "+ name  ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dept4 obj=new dept4(1,"Science" );
		System.out.println(obj);
		
		
		dept4 obj1= new dept4(2,"Arts");
		System.out.println(obj1);
	}

}

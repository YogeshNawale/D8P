package com.Containment;

/*	Create class Person which has attributes (name, gender, age, Address).
	Address is class which has attributes (city, state, country). Display Persons data
Note. Containment using constructor and getter/setter
*/
public class Person3 {

	private String name,gender;
	private int age;
	private Address3 add;
	
	public Person3(){
		name="";
		gender="";
		age=0;
		add=new Address3();
	}
	
	public Person3(String name, String gender, int age,Address3 add) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.add=add;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address3 getAdd() {
		return add;
	}

	public void setAdd(Address3 add) {
		this.add = add;
	}

	public String toString() {
		return  "Person [ Name=" + name + ", Gender=" + gender +", age="+ age +", Address"
				+ add+ "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person3 obj= new Person3("Yogesh","Male",27,new Address3("Pune","MH","India"));
		System.out.println(obj);
	}

}

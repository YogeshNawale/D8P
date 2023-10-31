package com.Containment;
/*	Create class Person which has attributes (city, gender, age, Address).
	Address is class which has attributes (city, state, country). Display Persons data
	Note. Containment using constructor and getter/setter
*/
public class Address3 {

	private String city,state,country;
	
	Address3(){
		
	}
	Address3(String city, String state, String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
	
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String toString() {
		return " City : "+ city + " State : "+ state + " Country : "+ country;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address3 obj= new Address3("Pune","MH","India");
		System.out.println(obj);
		
		Address3 obj1= new Address3("Mumbai","MH","India");
		System.out.println(obj1);
		
	}

}

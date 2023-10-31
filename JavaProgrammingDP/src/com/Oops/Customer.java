package com.Oops;

// Write a class Customer and count number of customer objects and print number of customers 
// before and after creating 3 objects of customers.
public class Customer {
	static int count = 0;
	int customerNo=count  ;
	String customerName, email;
	long mobNo;

	public Customer() {
		customerNo=count++;
	}

	public Customer(String cName, String cemail, long cmobNo) {
		customerName = cName;
		email = cemail;
		mobNo = cmobNo;
		customerNo=count++;
	}

	public void setData(String cName, String cemail, long cmobNo) {
		customerName = cName;
		email = cemail;
		mobNo = cmobNo;
	}

	public void displayData() {
		System.out.println("Customer id      : " + customerNo);
		System.out.println("Customer Name    : " + customerName);
		System.out.println("Customer Email   : " + email);
		System.out.println("Customer Mob No. : " + mobNo);
		if( count %3==0)
		System.out.println("Number of Customers : "+count);
		System.out.println("_____________________________________\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj = new Customer("Yogesh", "yogesh@gmail.com", 935782970);
		obj.displayData();

		Customer obj1 = new Customer("Amit", "amit@gmail.com", 938962370);
		obj1.displayData();

		Customer obj2 = new Customer("Amol", "amol@gmail.com", 923442970);
		obj2.displayData();

		Customer obj3 = new Customer("Amol", "amol@gmail.com", 923442970);
		Customer obj4 = new Customer("Amol", "amol@gmail.com", 923442970);
		Customer obj5 = new Customer("Amol", "amol@gmail.com", 923442970);
		obj5.displayData();
	}

}

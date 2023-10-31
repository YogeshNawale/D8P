package com.Oops;

public class Employee1 {

	int eid;
	String ename,email;
	float basicSalary, pf, hra, da, netSal;
	
	public void setData(int id, String name, String eemail, float bsal) {
		eid=id;
		ename=name;
		email=eemail;
		basicSalary=bsal;
	}
	
		public void calculatePF() {
			pf= (float)(basicSalary*0.1);	
		}
		public void calculateHRA() {
			hra= (float)(basicSalary*0.15);
		}
		public void calculateDA() {
			da= (float)(basicSalary*0.2);
		}
		public void calculatenetSal() {
			netSal= (float)(basicSalary-(pf+hra+da));
		}
		
		
		public void displayData() {
			
			System.out.println("Employee Id "+ eid);
			System.out.println("Employee Name "+ ename);
			System.out.println("Employee Email "+ email);
			System.out.println("Employee Basic Salary "+ basicSalary);
			System.out.println("PF of Employee "+ pf);
			System.out.println("HRA of Employee "+ hra);
			System.out.println("DA of Employee "+ da);
			System.out.println("Net Salary of Employee "+ netSal);
			System.out.println("\n");
			
		}
	public static void main(String[] args) {
		
		Employee1 obj= new Employee1();
		obj.setData(1, "Yogesh N", "yogeshN@gmail.com", 50000f);
		obj.calculatePF();
		obj.calculateHRA();
		obj.calculateDA();
		obj.calculatenetSal();
		obj.displayData();
		
		Employee1 obj1= new Employee1();
		obj1.setData(2, "Mangesh N", "mangeshN@gmail.com", 70000f);
		obj1.calculatePF();
		obj1.calculateHRA();
		obj1.calculateDA();
		obj1.calculatenetSal();
		obj1.displayData();

	}

}

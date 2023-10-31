package com.Oops;

public class ReturnPrimitiveDataTypes {
	private int dd, mm, yy;

	public ReturnPrimitiveDataTypes() {
		dd = 17;
		mm = 10;
		yy = 2023;

	}

	public ReturnPrimitiveDataTypes(int d, int m, int y) {
		 dd = d;
		mm =  m;
		yy =  y;
	}

	public ReturnPrimitiveDataTypes getObject() {
		// return new ReturnPrimitiveDataTypes(20,3,2023);
		return this;
	}

	public void printdata() {
		System.out.println("The Date is " + dd + "/" + mm + "/" + yy);
	}

	public static void main(String[] args) {

		ReturnPrimitiveDataTypes obj = new ReturnPrimitiveDataTypes();
		ReturnPrimitiveDataTypes o1=obj.getObject();
		o1.printdata();

		ReturnPrimitiveDataTypes obj1 = new ReturnPrimitiveDataTypes(1, 10, 2023);
		ReturnPrimitiveDataTypes o2= obj1.getObject();
		o2.printdata();

		
	}

}

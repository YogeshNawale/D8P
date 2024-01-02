package com.test4;

public class Test1 {

	int count=0;
	void A() throws Exception{
		try {
			count++;
			try {
				count++;
				try {
					count++;
					throw new Exception();
				}
				catch(Exception ex) {
					count++;
					throw new Exception();
				}
			}
			catch(Exception ex) {
				count++;
			}
		}
		catch(Exception ex) {
			count++;
		}
	}
	
	void dislay() {
		System.out.println(count);
	}
	public static void main(String[] args) throws Exception {
		 Test1 obj= new Test1();
		 obj.A();
		 obj.dislay();

	}

}

package com.exceptionhandling;

public class ExceptionDividebyZero {

	public int result(int a) {
		int res=0;
		try {
			for (int i = 3; i >= 0; i--) {
				res = a / i;
//				System.out.println(res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(" I am in Finally");
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		int a = 5;
		ExceptionDividebyZero obj = new ExceptionDividebyZero();
//		try {
			int r=obj.result(a);
			System.out.println(r);
//		} catch (ArithmaticException e) {
//			e.printStackTrace();
//		}

		System.out.println("Main end");

	}

}

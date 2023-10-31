package com.Oops;

public class TestDateSetterGetter {

	public static void main(String[] args) {
		
		DateSetterGetter obj= new DateSetterGetter();
		obj.setDd(17);
		obj.setMm(10);
		obj.setYy(2023);
		obj.printdata();
		
		obj.setDd(18);
		int d= obj.getDd();
		System.out.println(d);
		
		obj.setMm(11);
		obj.printdata();
		int m= obj.getMm();
		System.out.println(m);
		
		obj.setYy(2024);
		obj.printdata();
		int y=obj.getYy();
		System.out.println(y);
	
	}

}

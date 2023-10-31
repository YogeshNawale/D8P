package com.objectClasses;

// hashCode(), equals()
public class MyDate {

	// data member
	private int dd, mm, yy;

	public MyDate() {

		System.out.println("I am in default Const");
		dd = 17;
		mm = 10;
		yy = 2023;

	}

	public MyDate(int dd, int mm, int yy) {

		System.out.println("I am in parameterized const");
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void setDd(int d) {
		dd = d;
	}

	public void setMm(int m) {
		mm = m;
	}

	public void setYy(int y) {
		yy = y;
	}

	public int getDd() {
		return dd;
	}

	public int getMm() {
		return mm;
	}

	public int getYy() {
		return yy;
	}

	public void setData(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}

	public String toString() {
		return dd + "/" + mm + "/" + yy;
	}

	 @Override
     public boolean equals(Object obj)
     {
    	 //Object obj=new MyDate();
    	 System.out.println("In equals");
    	 MyDate d=(MyDate)obj;
    	 if(this.dd==d.dd && this.mm==d.mm && this.yy==d.yy)
    		 return true;
    	 else
    		 return false;
    	 
    	 
     }
	 
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + dd;
//
//		return result;
//	}

	public static void main(String[] args) {
		System.out.println("I am in main");
		// Object creation
		MyDate obj = new MyDate(26, 10, 2023);
		System.out.println(obj);

		System.out.println(obj.hashCode());
		MyDate obj1 = new MyDate(26, 11, 2023);
		System.out.println(obj1);
		System.out.println(obj1.hashCode());

		MyDate obj2 = obj1;
		System.out.println(obj2);
		System.out.println(obj2.hashCode());
		System.out.println(obj.equals(obj1));

	}

}

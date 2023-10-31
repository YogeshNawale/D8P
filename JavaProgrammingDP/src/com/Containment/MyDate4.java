package com.Containment;

/*	Create Employee class which has attributes (id, name, salary, dept,
	mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
	And mydate has (day, month, year).
	Display Employee information.
	Note. Containment using constructor and getter/setter
*/
public class MyDate4 {
	// data member
	private int dd, mm, yy;

	public MyDate4()
		{
		
			System.out.println("I am in default Const in MyDate4");
			dd=17;
			mm=10;
			yy=2023;
			
		}

	public MyDate4(int dd,int mm,int yy)
		{
		
			System.out.println("I am in parameterized const in MyDate4");
			this.dd=dd;
			this.mm=mm;
			this.yy=yy;
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
		return "Joining Date is : "+dd + "/" + mm + "/" + yy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in main");
		// Object creation
		MyDate4 obj = new MyDate4();
		System.out.println(obj);
		obj.setDd(18);
		obj.setMm(12);
		obj.setYy(2023);
		System.out.println(obj);
	}
}

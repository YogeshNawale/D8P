package com.arrayOfObjects;
/*
 * 3.	Create class Dept(did, dname), class MyDate(day, month, year)
		a.	Class Employee(emp_id, emp_name, salary, date(object), dept(object)). 
		Create array of Employee and display the array elements.
4.	Same as above but print Employees whose dept_name is same.

 */
public class MyDate3 {
	private int dd,mm,yy;	
	public MyDate3()
	{
	
		System.out.println("I am in default Const MyDate3");
		dd=17;
		mm=10;
		yy=2023;
		
	}
	public MyDate3(int dd,int mm,int yy)
	{
	
		System.out.println("I am in parameterized const MyDate3");
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void setDd(int d)
	{
		dd=d;
	}
	public void setMm(int m)
	{
		mm=m;
	}
	public void setYy(int y)
	{
		yy=y;
	}
	
	public int getDd()
	{
		return dd;
	}
	public int getMm()
	{
		return mm;
	}
	public int getYy()
	{
		return yy;
	}
	public void setData(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;		
	}
    
        public String toString()
    {
    	return " Date of Joining : "+dd+"/"+mm+"/"+yy;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

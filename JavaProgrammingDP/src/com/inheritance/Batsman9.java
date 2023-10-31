package com.inheritance;
/*
 * Write a class player and inherit HockeyPlayer, Cricketer, FootBallPlayer classes. Derive Batsman and
 * Bowler classes from cricketer.  
 */
public class Batsman9 extends Cricketer9{
	private int hundreds;
	private double average;
	private double strikeRate;
	
	Batsman9(){
		hundreds=0;
		average=0;
		strikeRate=0;
	}
	Batsman9(String name, int age, String gender, double sal,String position,int jersyNo,String teamName, double bonus,int hundreds, double average, double strikeRate){
		super(name, age, gender, sal, position, jersyNo,teamName, bonus);
		this.hundreds=hundreds;
		this.average=average;
		this.strikeRate=strikeRate;
	}
	
	
	
	public int getHundreds() {
		return hundreds;
	}
	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public double getStrikeRate() {
		return strikeRate;
	}
	public void setStrikeRate(double strikeRate) {
		this.strikeRate = strikeRate;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Batsman  [Hundreds=" + hundreds + ", average=" + average + ", strikeRate=" + strikeRate + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Batsman9 obj= new Batsman9("Sachin",33,"Male",90000,"Opener",10,"India",10,35,52,112);
		obj.calculateSalary();
		System.out.println(obj);
	}

}

package com.inheritance;
/*
 * Write a class player and inherit HockeyPlayer, Cricketer, FootBallPlayer classes. Derive Batsman and
 * Bowler classes from cricketer.  
 */
public class Bowler9 extends Cricketer9 {

	private int wickets;
	private double average;
	private double strikeRate;
	
	Bowler9(){
		wickets=0;
		average=0;
		strikeRate=0;
	}
	Bowler9(String name, int age, String gender, double sal,String position,int jersyNo,String teamName, double bonus,int wickets, double average, double strikeRate){
		super(name, age, gender, sal, position, jersyNo,teamName, bonus);
		this.wickets=wickets;
		this.average=average;
		this.strikeRate=strikeRate;
	}
	
	
	
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
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
		return super.toString()+"Bowler  [wickets=" + wickets + ", average=" + average + ", strikeRate=" + strikeRate + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bowler9 obj= new Bowler9("Anand",23,"Male",55000,"Fast Medium",3,"Raiways",10,233,7.3,23);
		obj.calculateSalary();
		System.out.println(obj);
	}

}

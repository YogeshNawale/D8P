package com.inheritance;
/*
 * Write a class player and inherit HockeyPlayer, Cricketer, FootBallPlayer classes. Derive Batsman and
 * Bowler classes from cricketer.  
 */
public class FootBallPlayer9 extends Player9{

	private String position;
	private int jersyNo;
	private String teamName;
	private double bonus;
	
	public FootBallPlayer9() {
		position="";
		jersyNo=0;
		teamName="";
		bonus=0;
	}
	public FootBallPlayer9(String name, int age, String gender, double sal,String position,int jersyNo,String teamName, double bonus) {
		super(name, age, gender, sal);
		this.position=position;
		this.jersyNo=jersyNo;
		this.teamName=teamName;
		this.bonus=bonus;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getJersyNo() {
		return jersyNo;
	}
	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+" FootBallPlayer  [position=" + position + ", jersyNo=" + jersyNo + ", teamName=" + teamName + ", bonus="
				+ bonus + "]";
	}
	public double calculateSalary() {
		double s= super.getSalary()*(1+(bonus/100));
		super.setSalary(s);
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootBallPlayer9 obj= new FootBallPlayer9("Amol",20,"Male",50000,"Forward",10,"India",15);
		obj.calculateSalary();
		System.out.println(obj);
	}

}

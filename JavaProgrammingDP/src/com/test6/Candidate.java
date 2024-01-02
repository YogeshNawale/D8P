package com.test6;

import java.util.PriorityQueue;

/*10> Create a PriorityQueue to give engineering admission to candidate.
 * Create Candidate class with cid,cname,m1,m2,m2,percentage.
 * Candidate with highest marks should get admission first!  	
 */
public class Candidate implements Comparable<Candidate>{

	private int cid;
	private String cname; 
	private int  m1, m2 ,m3;
	private double percentage;
	
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
	
	public Candidate(int cid, String cname, int m1, int m2, int m3) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		calculatePerc();
	}
	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public void calculatePerc() {
		int sum=m1+m2+m3;
		percentage= (double)(sum/3);
	}

	@Override
	public String toString() {
		return "Candidate [cid=" + cid + ", cname=" + cname + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3
				+ ", percentage=" + percentage + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Candidate> pq= new PriorityQueue<Candidate>();
		pq.add(new Candidate(101,"Yogesh",78,96,78));
		pq.add(new Candidate(105,"Suraj",76,76,88));
		pq.add(new Candidate(104,"Prasad",88,66,58));
		pq.add(new Candidate(106,"Ashish",58,76,88));
		pq.add(new Candidate(103,"Amol",76,86,74));
		pq.add(new Candidate(102,"Jay",72,66,78));
		
		for(Candidate c: pq)
			System.out.println(c);
	}

	@Override
	public int compareTo(Candidate o) {
		if(this.getPercentage()==o.percentage)
				return 0;
		else if(this.getPercentage()<o.percentage)
			return 1;
		else 
			return -1;
	}

}

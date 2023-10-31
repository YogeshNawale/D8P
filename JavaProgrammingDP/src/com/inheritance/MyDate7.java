package com.inheritance;

public class MyDate7 {
	// data member
		private int dd, mm, yy;

		public MyDate7() {

			System.out.println("I am in default Const of Mydate7");
			dd = 17;
			mm = 10;
			yy = 2023;

		}

		public MyDate7(int dd, int mm, int yy) {

			System.out.println(" parametric cons of Mydate7");

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

		

		public String toString() {
			return dd + "/" + mm + "/" + yy;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.innerconcepts.assignments;
// 10. Predict and study output of following program.


public class ShadowingExample {
	public int x = 0;
	static int num;

	
	class FirstLevel {
		public int x = 1;

		void methodInFirstLevel(int x) {
			ShadowingExample st2 = new ShadowingExample();
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowingExample.x = " + st2.x);
			System.out.println("ShadowingExample.num = " + ShadowingExample.num);
		}
	}

	public static void main(String... args) {
		ShadowingExample st = new ShadowingExample();
		ShadowingExample.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}
}

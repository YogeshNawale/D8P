package com.innerconcepts.assignments;
//  Predict and study output of following program.

class OuterClass1 {
	int x = 10;

	void methodOfOuterClass() {
		System.out.println("From OuterClass");
	}

	class InnerClass {
		int y = 20;
	}
}

class AnotherClass extends OuterClass1 {
	
	class AnotherInnerClass extends InnerClass {
	}
}

public class InnerInheritance {
	public static void main(String args[]) {
		AnotherClass anotherClass = new AnotherClass();
		System.out.println(anotherClass.x);
		anotherClass.methodOfOuterClass();
		AnotherClass.AnotherInnerClass anotherInnerClass = anotherClass.new AnotherInnerClass();
		System.out.println(anotherInnerClass.y);
	}
}
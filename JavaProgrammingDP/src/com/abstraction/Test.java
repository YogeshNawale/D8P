package com.abstraction;

/*
 * Above we created an abstract class Machine with an abstract method crush and a concrete / implemented method
	rotate. Now create another abstract class Mixer which extends the abstract class Machine, has method crush
	implemented and has an additional concrete method blend.
 	In main create an object of class of Mixer. Call methods rotate, blend and crush.
 */
abstract class Mixer extends Machine {

	public void blend() {
		System.out.println("In Blend  in Mixer");
	}

	public void crush() {
		System.out.println("In crush in Mixer");
	}

	
}

class Test extends Mixer {
	
	public static void main(String[] args) {
		Mixer obj= new Test();
		obj.rotate();
		obj.blend();
		obj.crush();
		
	}
}

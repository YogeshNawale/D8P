package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

class ParentExceptionHandlingInheritance {

	public void set() throws IOException,NullPointerException{
		  
	}

}

class child extends ParentExceptionHandlingInheritance  {
	
	public void set() throws IOException,FileNotFoundException {
		super.set();
	}
}
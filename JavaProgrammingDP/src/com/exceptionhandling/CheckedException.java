package com.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *  WAP to show checked exception and use multiple catch block with universal Exception handler.
 */
public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fln = new FileInputStream(".\\com\\exceptionhandling\\ArithmeticException1.java");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
			// e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Main ends");

	}

}

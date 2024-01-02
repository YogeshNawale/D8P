package com.exceptionhandling;
/*Custom Email Validation Exception
As part of the registration process, users need to provide an email address. 
Your task is to create a custom exception for email validation.

Write a Java program that includes the following classes:

EmailValidationException Class:

Create a custom exception class named EmailValidationException that extends the Exception 
class.
This exception should be thrown whenever an invalid email address is detected 
during the registration process.

UserRegistration Class:

Include a method named registerUser that takes an email address as a parameter 
and performs the following validations:
The email address must not be null.
The email address must contain the "@" symbol.
The email address must have a valid domain (for simplicity,
 you can check if the domain contains a dot "." character).

Main Class:

In the main method, create an instance of UserRegistration.
Demonstrate the registration process by calling the registerUser method with various email addresses, 
including both valid and invalid ones.
Catch the custom exception (EmailValidationException) and handle it appropriately by displaying
 a user-friendly error message
 * 
 */

class EmailValidationException extends Exception {
	String email;

	public EmailValidationException() {

	}

	public EmailValidationException(String email) {
		this.email = email;
	}

	public String toString() {
		return "Invalid Email " + email;
	}
}

class UserRegistration {
	String email;

	public UserRegistration() {

	}

	public UserRegistration(String email) {
		this.email = email;
	}

	public void registerUser() throws EmailValidationException {
		if (email == null)
			throw new EmailValidationException(email);

		boolean ischeck = false;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@')
				ischeck = true;
		}
		boolean isdotcheck = false;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '.')
				isdotcheck = true;
		}
		if (ischeck == false || isdotcheck == false)
			throw new EmailValidationException(email);
		
		//System.out.println(email);
	}

	

	@Override
	public String toString() {
		return "UserRegistration [email= " + email + "]";
	}

}

public class Main {

	public static void main(String[] args) {

		UserRegistration obj = new UserRegistration("yogesh@gmail.com");
		try {
			obj.registerUser();
			System.out.println(obj);
		} catch (EmailValidationException e) {
			System.out.println(e);
		}
	}

}

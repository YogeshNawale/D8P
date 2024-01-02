package com.exceptionhandling;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
	double amount;

	public InsufficientBalanceException() {

	}

	public InsufficientBalanceException(double amt) {
		amount = amt;
	}

	public String toString() {
		return " Insufficient Balance... " + amount + " exceeds balance";
	}

}

public class Account {
	int id;
	String name;
	double balance, amount;

	public Account() {

	}

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;

	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	public double withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance)
			throw new InsufficientBalanceException(amount);
		else
			balance = balance - amount;

		return balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account obj = new Account(01, "Yogesh", 50000);
		System.out.println(obj);

		System.out.println("Enter Amount to be deposited");
		obj.deposit(sc.nextDouble());
		System.out.println(obj);

		try {
			System.out.println("Enter Amount to be Withdrawn");
			obj.withdraw(sc.nextDouble());
			System.out.println(obj);
		} catch (InsufficientBalanceException e) {
			System.out.println(e);
		}
		sc.close();
	}

}

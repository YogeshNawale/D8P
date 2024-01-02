package com.collection.treeset;

import java.util.Scanner;
import java.util.TreeSet;

/*WAP to create  Unique Names Tracker
	The program should allow users to perform the following operations:
			Add a Name: Add a new name to the set of unique names.
			Remove a Name: Remove a specified name from the set.
			Check if Name Exists: Check if a given name exists in the set.
			Display All Names: Display all the unique names in the set.
 */
public class UniqueNamesTracker {
	TreeSet<String> t;
	String name;

	public UniqueNamesTracker() {

	}

	public UniqueNamesTracker(TreeSet<String> t) {
		this.t = t;

	}

	public void addName(String name) {

		t.add(name);

	}

	public void removeName(String name) {

		t.remove(name);
	}

	public void checkName(String name) {

		if (t.contains(name))
			System.out.println("Given name " + name + " exists in the set.");
		else
			System.out.println("Given name " + name + " dosent exists in the set.");
	}

	public void displayallNames() {

		for (String s : t)
			System.out.println(s);
		System.out.println("=========================================");
	}

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();

		Scanner sc= new Scanner (System.in);
		UniqueNamesTracker obj = new UniqueNamesTracker(ts);
		
		
		// Add a Name: Add a new name to the set of unique names.

		obj.addName("Yogesh");
		obj.addName("Prasad");
		obj.addName("Ishwar");
		obj.addName("Maroti");
		
		obj.displayallNames();

//		// Remove a Name: Remove a specified name from the set.

		obj.removeName("Prasad");
		obj.displayallNames();


		// Check if Name Exists: Check if a given name exists in the set.

		obj.checkName("Yogesh");
		obj.checkName("Prasad");

		
		// Display All Names: Display all the unique names in the set.
			obj.displayallNames();

//		System.out.println("Enter the operation to be Performed \n 1.add Name \t 2. remove Name \t 3. Check if name exist \t 4. Display all Names");
//		int n=sc.nextInt();
//		switch(n) {
//		case 1: System.out.println("Enter name to be added");
//				String s=sc.next();
//				obj.addName(s);
//				break;
//		case 2: System.out.println("Enter name to be removed");
//				String s1=sc.next();
//				obj.removeName(s1);
//				break;
//		case 3: System.out.println("Enter name to be checked");
//				String s2=sc.next();
//				obj.checkName(s2);
//				break;
//		case 4: obj.displayallNames();
//				break;
//		
//		default : System.out.println("Invalid Operation");
//				
//		}
		
		obj.displayallNames();
		
		
	}

}

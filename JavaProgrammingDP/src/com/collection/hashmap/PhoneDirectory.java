package com.collection.hashmap;
/*WAP Phone Directory application in java using a Map.
 The phone directory should allow users to:
		Add a contact with a name and phone number.
		Remove a contact by name.
		Retrieve the phone number associated with a given name.
		Display the entire phone directory.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;


public class PhoneDirectory {
	private String name;
	private ArrayList<Long> phoneNo;
	private HashMap<String ,ArrayList<Long>> hm;

	
	
	
	
	public PhoneDirectory() {

	}

	public PhoneDirectory(HashMap<String ,ArrayList<Long>> hm) {
		this.hm=hm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Long> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(ArrayList<Long> phoneNo) {
		this.phoneNo = phoneNo;
	}

	public HashMap<String, ArrayList<Long>> getHm() {
		return hm;
	}

	public void setHm(HashMap<String, ArrayList<Long>> hm) {
		this.hm = hm;
	}

	public void addContact() {
		
	}
	public void adddata(String name, ArrayList<Long> phoneNo) {
		hm.put(name, phoneNo);
	}
	public void removedata(String name) {
		hm.remove(name);
	}
	public void retrive(String name) {
		System.out.println(name +"--------------->"+ hm.get(name));
	}
	public void displaydata() {
		
		for( Entry<String ,ArrayList<Long>> e :hm.entrySet()) {
			System.out.println(e.getKey()+"-------------->"+ e.getValue());
		}
		System.out.println("=============================================================");
			
		
	}
	@Override
	public String toString() {
		return "PhoneDirectory [name=" + name + ", phoneNo=" + phoneNo + "]";
	}

	public static void main(String[] args) {
		HashMap<String ,ArrayList<Long>> hm = new HashMap<>();
		
		PhoneDirectory pd= new PhoneDirectory(hm);
		
		pd.adddata("Yogesh Nawale", new ArrayList<Long>(Arrays.asList(84367843634l, 8783493544l)));
		pd.adddata("Suraj Rokade", new ArrayList<Long>(Arrays.asList(8347834634l)));
		pd.adddata("Adarsh Nadre", new ArrayList<Long>(Arrays.asList(9344343634l, 999735789l)));
		pd.adddata("Abhishekh Rai",new ArrayList<Long>(Arrays.asList(8783856344l)));
		pd.adddata("Prasad Bhoite", new ArrayList<Long>(Arrays.asList(95463053634l, 8893846884l)));
	//	pd.adddata("Yogesh Nawale", new ArrayList<Long>(Arrays.asList(95454634l, 903434544l)));

		pd.displaydata();
		pd.removedata("Adarsh Nadre");
		
		pd.displaydata();
		
		pd.retrive("Suraj Rokade");
		


		
	}

}

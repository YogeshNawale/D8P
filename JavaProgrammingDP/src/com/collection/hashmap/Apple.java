package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Apple {
	int price;
	String type;

	public Apple() {

	}

	public Apple(int price, String type) {
		this.price = price;
		this.type = type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	@Override
	public int hashCode() {
		System.out.println("in hashCode() method");
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		//System.out.println(result);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals() method");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (this.price != other.price)
			return false;
		if (this.type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public String toString() {
		return "Apple [ Price " + price + " Type " + type + "]";
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Map<Apple, Integer> appleMap = new HashMap<>();
		Apple a1 = new Apple(150, "Shimla Apple");
		System.out.println(a1.hashCode());
		appleMap.put(a1, 200);
		Apple a2 = new Apple(300, "Washington apple");
		appleMap.put(a2, 3500);
		System.out.println(a2.hashCode());
		Apple a3 = new Apple(450, "Green Apple");
		System.out.println(a3.hashCode());
		appleMap.put(a3, 4508);

		Set<Entry<Apple, Integer>> s = appleMap.entrySet();
		Iterator<Entry<Apple, Integer>> itr = s.iterator();

		for (Entry<Apple, Integer> e : s) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		System.out.println("*******************************************************88");
		Apple a4 = new Apple(150, "Shimla Apple");
		appleMap.put(a4, 453);
		System.out.println(a4.hashCode());
		System.out.println(appleMap.get(a4));

		System.out.println("*******************************************************88");

		s = appleMap.entrySet();
		for (Entry<Apple, Integer> e : s) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}
}
/*
 * Contract between equals() and hashCode() 1) If two objects are equal, then
 * they must have the same hash code. 2) If two objects have the same hash code,
 * they may or may not be equal.
 */

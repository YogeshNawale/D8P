package com.test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*	create List<Shipment> in which sorting is done according cities and if two order have same
 * 	cities than according to shipment date(Ascending).
 * 
 */
public class Shipmenttest {

	public static void main(String[] args) {

		List<Shipment> s = new ArrayList<>();
		s.add(new Shipment(101, "Yogesh", new Address("Sadashiv peth", "Pune", "MH"), new MyDate(22, 12, 2023)));
		s.add(new Shipment(102, "Amit", new Address("Bahdra", "Mumbai", "MH"), new MyDate(25, 12, 2023)));
		s.add(new Shipment(103, "Suraj", new Address("ABC", "Banglore", "KT"), new MyDate(22, 12, 2023)));
		s.add(new Shipment(104, "Prashant", new Address("DEF", "Chennai", "TN"), new MyDate(23, 12, 2023)));
		s.add(new Shipment(105, "Abhishekh", new Address("HIJ", "Delhi", "Delhi"), new MyDate(25, 12, 2023)));
		s.add(new Shipment(106, "Shital", new Address("MMM", "Banglore", "KT"), new MyDate(28, 12, 2023)));
		s.add(new Shipment(107, "Ishwar", new Address("NNN", "Delhi", "Delhi"), new MyDate(25, 11, 2023)));

		sortAccording obj = new sortAccording();
		Collections.sort(s, obj);
		for (Shipment s1 : s)
			System.out.println(s1);
	}

}

class sortAccording implements Comparator<Shipment> {

	@Override
	public int compare(Shipment o1, Shipment o2) {
		int res;
		if (o1.getAddr().getCity().equals(o2.getAddr().getCity())) {
			return res = (int) (o1.getShipDate().getDd() - o2.getShipDate().getDd());
		} else
			return o1.getAddr().getCity().compareTo(o2.getAddr().getCity());

	}

}

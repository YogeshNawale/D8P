package com.test6;

import java.util.HashMap;
import java.util.Iterator;

/*Create a hashmap <int,String> where key is integers 1 to 10 and string is number in words. 
 * Remove entry for which number is divisible by 3. 
 */
public class Q8 {

	public static void main(String[] args) {
		
		HashMap< Integer, String> hm= new HashMap<>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		hm.put(5, "Five");
		hm.put(6, "Six");
		hm.put(7, "Seven");
		hm.put(8, "Eight");
		hm.put(9, "Nine");
		hm.put(10, "Ten");
		
		Iterator<Integer > itr= hm.keySet().iterator();
		
		while(itr.hasNext()) {
			if(itr.next()%3==0)
				itr.remove();
		}
		
		itr= hm.keySet().iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			System.out.println(i+"-------->"+hm.get(i));
		}

	}

}

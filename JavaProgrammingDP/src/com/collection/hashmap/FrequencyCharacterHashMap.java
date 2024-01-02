package com.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacterHashMap {

//	public int calculatefrequency(char ch[] ) {
//		int count=0;
//		
//		for (int i = 0; i < ch.length - 1; i++) {
//			count = 0;
//			int flag = 0;
//			for (int j = i + 1; j < ch.length; j++) {
//				if (ch[i] == ch[j]) {
//					flag=1;
//					break;
//				}
//			}
//			if(flag==1)
//				continue;
//			
//			for (int j = 0; j <= i; j++) {
//				if (ch[i] == ch[j])
//					count++;
//			}
//			System.out.println(" Frequency of Element "+ ch[i] + " is = " + count);
//		}
//		
//		return count;
//	}

	public static void main(String[] args) {

		String str = "Programming";
		char ch[] = str.toCharArray();

//		FrequencyCharacterHashMap obj = new FrequencyCharacterHashMap();

//		obj.calculatefrequency(ch);
//		
		Map<Character, Integer> hm = new HashMap<>();

		for (char c : ch) {
			if (hm.containsKey(c)) {
				int a = hm.get(c);
				hm.put(c, a + 1);
			} else {
				hm.put(c, 1);
			}
		}

		System.out.println(hm);

		//
		String str1 = "Java is a programming language. C++ is a programming language.";
		String[] strarr = str1.split(" ");

		Map<String, Integer> hm1 = new HashMap<>();

//		for (String s : strarr) {
//			if (hm1.containsKey(s)) {
//				int a = hm1.get(s);
//				hm1.put(s, a + 1);
//			} else {
//				hm1.put(s, 1);
//			}
//		}
//
//		System.out.println(hm1);

		for (String s : strarr) {
			Integer i = hm1.get(s);
			if (i == null) {
				hm1.put(s, 1);

			} else {
				hm1.put(s, i + 1);
			}
		}
		System.out.println(hm1);

	}

}

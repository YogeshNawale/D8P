package com.stringdemo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Java";
		System.out.println(str.hashCode());
		String str1= new String("Java");
		System.out.println(str1.hashCode());
		
		String str2= new String(" Programming");
		System.out.println(str2);
		
		//concat(str)
		String str3=str1.concat(str2);
		System.out.println(str3);
		System.out.println(str3.length());
		
		//charAt and indexOf
		System.out.println(str3.charAt(6));
		System.out.println(str3.indexOf('P'));
		System.out.println(str3.indexOf('z'));
		
		//compareTo
		System.out.println(str3.compareTo(str1));
		System.out.println(str.compareTo(str1));
		System.out.println(str3.compareTo("Java programming"));
		//compareToIgnoreCase
		System.out.println(str3.compareToIgnoreCase("Java programming"));
		
		//contains	=returns true/false
		System.out.println(str3.contains("gram"));
		System.out.println(str3.contains("grm"));
		
		//endsWith 	=returns true/false
		System.out.println(str3.endsWith("g"));
		System.out.println(str3.endsWith("s"));
		
		//replace, replaceAll and replaceFirst methods
		System.out.println(str3.replace('a', '$'));
		System.out.println(str3.replace("Java", "Python"));
		System.out.println(str3.replaceAll("ava", "avaaaaa"));
		System.out.println(str3.replaceFirst("a", "&"));
		
		//toLowercase(), toUpperCase()
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		
	}

}

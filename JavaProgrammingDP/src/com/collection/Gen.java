package com.collection;

public class Gen<T> {

	T obj;
	Gen (){
		
	}
	Gen(T o){
		obj=o;
	}
	T getObject() {
		return obj;
	}
	
	public static void main(String[] args) {
	
		Gen<Integer> obj= new Gen<Integer>(10);
		Integer i=obj.getObject();
		System.out.println(i);
		
		Gen<String> obj1= new Gen<String>("JAVA");
		String str=obj1.getObject();
		System.out.println(str);
		
		//obj=obj1;  // typeMismatch compile time error
	}

}

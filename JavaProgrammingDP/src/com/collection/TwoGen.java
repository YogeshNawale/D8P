package com.collection;

public class TwoGen<T,V> {
	T obj1;
	V obj2;
	TwoGen(){
		
	}
	TwoGen(T o1, V o2){
		obj1=o1;
		obj2=o2;
	}
	void showTypes() {
		System.out.println(obj1.getClass());
		System.out.println(obj2.getClass());
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoGen<Integer,String> obj= new TwoGen<Integer,String>(01,"acb");
		obj.showTypes();
		
	}

}

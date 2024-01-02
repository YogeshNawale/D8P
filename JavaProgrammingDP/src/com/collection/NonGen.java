package com.collection;
// non generic classes
public class NonGen {

	Object obj;
	NonGen(){
		
	}
	NonGen(Object o){
		obj=o;
	}
	void showType() {
		System.out.println(obj.getClass());
	}
	Object getObj() {
		return obj;
	}
	public static void main(String[] args) {

		NonGen obj=new NonGen(12);
		obj.showType();
		System.out.println(obj.getObj());
		//int i = (int) obj.getObj();
		
		NonGen obj1=new NonGen("Java");
		obj1.showType();
		System.out.println(obj1.getObj());
		//String str =  (String) obj1.getObj();
		
		obj=obj1;
		//System.out.println(obj.getObj());
		int v= (int) obj.getObj(); // runtime error  ClassCastException
		
	}

}

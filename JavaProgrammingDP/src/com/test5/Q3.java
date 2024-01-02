package com.test5;
/*	WAP to create to linklist<EMp> and search for Emp object whose eno=10 and delete all the 
 * record whose dept is same as eno 10. emp[ id, name, Dept d]
 */
import java.util.LinkedList;
import java.util.ListIterator;

public class Q3 {

	public static void main(String[] args) {

		LinkedList<Employee> ll= new LinkedList<>();
		ll.add(new Employee(5,"Yogesh",new Dept(101,"Development")));
		ll.add(new Employee(10,"Amit",new Dept(102,"Testing")));
		ll.add(new Employee(15,"Suraj",new Dept(103,"Marketing")));
		ll.add(new Employee(25,"Abhishek",new Dept(101,"Development")));
		ll.add(new Employee(20,"Pritam",new Dept(102,"Testing")));
		ll.add(new Employee(30,"Ishwar",new Dept(101,"Development")));
		
		ListIterator<Employee> litr= ll.listIterator();
		Dept d=null;
		while(litr.hasNext()) {
			Employee e=litr.next();
			if(e.getEid()==10)
				d=e.getD();
		}
		
		for(int i=0; i<ll.size(); i++) {
			if(ll.get(i).getD().equals(d)) {
				ll.remove(i);
				i--;
			}
		}
		
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
	}

}

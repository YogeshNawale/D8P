package com.Oops;

public class ArraysDemo {
	 

	public void createArray() {
	
		int arr[]= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		this.accessElements(arr);
	}
	
	public void accessElements(int obj[]) {
		 
		/*
		 * for(int i=0; i< obj.length; i++)
		 *  System.out.println(obj[i]);
		 */
		
		/* reverse using for loop
		 * for (int i= obj.length-1 ; i>= 0; i--)
		 *  System.out.println(obj[i]);
		 */
		
		int i = 0;
        while (i < obj.length) {
            System.out.println(obj[i]);
            i++;
        }
		
		/* Reverse using while loop
		 * int i=obj.length-1;
		 *  while(i>=0) {
		 *   System.out.println(obj[i]);
		 *    i--;
		 *   }
		 */
			
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArraysDemo a=new ArraysDemo();
		a.createArray();
	

		
		
	}

}

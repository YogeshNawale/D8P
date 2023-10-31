package com.Oops;

public class EnhancedForLoop {

	public void printArray(){
		
		int arr[]= {1,2,3,4,5};
		for (int i:arr)
			System.out.println(i);
		
		this.printSumOfElements(arr);
	}
	
	public void printSumOfElements(int obj[]) {
		
		int sum=0;
		for(int i:obj)
			sum=sum+i;
		
		System.out.println("Sum of Elements is : "+sum);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnhancedForLoop obj= new EnhancedForLoop();
		obj.printArray();
		
	}

}

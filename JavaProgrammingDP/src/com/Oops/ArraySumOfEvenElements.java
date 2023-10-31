package com.Oops;
// sum of even elements in an array
public class ArraySumOfEvenElements {

	int arr[];
	
	public ArraySumOfEvenElements() {
		arr=new int[5];
		for(int i=0; i<arr.length; i++)
			arr[i]=i;
	}
	
	public ArraySumOfEvenElements(int a[]) {
		arr=a;
	}
	
	public void sumEvenElements() {
		int sum=0;
		for(int i:arr) {
			if(i%2==0)
				sum=sum+i;
		}
		System.out.println("Sum Of Even Elements is : " +sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArraySumOfEvenElements obj= new ArraySumOfEvenElements();
		obj.sumEvenElements();
		
		int arr1[]=new int[5];
		arr1[0]=2;
		arr1[1]=3;
		arr1[2]=4;
		arr1[3]=7;
		arr1[4]=8;
		
		
		ArraySumOfEvenElements obj1= new ArraySumOfEvenElements(arr1);
		obj1.sumEvenElements();
	}

}

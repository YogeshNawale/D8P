package com.Oops;

public class DemoEnhanceForLoop {

	int arr[];
	
	DemoEnhanceForLoop(){
		arr=new int[5];
		for (int i=0; i<arr.length; i++)
			arr[i]=i;
	}
	
	DemoEnhanceForLoop(int a[]){
		arr=a;
	}
	
	public int addArrayElements() {
		int sum=0;
		for(int i: arr)
			sum=sum+i;
		return sum;
	}
	
	//return array from method
	
	public int[] reverseArray() {
		int newArr[]= new int [arr.length];
		int j= arr.length-1;
		for (int i=0; i<newArr.length; i++) {
			newArr[i]=arr[j];
			j--;
		}
		return newArr;
	}
	
	public void printElement() {
		for(int i:arr)
			System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoEnhanceForLoop obj= new DemoEnhanceForLoop();
		System.out.println(obj.addArrayElements());
		
		int objArr[]= {5,6,8,9};
		DemoEnhanceForLoop obj1= new DemoEnhanceForLoop(objArr);
		System.out.println(obj1.addArrayElements());
		
		int resArr[]= obj1.reverseArray();
		for(int i:resArr)
			System.out.println(i);
	}

}

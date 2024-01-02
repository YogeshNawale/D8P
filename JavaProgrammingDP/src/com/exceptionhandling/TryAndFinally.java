package com.exceptionhandling;
// 5. WAP where only try and finally is used
public class TryAndFinally {
	public void show(int arr[]) {
		try {
			for(int i=0; i<=arr.length; i++)
				System.out.print(arr[i]+"\t");
		}finally {
			System.out.println("In finally");
		}
	}
	public static void main(String[] args) {
		TryAndFinally obj = new TryAndFinally();
		int a[]= {1,2,3,4,5};
		try {
		obj.show(a);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Main ends");

	}

}

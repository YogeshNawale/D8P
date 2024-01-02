package com.exceptionhandling;

//10. WAP to throw exception still finally should get executed"
public class ThrowAndFinally {

	public void displayArray(int arr[]) {

		for (int i = 0; i <= arr.length; i++)
			System.out.print(arr[i] + "\t");
		throw new ArrayIndexOutOfBoundsException("Array Index Out Of Bounds Exception");
		

	}

	public static void main(String[] args) {

		int arr[]= {1,2,3};
		ThrowAndFinally obj= new ThrowAndFinally();
		
		try {
			obj.displayArray(arr);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}finally {
			System.out.println("In finally" );
			
		}
		System.out.println("Main ends");
	}

}

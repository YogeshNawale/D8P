package com.exceptionhandling;

//3. WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and ArithmeticException
public class MultipleExceptions {

	public void setArray() {
		int arr[] = new int[3];
		try {
			arr[0] = 5 / 0;
			arr[1] = 4;
			arr[2] = 3 / 0;
			arr[3] = 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("In Finally");
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleExceptions obj= new MultipleExceptions();
		obj.setArray();
	}

}

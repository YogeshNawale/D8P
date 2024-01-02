package com.test3;
/*
 * Write  a  java  program  to  find  all  pairs  of  elements  in  an  integer  array  whose  sum  is  equal to a given number?[1M]
		Input Array : [4, 6, 5, -10, 8, 5, 20]
		InputNumber:10
		Pairs  of  elements  whose  sum  is  10  are : 
		4 + 6 = 10
		5 + 5 = 10
		-10 + 20 = 10

 */
public class CountPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4,6,5,-10,8,5,20};
		int n=10;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==10) {
					System.out.println("Sum of "+ arr[i]+ " and "+ arr[j]+ " is equal to 10" );
				}
			}
		}
	}

}

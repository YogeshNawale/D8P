package com.arraybasics.array2D;

public class CopyArrayUsingInBuildFunction {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //declaring a source array  
        
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };  
        
		//declaring a destination array  
        char[] copyTo = new char[7];  
        
        //copying array using System.arraycopy() method  
        
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
        
        //printing the destination array  
        System.out.println(String.valueOf(copyTo)); 
        
        
	}

}

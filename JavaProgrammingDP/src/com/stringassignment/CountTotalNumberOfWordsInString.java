package com.stringassignment;

//.14.  Write a Java program to count total number of words in a string.
public class CountTotalNumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " Hello Java ";
		 
		int count = 0;
		
         char ch[]= new char[str.length()];     
         
         for(int i=0;i<str.length();i++)  {  
             ch[i]= str.charAt(i);  
             if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                 count++;  
         }
         
		System.out.println("Total Number of Words is " + count);
	}

}

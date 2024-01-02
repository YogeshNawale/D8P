package com.arraybasics.assignments;
//11.	WAP to find and count total number of duplicate elements in an array.
public class DuplicateElementArray {

	public static void countDuplicate() {
		int  num[]= {1,2,3,1,2,5,7,2,3};
		int count=0;
		
		for (int i=0; i<num.length; i++) {
			boolean isDuplicate=false;
			for(int j=i+1; j<num.length; j++) {
				if (num[i]==num[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(isDuplicate) {
				boolean isNotPrinted= true;
				for(int k=i-1; k>=0; k--) {
					if (num[i]==num[k]) {
						isNotPrinted=false;
						break;	
					}
					
				}
				if (isNotPrinted) {
					count++;
					System.out.println(num[i]+ " is a duplicate.");
				}
				
			}
		}
		System.out.println("Number of Duplicate elements = "+ count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countDuplicate();
		
	}

}

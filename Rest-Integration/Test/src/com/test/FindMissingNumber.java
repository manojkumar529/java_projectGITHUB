package com.test;

public class FindMissingNumber {

	public static void main(String[] args) {
	int[] intArray= {1,2,3,4,6};
	int missingnum=getMissingNumber(intArray,6);
	System.out.println(missingnum);
	
	 
	

	}

	private static int getMissingNumber(int[] intArray, int n) {
		int Expected=n*(n+1)/2;
		int actualsum=0;
		for(int i:intArray)
		{
	    actualsum=actualsum+i;
		}
		return Expected-actualsum;
	}

}

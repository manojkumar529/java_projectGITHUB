package com.test;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]= {9,8,7,6,5,4};
		System.out.println("Before sorting");
		for(int i:intArray)
		{
			System.out.println(i);
		}
		bubbleSort(intArray);
		System.out.println("After sorting");
		for(int i:intArray)
		{
			System.out.println(i);
		}

	}

	private static void bubbleSort(int[] intArray) {
	    for(int i=0;i<intArray.length;i++)
	    {
	    	for(int j=1;j<(intArray.length)-1;j++)
	    	{
	    		if(intArray[j-1]>intArray[j])
	    		{
	    			int temp=0;
	    			temp=intArray[j-1];
	    			intArray[j-1]=intArray[j];
	    			intArray[j]=temp;
	    		}
	    	}
	    }
		
	}

}

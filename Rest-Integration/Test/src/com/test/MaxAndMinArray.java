package com.test;

import java.lang.reflect.Array;

public class MaxAndMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]= {1,2,3,4,5,6};
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		for(int n:intArray)
		{
			if(n>min)
			{
				min=n;
			}
			else
			{
				max=n;
			}
		}
		System.out.println(max);
	}

}

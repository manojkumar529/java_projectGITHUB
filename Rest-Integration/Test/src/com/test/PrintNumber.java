package com.test;

public class PrintNumber {

	public static void main(String[] args) {
		//int n;
		// TODO Auto-generated method stub
		printNumber(1);

	}

	private static void printNumber(int n) {
		if(n<=10) {
			System.out.println(n);
			printNumber(n+1);
		}
		
	}

}

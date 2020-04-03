package com.test;

public class PalindromDemo {
	public static void amain(String[] args) {
		String str="moms";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println("palindorm ");
		}else {
			System.out.println("not");
		}
	}

}

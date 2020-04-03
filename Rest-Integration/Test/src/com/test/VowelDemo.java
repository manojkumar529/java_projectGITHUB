package com.test;

public class VowelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="manojki";
		char[] chars=str.toCharArray();
		int count=0;
		for(char st:chars)
		{
			switch(st)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
				
			}
		}
		System.out.println("number of vowels is:"+count);

	}

}

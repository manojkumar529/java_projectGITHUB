package com.test;

public class CountString {

	public static void main(String[] args) {
		String str="Manoj kumar Singh";
		char[] chars=str.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			String s="";
			while(i<chars.length&&chars[i] !=' ')
			{
				s=s+chars[i];
				i++;
			}
			if(s.length()>0)
			{
				System.out.println(s+"  "+s.length());
			}
		}

	}

}

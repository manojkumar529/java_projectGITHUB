package com.test;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicate {
	public static void main(String[] args) {
		
		String str[]=new String[]{"java","spring","java","spring"};
		Set duplicate=new HashSet<>();
		Set nonduplicate=new HashSet<>();
		for(String st:str)
		{
			if(!nonduplicate.contains(st))
			{
				nonduplicate.add(st);
			}else
			{
				duplicate.add(st);
			}
		}
		System.out.println(duplicate);
		
		
	}

}

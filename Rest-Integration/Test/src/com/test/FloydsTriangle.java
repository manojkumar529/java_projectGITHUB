/**
 * 
 */
package com.test;

import java.util.Scanner;

/**
 * @author Lenovo
 *
 */
public class FloydsTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c,d,num=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Floyds Trianglr");
		for( c=0;c<=n;c++)//for row
		{
			for(d=1;d<=c;d++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println(" ");
		}
		
		

	}

}

package com.practice.assessments;

import java.util.Scanner;

public class RemoveCharactersAtOddPLaces 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println("The given string is ="+s1);
		System.out.print("After removing odd Characters :");



		for(int i=0;i<s1.length();i++) 
		{
			char ch1=s1.charAt(i);

			
			if(i%2==0)
			{
				System.out.println(ch1);
			}
		}
		
	}
}
	


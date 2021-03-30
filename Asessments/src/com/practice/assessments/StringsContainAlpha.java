package com.practice.assessments;

import java.util.Scanner;

public class StringsContainAlpha
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			boolean ch1 = Character.isAlphabetic(ch);
			boolean ch2 = Character.isDigit(ch);
			if(ch1)
			{
				System.out.println("It ia a alphabet");
			}
			//boolean ch2 = Character.isDigit(ch);
			else if(ch2)
			{
				System.out.println("it is a digit");
			}
			else
			{
				System.out.println("it is a Special Character");
			}
				
			
		}
		
		sc.close();
	}

}

package com.practice.assessments;

import java.util.Scanner;

public class PrintOnlyCharactersAtEvenPlaces
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println("The given string is ="+s1);
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			//char ch1=(char)s1.indexOf(ch);
			if(i%2==1)
			{
				//count++;
				System.out.println(ch);
		
			}

		}
		sc.close();
	}
}



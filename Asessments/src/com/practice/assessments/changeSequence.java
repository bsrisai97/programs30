package com.practice.assessments;

public class changeSequence 
{
	public static void main(String args[])
	{
		String s1="MYHOMEISJEWEL";
		System.out.println(s1.length());
		System.out.println("The given string is ="+s1);
		String s=s1.substring(8, 13);
		String t=s1.substring(6, 8);
		String u=s1.substring(0, 6);
			System.out.println("After changing the sequence of string ="+s+t+u);

}
}

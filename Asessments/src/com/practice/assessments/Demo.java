package com.practice.assessments;

import java.util.Scanner;

public class Demo 
{
	public static void main(String...args) {
		System.out.println("enter array size");
	Scanner scanner = new Scanner(System.in);
	int i1 = scanner.nextInt();
	//int i2=i1+1;
	System.out.println("enter valuse siz eof " + i1);
	String s[] = new String[i1];
	StringBuffer s2=new StringBuffer();
	for (int i = 0; i <i1; i++)
	{

	s[i]=scanner.next();

	s2.append(s[i]);

	}
	System.out.println(s2);
	scanner.close();

}
}

package com.practice.assessments;

import java.util.Iterator;

public class Unique 
{
	public static void main(String[] args) {
		String a="AMSTERDAM";
		String temp="";
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			int count=0;
			for(int j=0;j<a.length();j++)
			{
				char ch1=a.charAt(j);
				if(ch==ch1)
				{
					count++;
				}
			}
			
				if(count==1)
				{
					temp=temp+ch;
				}
			}
			System.out.println(temp);
		}
	}



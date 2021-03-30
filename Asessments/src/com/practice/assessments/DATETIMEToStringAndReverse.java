package com.practice.assessments;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DATETIMEToStringAndReverse
{
	  public static void main(String args[])
	  {  
           Date date=new Date();	   
          DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
          String strDate = dateFormat.format(date);  
          System.out.println("Converted String: " + strDate); 
}
}

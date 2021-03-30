package com.practice.assessments;

import java.util.Scanner;

public class CammelToSnake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int length = input.length();
		String output = input.charAt(0) + "";
		for (int i = 1; i < length; i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				output = output + "_" + input.charAt(i);
			} else {
				output = output + input.charAt(i);
			}
		}
		System.out.println(output.toLowerCase());
		sc.close();
	}

}

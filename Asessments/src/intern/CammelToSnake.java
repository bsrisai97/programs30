package intern;

import java.util.Scanner;

public class CammelToSnake {
	int i;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
		//char c = sc.next().charAt(0);
		//double d = sc.nextDouble();
		String input = sc.next();
		//String input = "meThodoverriding";
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

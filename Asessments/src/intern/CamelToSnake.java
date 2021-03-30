package intern;

class CamelToSanke {
	public static void main(String[] args) {
		
		String input = "SriSai";
		int length = input.length();
		String output = input.charAt(0) + "";
		for (int i = 1; i < length; i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				output = output + "-" + input.charAt(i);
			} else {
				output = output + input.charAt(i);
			}
		}
		System.out.println(output.toLowerCase());
	}
}

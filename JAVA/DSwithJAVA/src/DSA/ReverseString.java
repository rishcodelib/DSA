package DSA;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Rishabh";

		// Approach 1---------

		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1.reverse();
		System.out.println(input1);

		// Approach 2----------
		char[] try1 = input.toCharArray();
		System.out.println(try1.length);

		for (int i = try1.length - 1; i >= 0; i--) {
			System.out.print(try1[i]);
		}
		// ~~~~~~~~~~~~~~~~~~~~

	}

}

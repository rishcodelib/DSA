package DSABasics;

import java.util.Scanner;

public class PalingdromeString {

	public static void main(String[] args) {
		System.out.println("Enter String to Check Palingdrome");
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();
		String rev = "";
		for (int i = (word.length() - 1); i >= 0; i--) {
			rev = rev + word.charAt(i);
			System.out.println(i);

		}
		if (rev.equals(word)) {
			System.out.println("Palingdrome");
		} else {
			System.out.println("not a palingdrome");
		}

	}
}

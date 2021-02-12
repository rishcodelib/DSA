package DSA;

import java.util.Scanner;

public class Factorial {
//using Recursion technique.

	public static void main(String[] args) {

		System.out.println("Enter the Positive value");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("factorial is " + myfact(n));
	}

	private static int myfact(int n) {
		if (n > 1) {
			return (myfact(n - 1)) * n;
		} else {
			return 1;
		}
	}

}

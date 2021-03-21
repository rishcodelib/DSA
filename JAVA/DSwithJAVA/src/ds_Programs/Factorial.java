package ds_Programs;

import java.util.Scanner;

public class Factorial {

	// using Recursion technique.

	public static void main(String[] args) {

		System.out.println("Enter the Positive value");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

//		System.out.println("factorial is " + myfact(n));
//	}
// Recursion
//	private static int myfact(int n) {
//		if (n > 1) {
//			return (myfact(n - 1)) * n;
//		} else {
//			return 1;
//		}
//	}

//	Normal
		int fact = 1;
		int i;
		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is: " + fact);
	}
}
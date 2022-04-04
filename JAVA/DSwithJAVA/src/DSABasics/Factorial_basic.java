package DSABasics;

import java.util.Scanner;

public class Factorial_basic {
	// 5 = 5 X 4 X 3 X 2 X 1;

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(Factorial(n));
	}

	private static int Factorial(int n) {
		int result = n;

		for (int i = 1; i < n; i++) {
			result = result * i;
		}
		return result;

	}

}

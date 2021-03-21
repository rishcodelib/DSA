package DSABasics;

import java.util.Scanner;

public class FibonacciSeries {
	/*
	 * Fibonaci Series :0,1,1,2,3,5,8,13,21,34.. Created by adding Previous 2
	 * numbers. a =0, b = 1, c = a+ b;
	 */
	public static void main(String[] args) {
		System.out.println("Enter The number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Fib(n);
	}

	private static void Fib(int n) {
		int a = 0;
		int b = 1;

		for (int i = 0; i <= n; i++) {
			System.out.print(a + " " );
			int sum = a + b;
			a = b;
			b = sum;
		}

	}

}

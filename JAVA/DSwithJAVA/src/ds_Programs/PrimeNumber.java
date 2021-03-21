package ds_Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter The Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // getting number

		if (isPrime(n)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	static boolean isPrime(int n) {
		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;

	}

}

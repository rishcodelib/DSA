package DSA;

import java.util.Scanner;

public class ArmstrongNumber {
// A positive number if it is equal to the sum of cubes of it's digits
// Example: 0,1,153,370,371,407...

	public static void main(String[] args) {

		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int c = 0, a;
		int temp = n;

		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("not Armstrong Number");
		}

	}

}

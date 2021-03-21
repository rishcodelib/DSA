package ds_Programs;

import java.util.Scanner;

public class Palingdrome {

	public static void main(String[] args) {

		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int rem;
		int sum = 0;
		int temp = num;

		while (num > 0) {
			rem = num % 10; // 12 -> 1
			sum = (sum * 10) + rem; // 1 -> 2
			num = num / 10;

		}
		if (temp == sum) {
			System.out.println("YES, number is Palingdrome "+  sum);
		} else {
			System.out.println("NOT a Palingdrome " + sum);
		}

	}
}

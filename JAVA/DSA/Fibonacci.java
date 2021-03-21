package DSA;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int i = 0;
		System.out.println("Enter the Number for fibonacci");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		while (i < count) {
			System.out.print(" " + fib(i));
			i++;
		}

	}

	private static int fib(int num) {
		if (num == 1 || num == 0) {
			return num;
		} else {
			return (fib(num - 1) + fib(num - 2));
		}
	}
	
	
}

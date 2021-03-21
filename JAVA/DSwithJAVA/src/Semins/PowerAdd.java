package Semins;

import java.util.Scanner;
import java.lang.*;

public class PowerAdd {

	public static void main(String[] args) {
		System.out.println("Enter Base number");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		System.out.println("Enter the Power");
		int exp = sc.nextInt();
		int number = (int) Math.pow(base, exp);
		int temp = 0;
		int res = 0;
		while (number > 0) {
			temp = number % 10;
			res +=temp;
			number /= 10;
			System.out.println("res is " + res);
		}
		System.out.println(res);
//
	}

}

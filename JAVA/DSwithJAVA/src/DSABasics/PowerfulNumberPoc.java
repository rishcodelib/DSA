package DSABasics;

import java.util.Scanner;

/*
 * Touka is fan of big number, so when her friend givers her a positive number N,
 * she calculates M = 2^N (2 raised to power N)  and tell to him. 
 * But since M can be very large so it's very difficult to tell to Kurko.
 * So, She Decide to calculate the sum of digits of M till she gets a single digit number and tells it to kuroko
 * 
 * Touka is very tired of the calculation and needs your help to calculate it to her.
 * 
 * Her Friend Kuroko Asks her T Queries, 
 * in Each Quest you will be given N as Input. 
 * Print the answer required in each Query. 
 * 
 * Example 
 *Let: N=6,
 *then M = 2^6 = 64.
 *
 *Now 6 +4 = 10, Since it's not a single digit so we add digits i.e 1+0 = 1; which is required answer.
 *
 *Function Description: 
 *
 * Complete the Solve function provided
 * Takes 1 parameter and return sum of digits of M until it's a single digit number.
 * N: Represents an integer denoting N
 * THe first line has an integer T denoting the number of test cases.
 * for each test case:
 * 	The only line has an integer N.
 * 
 * Output format:
 * Print T line s each corresponding to the answer to each query.
 * 
 * 1 <= T <= 100
 * 0 <= N <= 100000
 * 
 */

public class PowerfulNumberPoc {

	public static void main(String[] args) {
		System.out.println("Enter the Number a Power of 2");
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
	
		System.out.println(Power(n));

	}

	private static long Power(long a) {

		// calculate power
		double val = Math.pow(2, a);
		
		// perform addition
		long result = AddValues(val);
		int length = String.valueOf(result).length();
		//again perform addition if number is more than 1 digit
		while (length > 1) {
			result = AddValues(result);
			length--;
		}

		return result;

	}

	private static long AddValues(double n) {
		long sum = 0;

		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}

		return sum;
	}

}

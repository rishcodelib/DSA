package ActiveAI;

import java.util.Scanner;

public class Superstitious {
	public static void main(String[] args) {
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
//		int number = 795;

		if (isSuperstitious(number)) {
			System.out.println(isSuperstitious(number));
		} else {
			System.out.println(isSuperstitious(number));
		}
	}

	private static boolean isSuperstitious(int num) {

		if (CheckRange(num) && CheckNumber(num)) {
		
			return true;
		}
		return false;

	};

//	private static boolean CheckEight(int num) {
//		int temp = 0;
//		int result;
//		while (num > 0) {
//			temp = num % 10;
//			
//			System.out.println(temp);
//			num /= 10;
//		}
//		
//	}

	// Check Condition 2
	private static boolean CheckNumber(int num) {
		if (((num % 3) == 0) && ((num % 6) != 0)) {
			return true;
		}
		return false;
	}

	// Check Condition 3
	private static boolean CheckRange(int num) {

		if (num < 32767 && num > 0) {
			return true;
		}
		return false;
	}

}
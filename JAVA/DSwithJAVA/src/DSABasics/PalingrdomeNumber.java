package DSABasics;

import java.util.Scanner;

public class PalingrdomeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int num = n;
		for (int i = 0; i < n; i++) {
			num = num % 10;
		
			n = n / 10;

		}
		if(num == n) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}

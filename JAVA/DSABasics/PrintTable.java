package DSABasics;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		table(n);

	}

	private static void table(int n) {
		for(int i =1 ; i <=10 ; i++) {
			System.out.println(n + " X " + i + " = " + (n*i));
		}
		
	}

}

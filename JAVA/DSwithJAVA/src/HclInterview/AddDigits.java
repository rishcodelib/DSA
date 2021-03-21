package HclInterview;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner (System.in);
		int nbr = sc.nextInt();   // 123
//		int length = nbr.length();		//3
		
		int result =0;
		int no = String.valueOf(nbr).length(); //3
		for(int i = 0; i < no; i ++) {
			
			result += nbr %10;
			nbr = nbr/10;
		}
		System.out.println(result);
	}

}

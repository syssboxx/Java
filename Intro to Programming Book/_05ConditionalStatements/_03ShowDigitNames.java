package _05ConditionalStatements;

import java.util.Scanner;

public class _03ShowDigitNames {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		String number="";
		
//		do {
//			System.out.println("Enter number between 0 and 9 :");
//			n = sc.nextInt();
//		}while( n < 0 || n > 9);
		
		System.out.println("Enter number between 0 and 9 :");
		n = sc.nextInt();
			
		switch (n) {
		case 0: number = "zero";
				break;
		case 1: number = "one";
				break;
		case 2: number = "two";
				break;
		case 3: number = "three";
				break;
		case 4: number = "four";
				break;
		case 5: number = "five";
				break;
		case 6: number = "six";
				break;
		case 7: number = "seven";
				break;
		case 8: number = "eight";
				break;
		case 9: number = "nine";
				break;
		default: number = "invalid";
			break;
		}
		
		System.out.println("The number is "+number);
		

	}

}

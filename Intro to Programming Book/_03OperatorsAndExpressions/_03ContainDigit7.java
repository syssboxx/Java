package _03OperatorsAndExpressions;

import java.util.Scanner;

public class _03ContainDigit7 {

	//dali dadeno chislo sydyrja 7 za treta chifra otdqsno nalqvo - 1732
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int num = scan.nextInt();
		
		int numBy100 = num / 100;
		int digit=numBy100 % 10;
		
		if ( digit == 7){
			System.out.println("The third digit is 7");
		}
		else{
			System.out.println("The third digit is NOT 7");
		}
	}

}

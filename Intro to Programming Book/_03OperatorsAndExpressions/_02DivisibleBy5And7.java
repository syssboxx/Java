package _03OperatorsAndExpressions;

import java.util.Scanner;

public class _02DivisibleBy5And7 {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int a = scan.nextInt();
		
		if ( a % 5 ==0 && a % 7 == 0 ){
			System.out.println("It can be divided by 5 and 7");
		}
		else{
			System.out.println("It can NOT be divided by 5 and 7");
		}

	}

}

package _03OperatorsAndExpressions;

import java.util.Scanner;

public class _01OddOrEven {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int a = scan.nextInt();
		
		if ( a % 2 == 0){
			System.out.println("chetno");
		}
		else {
			System.out.println("nechetno");
		}

	}

}

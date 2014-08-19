package _05ConditionalStatements;

import java.util.Scanner;

public class _02ShowSignOfTwoNumbersWithoutCalculating {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter real number :");
		double a = sc.nextDouble();
		
		System.out.println("Enter another real number :");
		double b = sc.nextDouble();
		
		boolean isPositive = false;
		
		if ( (a > 0 && b > 0) || (a < 0 && b < 0) ){
			isPositive = true;
		}
		else if ( a == 0 || b == 0 ){
			System.out.println("Product is 0");
		}
		
		System.out.println("Positive product - "+isPositive);

	}

}

package _05ConditionalStatements;

import java.util.Scanner;

public class _01SwapIfFirstBiggerThanSecond {

	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer number :");
		int a = sc.nextInt();
		
		System.out.println("Enter another integer number :");
		int b = sc.nextInt();
		
		if (a > b){
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}

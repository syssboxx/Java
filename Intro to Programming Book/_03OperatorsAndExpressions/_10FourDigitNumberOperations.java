package _03OperatorsAndExpressions;

import java.util.Scanner;

public class _10FourDigitNumberOperations {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n;
		do{
			System.out.println("Enter a number between 1000 and 9999 :");
			n = scan.nextInt();
		}while(n<1000 || n>9999);
		
		int d = n % 10;
		int c = (n/10) % 10;
		int b = (n / 100) % 10;
		int a = (n / 1000) % 10;;
		 
		int sum = a + b + c + d;
		
		System.out.println(sum);
		
		System.out.print(d + ""+ a+""+b+""+c);
		
		System.out.println();
		
		System.out.print(a + ""+ c+""+b+""+d);
		
		;

	}

}

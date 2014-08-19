package _04InputOutput;

import java.util.Scanner;

public class _05FindBiggerNumberWithoutComparison {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer number :");
		int a = sc.nextInt();
		
		System.out.println("Enter another integer number :");
		int b = sc.nextInt();
		
		int moduleDiff = Math.abs(a-b);
		
		int bigger =  (a + b + moduleDiff) / 2;
		int smaller = (a + b - moduleDiff) / 2; 
		
		System.out.println("The bigger is "+bigger);
		System.out.println("The smaller is "+ smaller);
	}

}

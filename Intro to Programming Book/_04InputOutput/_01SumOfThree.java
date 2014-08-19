package _04InputOutput;

import java.util.Scanner;

public class _01SumOfThree {

	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		int n1 = sc.nextInt();
		
		System.out.println("Enter number 2");
		int n2 = sc.nextInt();
		
		System.out.println("Enter number 3");
		int n3 = sc.nextInt();
		
		int sum = n1 + n2 + n3;
		
		System.out.println(sum);
		

	}

}

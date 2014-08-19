package _04InputOutput;

import java.util.Scanner;

public class _07BiggestOfFive {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		double n = 5;
		double max = 0;
		
		System.out.println("Enter number :");
		double a = sc.nextDouble();
		
		if (a < 0){
			max = a;
		}

		for (int i = 1; i < n; i++) {
			
			System.out.println("Enter number :");
			a = sc.nextDouble();
			
			if ( a > max){
				max = a;
			}
		}
		
		System.out.println(max);

	}

}

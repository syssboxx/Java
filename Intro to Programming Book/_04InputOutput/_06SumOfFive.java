package _04InputOutput;

import java.util.Scanner;

public class _06SumOfFive {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n = 5;
		double sum = 0;

		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter number :");
			double a = sc.nextDouble();
			sum+=a;
		}
		
		System.out.println(sum);

	}

}

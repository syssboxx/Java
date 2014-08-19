package _06Loops;

import java.util.Scanner;

public class _03MinAndMaxOfSequence {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int n = sc.nextInt();
				
		System.out.println("Enter first number :");
		int x = sc.nextInt();

		int min = x;
		int max = x;
		
		for (int i = 1; i < n; i++) {
			System.out.println("Enter number : ");
			x = sc.nextInt();
			
			if (x > max){
				max = x;
			}
			
			if (x < min){
				min = x;
			}
		}
		
		System.out.println("Min = "+min);
		System.out.println("Max = "+max);

	}

}

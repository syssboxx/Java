package _06Loops;

import java.util.Scanner;

public class _01PrintToN {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i+" ");
		}
		

	}

}

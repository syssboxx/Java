package _06Loops;

import java.util.Scanner;

public class _10Matrix {

	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int n = sc.nextInt();
		int m = 2*n-1;
		
		for (int j = 1; j <= n; j++) {
			
			for (int i = j; i <= n+j-1; i++) {
				
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}

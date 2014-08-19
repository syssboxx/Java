package _06Loops;

import java.util.Scanner;

public class _05Fibonnacci {

	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int n = sc.nextInt();
		
		int n0 = 0;
		int n1 = 1; 
		//int n2 = n0 + n1;
		
		System.out.println("Fibonacci sequence :");
		System.out.printf("%d, %d, ",n0, n1);
		
		
		for (int i = 0; i < n; i++) {
			
			int n2 = n0 + n1;
			System.out.print(n2);
			
			if (i < n-1){
				System.out.print(", ");
			}
			
			n0 = n1;
			n1 = n2;
		}
		

	}

}

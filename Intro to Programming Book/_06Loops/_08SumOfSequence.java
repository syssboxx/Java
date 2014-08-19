package _06Loops;

import java.util.Scanner;

public class _08SumOfSequence {



	//S = 1 + 1!/x + 2!/x^2 + 3!/x^3 + ... + n!/x^n;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, n;
		
		do{
			System.out.println("Enter number n :");
			n = sc.nextInt();
		}while(n<=0);
		
		do{
			System.out.println("Enter number x :");
			x = sc.nextInt();
		}while(x==0);
		
		double sum = 1;
		
		int factoriel = 1;
		int power = 1;
		
		for (int i = 1; i <= n; i++) {
			
			factoriel = factoriel * i;
			power = power * x;
			
			sum += (double)(factoriel / power);
		}
		System.out.print("Sum="+sum);

	}

}

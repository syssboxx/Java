package _04InputOutput;

import java.util.Scanner;

public class _04DivisibleBy5InInterval {

	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer number :");
		int n1 = sc.nextInt();
		
		System.out.println("Enter another integer number :");
		int n2 = sc.nextInt();
		
		int count=0;
		
		//interval (n1,n2)
		if (n2 < n1 ){
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		for (int i = n1; i <= n2; i++) {
			if (i % 5 == 0){
				count ++;
				System.out.print(i+" ");
			}
		}
		
		System.out.printf("\nThere are %d numbers divisible by 5 between %d and %d",count,n1,n2);
		

	}

}

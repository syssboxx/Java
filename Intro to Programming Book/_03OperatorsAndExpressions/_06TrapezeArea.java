package _03OperatorsAndExpressions;

import java.util.Scanner;

public class _06TrapezeArea {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a :");
		float a = scan.nextFloat();
		
		System.out.println("Enter b :");
		float b = scan.nextFloat();
		
		System.out.println("Enter h :");
		float h = scan.nextFloat();
		
		float area = (a+b)/2*h;
		
		System.out.println(area);
		
		

	}

}

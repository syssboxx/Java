package _04InputOutput;

import java.util.Scanner;

public class _02PerimeterAndCircumpherence {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius :");
		double radius = sc.nextFloat();
		
		double perimeter = 2 * Math.PI * radius;
		double circumpherence = Math.PI * radius * radius;
		
		System.out.printf("Perimeter : %.2f%n",perimeter);
		System.out.printf("Circumpherence : %.2f ",circumpherence);

	}

}

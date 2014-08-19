package _05ConditionalStatements;

import java.util.Scanner;

public class _08BonusScores {

	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int scores=0;
		
		System.out.println("Enter number between 1 and 9 :");
		n = sc.nextInt();
		
		switch (n) {
		case 1:
		case 2:
		case 3:
			scores=n*10;
			break;
		case 4:
		case 5:
		case 6:
			scores = n*100;
			break;
		case 7:
		case 8:
		case 9:
			scores = n*1000;
			break;
		default:
			System.out.println("Invalid number");
			break;
		}
		if( scores != 0){
			System.out.println(scores);
		}
		


	}

}

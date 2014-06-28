import java.util.Scanner;


public class _02Echanges {

	private static Scanner scaner = new Scanner(System.in);
	
	public static void main(String[] args) {

				System.out.print("Entrez la premiere  valeur : ");
		int temp;
		int a = scaner.nextInt();
		
		System.out.print("Entrez la deuxieme  valeur : ");
		int b = scaner.nextInt();
		
		System.out.print("Entrez la troisieme  valeur : ");
		int c = scaner.nextInt();
		
		System.out.println("Les valeurs entrees sont : a="+a+", b="+b+" et c="+c);
		
		System.out.println("Permutation: a ==> b, b ==> c, c ==> a");
		temp=a;
		a=c;
		c=b;
		b=temp;
		
		System.out.print("Les valeurs permutees sont : a="+a+", b="+b+" et c="+c);
	}

}

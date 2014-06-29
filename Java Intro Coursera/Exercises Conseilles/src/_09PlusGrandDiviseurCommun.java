import java.util.Scanner;


public class _09PlusGrandDiviseurCommun {
	
	private static Scanner scan = new Scanner(System.in);

	public static void main (String args[]){
		
		System.out.println("Entrez un nombre positif :");
		int a = scan.nextInt();
		System.out.println("Entrez un nombre positif :");
		int b = scan.nextInt();
				
		//calcul du plus grand diviseur commun
		//algorithme d'Euclide
		
		int diviseurA=a;
		int diviseurB=b;
		int diviseur=diviseurA;
				
		while(diviseurA!=diviseurB){
			if (diviseurA>diviseurB){
				diviseurA=diviseurA-diviseurB;
			}
			else {
				diviseurB=diviseurB-diviseurA;
			}
			diviseur=diviseurA;
		}
		
		System.out.println("Le plus grand diviseur commun de "+a+ " et "+b+ " est "+diviseur);
		
	}
}

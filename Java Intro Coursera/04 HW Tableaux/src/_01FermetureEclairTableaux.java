import java.util.Scanner;


public class _01FermetureEclairTableaux {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int [] tab1= new int[]{1,7,6};
		int [] tab2= new int[tab1.length];
		int [] tab3 = new int[tab1.length*2];
		
		for (int i = 0; i < tab2.length; i++) {
			System.out.printf("Entrez une valeur pour l'element %d :",i);
			tab2[i]=scan.nextInt();
		}
		System.out.println("Les tableaux a entrelacer sont : ");
		for (int i = 0; i < tab1.length; i++) {
			System.out.print(tab1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < tab2.length; i++) {
			System.out.print(tab2[i]+" ");
		}
		System.out.println("\nLe resultat est :");
		for (int i = 0; i < tab1.length; i++) {
			
			tab3[2*i]=tab1[i];
			tab3[2*i+1]=tab2[i];
		}
		
		for (int i = 0; i < tab3.length; i++) {
			System.out.print(tab3[i]+" ");
		}

	}

}

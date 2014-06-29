import java.util.Scanner;


public class _12MultiplicationMatrices {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
				
		//saisie des matrices
		System.out.println("Entrez la dimension de matrice1 - lignes et colonnes : ");
		int lignes1=scan.nextInt();
		int colonnes1=scan.nextInt();
		System.out.println("Entrez la dimension de matrice2 - lignes et colonnes : ");
		int lignes2=scan.nextInt();
		int colonnes2=scan.nextInt();
		
		double matrice1[][] = new double[lignes1][colonnes1];
		double matrice2[][] = new double[lignes2][colonnes2];
		double produit[][]=new double[lignes1][colonnes2];
		
		System.out.println("Entrez lez elements - matrice1:");
		for (int i = 0; i < matrice1.length; i++) {
			for (int j = 0; j < matrice1[i].length; j++) {
				System.out.printf("M[%d][%d]=",i,j);
				matrice1[i][j]=scan.nextDouble();
			}
		}
		
		System.out.println("Entrez lez elements - matrice2:");
		for (int i = 0; i < matrice2.length; i++) {
			for (int j = 0; j < matrice2[i].length; j++) {
				System.out.printf("M[%d][%d]=",i,j);
				matrice2[i][j]=scan.nextDouble();
			}
		}
		
		if(lignes2!=colonnes1){
			System.out.println("Multiplication de matrices impossible !");
		}
		else{
			//calcul de la matrice multipliee
			//si l'on multiplie deux matrices M = M1*M2, les dimensions de M sont "nombre de lignes de M1" et "nombre de colonnes de M2"
			for (int i = 0; i < lignes1; i++) {
				for (int j = 0; j < colonnes2; j++) {
					produit[i][j]=0;
					//remplissage de la matrice	(3)	 			
					for (int k = 0; k < lignes2; k++) {
						produit[i][j]+=matrice1[i][k]*matrice2[k][j];
					}
				}
			}
		}
		//afficher le resultat de la multiplication
		System.out.println("Resultat :");
		for (int i = 0; i < produit.length; i++) {
			for (int j = 0; j < produit[i].length; j++) {
				System.out.print(produit[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}

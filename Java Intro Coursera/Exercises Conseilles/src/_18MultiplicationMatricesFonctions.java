import java.util.Scanner;


public class _18MultiplicationMatricesFonctions {
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		double[][] mat1 = lireMatrice();
        double[][] mat2 = lireMatrice();
        if (mat1[0].length != mat2.length) {
            System.out.println("Multiplication de matrices impossible !");
        } else {
            double [][] prod = multiplierMatrice(mat1, mat2);
            System.out.println("Résultat :");
            afficherMatrice(prod);
        }
	}
	
	private static double[][] lireMatrice() {
		System.out.println("Entrez la dimension de matrice - lignes et colonnes : ");
		int lignes1=scan.nextInt();
		int colonnes1=scan.nextInt();
		double matrice[][] = new double[lignes1][colonnes1]; 
		
		//saisie des elements de la matrice
		System.out.println("Entrez lez elements de la matrice:");
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.printf("M[%d][%d]=",i,j);
				matrice[i][j]=scan.nextDouble();
			}
		}
		
    	return matrice;
	}

	private static void afficherMatrice(double[][] prod) {
		System.out.println("Resultat :");
		for (int i = 0; i < prod.length; i++) {
			for (int j = 0; j < prod[i].length; j++) {
				System.out.print(prod[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static double[][] multiplierMatrice(double[][] mat1, double[][] mat2) {
		double[][]prod=new double[mat1.length][mat2[0].length];
		
		//calcul de la matrice multipliee
	   //si l'on multiplie deux matrices M = M1*M2, les dimensions de M sont "nombre de lignes de M1" et "nombre de colonnes de M2"
		
		//creer la nouvelle matrice et la remplir de 0
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat2[0].length; j++) {
				prod[i][j]=0.0;
				
				//remplissage de la matrice
				for (int k = 0; k < mat2.length; k++) {
					prod[i][j]+=mat1[i][k]*mat2[k][j];
				}
			}
		}
		return prod;
	}

	
	
	

}

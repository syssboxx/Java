import java.util.Scanner;


public class _11TableauxProduitsScalaires {
	
	private static Scanner scan = new Scanner(System.in);

	public static void main (String args[]){
		
		int nMax=10;
				
		double produitScalaire=0.0;
		int n=0;
		do{
			System.out.println("Entrez la taille effective des vecteurs (0<n<10)");
			n=scan.nextInt();
		}while(n<0 || n>nMax);
		
		double[] v1= new double[n];
		double[] v2= new double[n];
		 
		//entrer les valeurs des vecteurs
		System.out.println("entrer les valeurs du vecteur v1 :");
		for (int i = 0; i < n; i++) {
	        v1[i]=scan.nextDouble();
		}
		System.out.println("entrer les valeurs du vecteur v2 :");
		for (int i = 0; i < n; i++) {
			v2[i]=scan.nextDouble();
		}
		
		//calcul du produit scalaire
		//a·b = a 1*b1 + a2*b2 + ... + a n*bn
		for (int i = 0; i < n; i++) {
			produitScalaire+=v1[i]*v2[i];
		}
		
		System.out.println("Le produit scalaire de a et b est : "+produitScalaire);
	}
}

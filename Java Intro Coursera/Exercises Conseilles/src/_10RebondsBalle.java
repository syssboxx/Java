import java.util.Scanner;
import java.lang.Math;


public class _10RebondsBalle {
	private static Scanner scan = new Scanner(System.in);
	public final static double GRAVITE=9.81;

	public static void main (String args[]){
		
		double h0=0.0;
		//coefficient de rebond
		double eps=0.0;
		int n=0;
		double h_finale=0.0;
		//valeurs apres le rebonds
		double v=0.0;
		double v1=0.0;
		double h=0.0;
		
		//calculer la hauteur apres n rebonds
		System.out.println("Calculer la hauteur apres n rebonds : ");
		do {
			System.out.println("Entrez la hauteur initiale (0 <= h0) :");
			h0=scan.nextDouble();
		}while(h0<0.0);
		
		do{
			System.out.println("Entrez le coefficient de rebond (0 <= coeff < 1) :");
			eps=scan.nextDouble();
		}while(eps>=1.0 || eps<0.0);
		
		do{
			System.out.println("Entrez le nombre de rebond (0 <= n) :");
			n=scan.nextInt();
		}while(n<0);
		
		//calcul des rebonds
		for (int i = 0; i < n; i++) {
			v=Math.sqrt(2.0*h0*GRAVITE);
			v1=eps*v;
			h=(v1*v1)/(2.0*GRAVITE);
			h0=h;
		}
		System.out.println("Apres "+ n +" rebonds la hauteur sera "+ h);
		System.out.println();
		
		//calculer apres combien de rebonds on a la hauteur finale
		System.out.println("Calculer apres combien de rebonds on a une hauteur finale H : ");
		do {
			System.out.println("Entrez la hauteur initiale :");
			h0=scan.nextDouble();
		}while(h0<0.0);
		
		do{
			System.out.println("Entrez le coefficient de rebond :");
			eps=scan.nextDouble();
		}while(eps>=1.0 || eps<0.0);
		
		do{
			System.out.println("Entrez la hauteur finale :");
			h_finale=scan.nextDouble();
		}while(h_finale<0.0 || h_finale>h0);
		
		int nombre=0;
		do{
			v=Math.sqrt(2.0*h0*GRAVITE);
			v1=eps*v;
			h=(v1*v1)/(2.0*GRAVITE);
			h0=h;
			nombre++;
		}while(h>h_finale);
		System.out.println("Nombre de rebonds "+nombre);
	}
}

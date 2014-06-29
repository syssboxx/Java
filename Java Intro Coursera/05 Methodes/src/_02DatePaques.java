import java.util.Scanner;


public class _02DatePaques {
	
	private final static Scanner scan = new Scanner(System.in);

	public static void main(String args[]){
		int annee=demanderAnnee();
		afficheDate(annee, datePaques(annee));
		
	}
	static int demanderAnnee(){
		int annee;
		do {
			System.out.println("Entrez une annee (1583-4000) :");
			annee=scan.nextInt();
		}
		while(annee<1583 || annee>4000);
		return annee;
	}
	
	static void afficheDate(int annee, int nombreJours){
		//nombre de jours entre 22 et 56 
		System.out.printf("Date de Paques en %d : ",annee);
		if (nombreJours<=31){
			System.out.printf("%d mars",nombreJours);
		}
		else {
			nombreJours=nombreJours-31;
			System.out.printf("%d avril",nombreJours);
		}
	}
	
	static int datePaques(int annee){
		//calcul de la date da paques entre 22 et 56
		//l'algorithme de Gauss
		int siecle=annee/100;
		int p= (13+8*siecle)/25;
		int q=siecle/4;
		int m=(15-p+siecle-q) % 30;
		int n=(4 + siecle - q) % 7;
		int d=(m+19*(annee%19)) % 30;
		int e=(2 * (annee % 4) + 4 * (annee % 7) + 6 * d + n) % 7;
		
		//calcul approximatif du jour
		int jour=e+d+22;
		if ((e==6) && (d==29 || (d==28 && (11*(m+1))%30<19))){
			jour= jour-7;
			// tester 1954, 1981, 2049, 2076
			}
				
		return jour;
	}
}

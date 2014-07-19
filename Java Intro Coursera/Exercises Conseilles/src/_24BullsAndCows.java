import java.util.Scanner;


public class _24BullsAndCows {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		final int COUPS_MAX=10;
		int n=4;
		int m=6;
		int nbrCoup=1;
		//la bonne combinaison
		int[] laCombinaison= new int[n];
		//la combinaison propose par l' utilisateur
		int[] combinaison= new int[n];
		
		int[] reponse=new int[2];
		boolean solutionDevinee=false;
		
		//tirer la combinaison a deviner
		tirerCombinaison(laCombinaison);
		
		System.out.printf("Pourrez vous trouver ma combinaison de %d chiffres [compris entre 1 et %d avec répétitions possibles] en moins de %d coups %n?",n,m,COUPS_MAX);
		do{
			demanderCoup(combinaison);
			solutionDevinee=compare(laCombinaison,combinaison,reponse);
			afficheReponse(reponse);
			if (solutionDevinee){
				System.out.printf("BRAVO! Vous avez devines en %d coups %n",nbrCoup);
				break;
			}
			else{
				nbrCoup++;
			}
			
		}while(nbrCoup<=COUPS_MAX);
		
		if(!solutionDevinee){
			System.out.println("Desolee vous n'avez pas trouvé...");
			System.out.println("La bonne réponse était");
			afficheCombinaison(laCombinaison);
		}
	
		
	}

	private static void tirerCombinaison(int[] uneCombinaison ) {
		int m=6;
		for (int i = 0; i < 4; i++) {
			uneCombinaison[i]=hasard(m);
		}
		
	}
	
	static int hasard(int max) {
		 return (1 + (int)(Math.random() * max));
	}
	
	private static void demanderCoup(int[] combinaison) {
		System.out.println("Entrez les 4 chiffres  de votre proposition:");
		for (int i = 0; i < 4; i++) {
			combinaison[i]=scan.nextInt();
		}
		
	}
	
	private static boolean compare(int[] BonneCombinaison, int[] combinaison, int[] reponse) {
		int nbrBienPlace=0;
		int nbrMalPlace=0;
		boolean [] marque = new boolean[combinaison.length];
		
		//compare chiffre par chiffre s'ils sont bien place
		for (int i = 0; i <combinaison.length; i++) {
			if (combinaison[i]==BonneCombinaison[i]){
				nbrBienPlace++;
				marque[i]=true;
			}
			else{
				marque[i]=false;
			}
		}
		
		for (int i = 0; i < combinaison.length; i++) {
			if (combinaison[i]!=BonneCombinaison[i]){
				int j=0;
				boolean trouverMalPlace=false;
				while(j<combinaison.length && !trouverMalPlace){
					if (!marque[i] && combinaison[i]==BonneCombinaison[j]){
						trouverMalPlace=true;
						marque[i]=true;
						nbrMalPlace++;
					}
					j++;
				}
			}
		}
		
		reponse[0]=nbrBienPlace;
		reponse[1]=nbrMalPlace;
		
		if(nbrBienPlace==4){
			return true;
		}
		else{
			return false;
		}
	}
	
	static void afficheCombinaison(int[] combinaison){
		//1 2 3 4
		for (int i = 0; i < combinaison.length; i++) {
			System.out.print(combinaison[i]+" ");
		}
		System.out.println();
	}
	
	static void afficheReponse(int[] reponse){
		int nbrBienPlaces=reponse[0];
		int nbrMalPlaces=reponse[1];
		// #
		// OOO
		// ##OO
		for (int i = 0; i < nbrBienPlaces; i++) {
			System.out.print("#");
		}
		for (int i = 0; i < nbrMalPlaces; i++) {
			System.out.print("O");
		}
		System.out.println();
	}



}

import java.util.Scanner;


public class _20Cesure {

	private static Scanner scaner = new Scanner(System.in);
	public static void main(String[] args) {
		
		String[] phrase = lirePhrase();
		System.out.println("Le résultat est :");
        for (int i = 0; i < phrase.length; i++) {
            cesure(phrase[i]);
        }


	}

	private static String[] lirePhrase() {
		// retourne un tableau de chaines de caractères
        // introduits par l'utilisateur
		int nombre=0;
		while (nombre<=0){
			System.out.println("Donnez le nombre de mots dans votre phrase :");
			nombre = scaner.nextInt();
			if (nombre==0){
				System.out.println("entrez une valeur plus grande que 0");
			}
		}
		scaner.nextLine();
		String [] mots = new String[nombre];
		for (int i = 0; i < nombre; i++) {
				System.out.println("Donnez le mot "+(i+1));
				mots[i]=scaner.nextLine();
			}
		return mots;
	}
	
	
    static boolean voyelle(char c) {
        // teste si un caractère est une voyelle
    	//a, e, i, o, u, y
    	return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='y');
			 
    }

    static boolean queVoyelles(String s) {
        // teste si une chaîne ne contient que des voyelles
        // utilise la méthode voyelles
    	for (int i = 0; i < s.length(); i++) {
			if (!voyelle(s.charAt(i))){
				return false;
			}
		}
    	return true;
    }

    static void cesure(String mot) {
        // détermine la césure d'un mot donné et effectue les affichages
        // correspondants (voir exemple de déroulement)
     	int debut=0;
    	for (int i = 1; i < mot.length(); i++) {
    		char c1=mot.charAt(i-1);
    		char c2=mot.charAt(i);
			if ( voyelle(c1) && !voyelle(c2) ){
				//couper le mot en plusieurs string
				String s1=mot.substring(debut, i);
				String s2 = mot.substring(i,mot.length());
				
				//Une lettre ne peut être seule sur une ligne
				if ((s1.length()>1) && (s2.length()>1)){
					//au moins une consone par ligne
					if (!(queVoyelles(s1)||queVoyelles(s2))){
						System.out.println(s1+'-');
					}
					debut=i;
				}
			}
		}
    	String s2=mot.substring(debut, mot.length());
    	System.out.println(s2);
    }


}

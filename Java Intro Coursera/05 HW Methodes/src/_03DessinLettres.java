
public class _03DessinLettres {

	public static void main(String args[]){
	     int hauteur = 7;
	     
	     afficheN(hauteur);
	     finLigne();
	     
	     afficheL(hauteur);
	     finLigne();

	     afficheO(hauteur);
	     finLigne();

	     afficheZ(hauteur);
	     finLigne();

	     afficheA(hauteur);
		
	}
	
	public static void espaces(int decalage) {
        for (int i = 0; i < decalage; ++i) {
            // astuce: remplacez temporairement ' '
            // par '#' pour mieux voir les espaces.
            System.out.print(' ');
        }
    }

    public static void barreHorizontale(int longueur, int decalage) {
        espaces(decalage);
        for (int i = 0; i < longueur; ++i) {
            System.out.print('-');
        }
    }

    public static void barreVerticale(int decalage) {
        espaces(decalage);
        System.out.print('|');
    }

    public static void barreObliqueDroite(int decalage) {
        espaces(decalage);
        System.out.print('/');
    }

    public static void barreObliqueGauche(int decalage) {
        espaces(decalage);
        // Attention, cette ligne affiche bien UN SEUL caractere \ !
        // En Java, il faut repeter deux fois le caractere \ pour en
        // n'afficher qu'un seul.
        System.out.print('\\');
    }

    public static void finLigne() {
        System.out.println();
    }

    public static void afficheN(int hauteur) {
        for (int i = 0; i < hauteur; ++i) {
            barreVerticale(0);
            barreObliqueGauche(i);
            barreVerticale(hauteur - i - 1);
            finLigne();
        }
    }
    
    public static void afficheL(int hauteur) {
        for (int i = 0; i < hauteur; ++i) {
        	barreVerticale(0);
            finLigne();
        }
        barreHorizontale(hauteur, 0);
        finLigne();
    }
    
    public static void afficheO(int hauteur) {
    	barreHorizontale(hauteur-2, 1);
    	finLigne();
        for (int i = 0; i < hauteur-1; ++i) {
        	barreVerticale(0);
        	barreVerticale(hauteur-2);
        	finLigne();
        }
        barreHorizontale(hauteur-2, 1);
    	finLigne();
    }
    
    public static void afficheZ(int hauteur) {
    	barreHorizontale(hauteur, 0);
    	finLigne();
        for (int i = 1; i < hauteur-1; ++i) {
        	barreObliqueDroite(hauteur-i-1);
            finLigne();
        }
        barreHorizontale(hauteur, 0);
        finLigne();
    }
    
    public static void afficheA(int hauteur) {
        for (int i = 0; i < hauteur; ++i) {
        	barreObliqueDroite(hauteur-i-1);
        	if (i==(hauteur+1)/2){
        		barreHorizontale(2*i, 0);
        	}
        	else{
        		espaces(2*i);
        	}
        	barreObliqueGauche(0);
            finLigne();
        }
    }
}

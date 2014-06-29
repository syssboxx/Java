import java.util.ArrayList;


public class _01SommeProduits {

	public static void main(String args[]){
		
		//calcul des nombres
		//somme()
		//produit()
		//sommeProduitsEgaux()
		//afficher les 20 premiers chiffres plus grands que 10
		//22 123 132 213 231
		
		//test
		System.out.println(somme(123));
		System.out.println(produit(123));
		System.out.println(sommeProduitEgaux(123));
		System.out.println(sommeProduitEgaux(20));
		
		int nombre=10;
		int resultats=0;
		do {
			 if (sommeProduitEgaux(nombre)){
			     System.out.print(nombre+" ");
				 resultats++;
				}
			 nombre++;
		} while(resultats<20);
			
		}
	static ArrayList<Integer> calculChiffreDuNombre(int nombre){
		ArrayList<Integer> chiffres = new ArrayList<Integer>();
		int chiffre=0;
		do{
			chiffre=nombre%10;
			chiffres.add(chiffre);
			nombre=nombre/10;
		}
		while(nombre!=0);
		
		return chiffres;
	}
	
	static int somme(int nombre){
		int somme=0;
		//calcul
		ArrayList<Integer>chiffres = calculChiffreDuNombre(nombre);
		for (int i = 0; i < chiffres.size(); i++) {
			somme+=chiffres.get(i);
		}
		return somme;
	}
	
	static int produit(int nombre){
		int produit=1;
		//calcul
		ArrayList<Integer>chiffres = calculChiffreDuNombre(nombre);
		for (int i = 0; i < chiffres.size(); i++) {
			produit*=chiffres.get(i);
		}
		return produit;
	}
	
	///////////////////////////////////////////////////////
	//optimisation pour les methodes de somme et produits
	static int sommetOptimised(int nombre){
		int somme=0;
		//calcul
		do {
			somme+=nombre%10;
			nombre/=10;
		}while (nombre!=0);
		return somme;
	}
	
	static int produitOptimised(int nombre){
		int produit=1;
		do {
			produit*=nombre%10;
			nombre/=10;
		}while (nombre!=0);
		return produit;
	}
	//////////////////////////////////////////////////////
	
	static boolean sommeProduitEgaux(int nombre){
		return somme(nombre)==produit(nombre);
	}	
		
	}
		
	

package bibliotheque;

import java.util.ArrayList;

class Auteur {

    private String nom;
	private boolean estPrime;
	
	public Auteur(String nom, boolean estPrime){
		this.nom = nom;
		this.estPrime = estPrime;
	}
	
	public String getNom(){
		return nom;
	}
	
	public boolean getPrix(){
		if (estPrime){
			return true;
		}else{
			return false;
		}
	}
}
	
	





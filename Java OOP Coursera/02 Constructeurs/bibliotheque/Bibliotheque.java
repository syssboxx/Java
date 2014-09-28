package bibliotheque;

import java.util.ArrayList;

public class Bibliotheque {

	private String nom;
	private ArrayList<Exemplaire> exemplaires;
	
	public Bibliotheque(String nom){
		this.nom = nom;
		System.out.printf("La bibiotheque %s est ouverte! %n",nom);
	}
	
	public String getNom(){
		return nom;
	}
	
	public void stocker(Oeuvre oeuvre, int nombre){
		for (int i = 0; i < exemplaires.size(); i++) {
			if (exemplaires.get(i)==null)
			exemplaires.add(new Exemplaire(oeuvre));
		}
		
	}
	
	public void stocker(Oeuvre oeuvre){
		exemplaires.add(new Exemplaire(oeuvre));
	}
	
	public ArrayList<Exemplaire> listerExemplaires(String langue){
		ArrayList<Exemplaire> exemplairesLangue = new ArrayList<Exemplaire>();
		
		for (int i = 0; i < exemplaires.size(); i++) {
			Exemplaire currentExemplaire = exemplaires.get(i);
			Oeuvre currentOeuvre = currentExemplaire.getOeuvre();
			if (currentOeuvre.getLangue().equals(langue)){
				exemplairesLangue.add(currentExemplaire);
			}
		}
		return exemplairesLangue;
		
	}
	
	public ArrayList<Exemplaire> listerExemplaires(){		
		return exemplaires;
	}
	
	public int compterExemplaires(Oeuvre oeuvre){
		int nombre = 0;
		
		for (int i = 0; i < exemplaires.size(); i++) {
			if (exemplaires.get(i).getOeuvre().equals(oeuvre)) {
				nombre++;
			}
		}
		return nombre;
	}
	
	public void afficherAuteur(boolean auteurStocke){
		for (int i = 0; i < exemplaires.size(); i++) {
			if (auteurStocke){
				if (exemplaires.get(i).getOeuvre().getAuteur().getPrix()){
					System.out.println(exemplaires.get(i).getOeuvre().getAuteur().getNom());
				}
			}else{
				if (!exemplaires.get(i).getOeuvre().getAuteur().getPrix()){
					System.out.println(exemplaires.get(i).getOeuvre().getAuteur().getNom());
				}
			}
		}
	}
	
	public void afficherAuteur(){
		for (int i = 0; i < exemplaires.size(); i++) {
			if (exemplaires.get(i).getOeuvre().getAuteur().getPrix()){
				System.out.println(exemplaires.get(i).getOeuvre().getAuteur().getNom());
			}
		}
	}
}

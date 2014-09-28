package bibliotheque;

public class Exemplaire {

	private Oeuvre oeuvre;
	
	public Exemplaire(Oeuvre oeuvre){
		this.oeuvre = oeuvre;
		System.out.printf("Nouvel exemplaire -> <%s>, <%s>, en <%s %n>",oeuvre.getTitre(),oeuvre.getAuteur(),oeuvre.getLangue());
	}
	
	//constructeur de copie
	public Exemplaire(Oeuvre oeuvreACopier, Oeuvre oeuvre){
		oeuvre = oeuvreACopier;
		System.out.printf("Copie d'un exemplaire de -> <%s>, <%s>, en <%s %n>",oeuvre.getTitre(),oeuvre.getAuteur(),oeuvre.getLangue());
	}
	
	public Oeuvre getOeuvre(){
		return oeuvre;
	}
	
	public void afficher(){
		//Un exemplaire de <titre>, <nom de l'auteur>, en <langue>
		System.out.printf("Un exemplaire de -> <%s>, <%s>, en <%s>",oeuvre.getTitre(),oeuvre.getAuteur(),oeuvre.getLangue());
	}
}

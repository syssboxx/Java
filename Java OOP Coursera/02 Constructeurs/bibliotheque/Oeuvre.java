package bibliotheque;

public class Oeuvre {

	private String titre;
	private final Auteur auteur;
	private String langue = "francais";
	
	
	public Oeuvre(String titre, Auteur auteur){
		this.titre = titre;
		this.auteur = auteur;
	}
	
	public Oeuvre(String titre, Auteur auteur, String langue){
		this(titre,auteur);
		this.langue = langue;
	}
	
	public String getTitre(){
		return titre;
	}
	
	public Auteur getAuteur(){
		return auteur;
	}
	
	public String getLangue(){
		return langue;
	}
	
	public void afficher(){
		//<titre>, <nom de l'auteur>, en <langue>
		System.out.printf("<%s>, <%s>, en <%s>", titre,auteur, langue );
	}
	
}

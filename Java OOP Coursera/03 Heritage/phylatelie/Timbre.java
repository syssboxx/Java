package phylatelie;

public class Timbre {

	public static final int ANNEE_COURANTE = 2014;
    public static final int VALEUR_TIMBRE_DEFAUT = 1;
    public static final String PAYS_DEFAUT = "Suisse";
    public static final String CODE_DEFAUT = "lambda";

    public static final int BASE_1_EXEMPLAIRES = 100;
    public static final int BASE_2_EXEMPLAIRES = 1000;
    public static final double PRIX_BASE_1 = 600;
    public static final double PRIX_BASE_2 = 400;
    public static final double PRIX_BASE_3 = 50;

    
    // ordre des parametres: nom, annee d'emission, pays, valeur faciale,
        
    private String code;
    private int annee;
    private String pays;
    private double valeurFacial;
    
    //private int nombreExemplaire;
    
    public Timbre(){
    	this.code = CODE_DEFAUT;
    	this.annee = ANNEE_COURANTE;
    	this.pays = PAYS_DEFAUT;
    	this.valeurFacial = VALEUR_TIMBRE_DEFAUT;
    }
    
    public Timbre(String code,int annee, String pays, double valeurFacial){
    	this.code = code;
    	this.annee = annee;
    	this.pays = pays;
    	this.valeurFacial = valeurFacial;
    }
    
    public String getCode(){
    	return code;
    }
    
    public int getAnnee(){
    	return annee;
    }
    public String getPays(){
    	return pays;
    }
    public double getValeurFacial(){
    	return valeurFacial;
    }
    
    public double vente(){
    	double prixVente;
    	
    	if (this.age()<5){
    		prixVente = this.getValeurFacial();
    	}else{
    		prixVente = this.getValeurFacial() * 2.5 *this.age();
    	}
    	
    	return prixVente;
    }
    
    @Override
    public String toString() {
    	// Timbre de code <code> datant de <annee> (provenance <pays>) ayant pour valeur faciale <valeur faciale> francs
    	return String.format("Timbre de code <%s> datant de <%d> (provenance <%s>) ayant pour valeur faciale <%.2f> francs",code,annee,pays,valeurFacial);
    }
    
    public int age(){
    	return ANNEE_COURANTE - this.getAnnee();
    }
    

}

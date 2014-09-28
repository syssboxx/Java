package phylatelie;

public class Rare extends Timbre {

	private int nombreExemplaire;
	
	public Rare(int nombreExemplaire){
		super();
		this.nombreExemplaire = nombreExemplaire;
	}
	
	public Rare(String code,int annee, String pays, double ValeurFacial, int nombreExemplaire){
		super(code,annee, pays, ValeurFacial);
		this.nombreExemplaire = nombreExemplaire;
	}
	
	public int getExemplaires(){
		return nombreExemplaire;
	}
	
	@Override
	public String toString() {
		//Timbre de code <code> datant de <annee> (provenance <pays>) ayant pour valeur faciale <valeur faciale> francs
		//Nombre d'exemplaires -> <exemplaires>
		
		return super.toString() + String.format("\nNombre d'exemplaires -> <%d> ", nombreExemplaire);
	}
	
	public double vente(){
		return this.calculPrixBase()*(age()/10.0);
	}
	
	private double calculPrixBase(){
		if (nombreExemplaire < 100){
			return Timbre.PRIX_BASE_1;
		}else if (nombreExemplaire >=100 && nombreExemplaire <= 1000){
			return Timbre.PRIX_BASE_2;
		}else{
			return Timbre.PRIX_BASE_3;
		}
	}

}

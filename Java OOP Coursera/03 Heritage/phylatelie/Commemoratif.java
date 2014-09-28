package phylatelie;

public class Commemoratif extends Timbre {

	public Commemoratif(){
		super();
	}
	
	public Commemoratif(String code,int annee, String pays, double ValeurFacial){
    	super(code,annee,pays,ValeurFacial);
    }
	
	@Override
	public String toString() {
		//Timbre de code <code> datant de <annee> (provenance <pays>)
		//ayant pour valeur faciale <valeur faciale> francs
		//Timbre celebrant un evenement

		return super.toString() + String.format("\nTimbre celebrant un evenement");
	}
	
	public double vente(){
		return 2 * super.vente();
	}
}

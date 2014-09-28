package tirelire;

class Tirelire {

	private double montant;
	
	public double getMontant(){
		return montant;
	}
	
	public void afficher(){
		if (montant > 0){
			System.out.printf("Vous avez : <%f> euros dans votre tirelire.%n",montant);
		}else{
			System.out.println("Vous etes sans le sous.");
		}
	}
	
	public void secouer(){
		if (montant > 0){
			System.out.println("Bing Bing");
		}
	}
	
	public void remplir(double montant){
		if (montant > 0 ){
			this.montant += montant;
		}
	}
	
	public void vider(){
		this.montant = 0;
	}
	
	public void puiser(double montantDispo){
		if (montantDispo > 0){
			this.montant -= montantDispo;
			if (montantDispo > this.montant){
				this.vider();
			}
		}
	}
	
	public double calculerSolde(double budget){
		double solde = montant - budget;
		
		if (budget <= 0){
			return montant;
		}else{
			return solde;
		}
	}
}

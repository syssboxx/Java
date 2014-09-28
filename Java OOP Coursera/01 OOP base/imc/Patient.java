package imc;

class Patient {

	private double masse;
	private double hauteur;
	
	public void init(double masse, double hauteur){
		if(masse > 0 && hauteur > 0){
			this.masse = masse;
			this.hauteur = hauteur;
		}else{
			this.masse = 0;
			this.hauteur = 0;
		}
	}
	
	public void afficher(){
		//Patient : <poids> kg pour <taille> m
		System.out.printf("Patient : <%.2f> kg pour <%.2f> m %n", this.getMasse(), this.getHauteur());
	}
	
	public double getMasse(){
		return masse;
	}
	
	public double getHauteur(){
		return hauteur;
	}
	
	//son poids divisé par le carré de sa taille ; en cas de taille nulle, cette méthode retournera zéro.
	public double imc(){
		double imc = 0;
		if (masse == 0){
			imc = 0; 
		}else{
			imc = masse/(hauteur * hauteur);
		}
			
		return imc;
	}
}

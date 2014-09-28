package souris;

class Souris {
	
	public static final int ESPERANCE_VIE_DEFAUT = 36;
	
	//poids, age, couleur, esperanceVie et clonee
	private int poids;
	private int age = 0;
	private String couleur;
	private int esperanceVie = ESPERANCE_VIE_DEFAUT;
	private boolean clonee;
	
	public Souris(int poids, String couleur){
		this.poids = poids;
		this.couleur = couleur;
		System.out.println("Une nouvelle souris");		
		
	}
	
	public Souris(int poids, String couleur, int age){
		this(poids,couleur);
		this.couleur = couleur;
		System.out.println("Une nouvelle souris");
		
		
	}
	
	public Souris(Souris s){
		this(s.poids,s.couleur,s.age);
		this.esperanceVie = s.esperanceVie * 4/5;
		System.out.println("Clonage d'une souris !");
	}
	
	
	public Souris(int poids, String couleur, int age, int esperanceVie){
		this(poids,couleur,age);
		this.esperanceVie = esperanceVie;
		
		System.out.println("Une nouvelle souris");
	}
	
	
	
	//Une souris <couleur> [, clonee,] de <age> mois et pesant <poids> grammes
	@Override
	public String toString() {
		String affichage = String.format("Une souris %s",couleur);
		
		if (clonee){
			affichage += new String(" [,clonee] ");
		}
		affichage += String.format("de %d mois et pesant %d grammes",age, poids);
		return affichage;
		
	}
	
	public void vieillir(){
		this.age++;
		
		if (clonee){
			if (age > esperanceVie/2){
				this.couleur = "verte";
			}
		}
	}
	
	public void evolue(){
		for (int i = this.age; i < esperanceVie; i++) {
			vieillir();
		}
	}
	
	
	
	
	public static class Labo{
		
		public static void main(String[] args) {
	        Souris s1 = new Souris(50, "blanche", 2);
	        Souris s2 = new Souris(45, "grise");
	        Souris s3 = new Souris(s2);

	        System.out.println(s1);
	        System.out.println(s2);
	        System.out.println(s3);
	        s1.evolue();
	        s2.evolue();
	        s3.evolue();
	        System.out.println(s1);
	        System.out.println(s2);
	        System.out.println(s3);
	    }
	}
	
	


}

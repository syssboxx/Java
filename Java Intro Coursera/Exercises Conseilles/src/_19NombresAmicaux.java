import java.util.ArrayList;


public class _19NombresAmicaux {

	public static void main(String[] args) {
		
		int[] nombres = {1210, 45, 27, 220, 54, 284, 9890, 120, 1184};
	    System.out.println("Les paires de nombres amicaux sont : ");
	    afficherAmicaux(nombres);
	}

	private static void afficherAmicaux(int[] nombres) {
		for (int i = 0; i <nombres.length; i++) {
			for (int j = i; j < nombres.length; j++) {
				
				if (EstAmical(nombres[i], nombres[j])){
					System.out.println(nombres[i]+" "+nombres[j]);
				}
			}
		}
	}
	
	public static int sommeDiviseurs(int nombre){
		int somme=0;
		for (int i = 1; i <= nombre; i++) {
			if (nombre%i==0){
				somme+=i;
			}
		}
		return somme;
	}
	
	public static boolean EstAmical(int nombre1,int nombre2){
		int somme=sommeDiviseurs(nombre1);
		if (sommeDiviseurs(nombre1)==sommeDiviseurs(nombre2) && nombre1+nombre2==somme ){
			return true;
		}
		else{
			return false;
		}
	}
	

}

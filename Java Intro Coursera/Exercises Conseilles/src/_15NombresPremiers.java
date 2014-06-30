import java.util.ArrayList;

//prime numbers
//Test de la primalité d'un nombre n (algorithme) :
//1.Vérifier si le nombre n est pair (si oui, il n'est pas premier sauf si c'est 2).
//2.Pour tous les nombres impairs inférieurs ou égaux à la racine carrée de n, vérifier s'ils divisent n. Si ce n'est pas le cas, alors n est premier.


public class _15NombresPremiers {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> nombresPremiers = new ArrayList<Integer>();
		final int nMax=100;
		
		
		for (int nombre = 2; nombre <= nMax; nombre++) {
			int diviseur=1;
			boolean premier=true; 
			
			//tester si le nombre est paire
			if (nombre%2==0){
				if (nombre!=2 ){
					premier=false;
					diviseur=2;					
			    }
			}
			else{
				for (int i = 3;(premier) && i <= Math.sqrt(nombre); i+=2) {
					if (nombre % i==0){
							premier=false;
							diviseur=i;
					}
				}
			}
			
			if (premier){
				nombresPremiers.add(nombre);
			}
		}
		
		System.out.println("Les nombres premiers compris entre 2 et 100 sont les suivants : ");
		for (int i = 0; i < nombresPremiers.size(); i++) {
			System.out.println(nombresPremiers.get(i));
			
		}

	}

}

import java.util.Scanner;


//Considérons les opérations suivantes applicables à un nombre entier : •si ce nombre est divisible par 3, on lui ajoute 4 ; 
//•s'il n'est pas divisible par 3 mais divisible par 4, on le divise par 2 ; 
//•s'il n'est divisible ni par 3, ni par 4, on lui soustrait 1. 
//
//On répète ces opérations successivement jusqu'à arriver à 0.
//On vous demande d'écrire un programme qui affiche le nombre de répétitions des opérations précédentes nécessaires pour tomber à 0, 
//en partant tour à tour de chacun des entiers compris entre deux entiers saisis au clavier. 

public class _01JeuxNombres {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int debut;
		do{
			System.out.println("de >=1 ?");
			debut=scan.nextInt();
		}
		while(debut<1);
		
		int fin;
		do{
			System.out.println("a >="+debut+"?");
			fin = scan.nextInt();
		}
		while(fin<debut);
		
		//operations
		for(int i=debut;i<=fin;i++){
			int num=i;
			int repetition=0;
			do{
				if(num%3==0){
					num+=4;
				}
				else if (num%4==0){
					num/=2;
				}
				else{
					num--;
				}
				repetition++;
				
			}while(num!=0);
			System.out.printf("%d->%d repetitions %n",i,repetition);
		}
	}

}

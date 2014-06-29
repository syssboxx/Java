//affichant les tables de multiplication de 2 à 10. 

//	Table de 2 :
//		1 * 2 = 2
//	    ...
//		10 * 2 = 20
//		...
//	Table de 5 :
//		  1 * 5 = 5
//		  2 * 5 = 10

public class _08TableMultiplication {
	
	public static void main(String args[]){
		
		for (int i = 2; i <= 10; i++) {
			
			System.out.printf("Table de %d : %n",i );
			for (int j = 1; j <= 10; j++) {
				System.out.printf("  %d * %d = %d %n",j,i,j*i);
			}
			
		}
		
	}
	
}

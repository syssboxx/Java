//Le tri de Shell est un tri par insertion où l' on ne compare pas un élément à son prédecesseur immédiat. 
//On le compare plutôt à son prédecesseur à distance k.


public class _22TriDeShell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] tab = { 3, 5, 12, -1, 215, -2, 17, 8, 3, 
                5, 13, 18, 23, 5, 4, 3, 2, 1    };
		System.out.println("A trier  : ");
		affiche(tab);
		triShell(tab);
		System.out.println("Résultat :");
		affiche(tab);



	}

	private static void triShell(int[] tab) {
		for (int k = (tab.length)/2; k >=1; k=k/2) {
			for (int i = k+1; i <= tab.length; i++) {
				int j=i-k;
				while(j>0){
					if (tab[j-1]>tab[j+k-1]){
						//echanger tab[j] et tab[j+k]
						int temp=tab[j-1];
						tab[j-1]=tab[j+k-1];
						tab[j+k-1]=temp;
						j=j-k;
					}
					else{
						j=0;
					}
				}
				
			}
		}
		
	}
	
	
	private static void affiche(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]+" ");
		}

		System.out.println();
	}

}

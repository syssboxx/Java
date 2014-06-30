import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;


public class _14TableauxDynamiques {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int TAILLE = 10;
        ArrayList<Integer> tab = new ArrayList<Integer>();
        for (int i = 0; i < TAILLE; ++i) {
            tab.add(tab.size());
        }
        
        System.out.println("Tab1 :");
        for (int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
		}
        
        ArrayList<Integer> tab1 = new ArrayList<Integer>();
        tab1.add(99);
        tab1.add(1);
        tab1.add(0);
        
        ArrayList<Integer> tab2 = new ArrayList<Integer>();
        for(int i=0; i < tab1.size(); ++i) {
            tab2.add(tab1.get(0));
        }
        
        System.out.println("Tab2 :");
        for (int i = 0; i < tab2.size(); i++) {
			System.out.println(tab2.get(i));
		}



	}

}

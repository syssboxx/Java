import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Deal {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("enter numHands and cardsPerHand");
        int numHands = sc.nextInt();
        int cardsPerHand = sc.nextInt();
		
//        if (args.length < 2) {
//            System.out.println("Usage: Deal hands cards");
//            return;
//        }
        
        
    
        // Make a normal 52-card deck.
        String[] suit = new String[] {
            "spades", "hearts", 
            "diamonds", "clubs" 
        };
        String[] rank = new String[] {
            "ace", "2", "3", "4",
            "5", "6", "7", "8", "9", "10", 
            "jack", "queen", "king" 
        };

        ArrayList<String> deck = new ArrayList<String>();
        for (int i = 0; i < suit.length; i++)
            for (int j = 0; j < rank.length; j++)
                deck.add(rank[j] + " of " + suit[i]);
    
        // Shuffle the deck.
        Collections.shuffle(deck);
    
        if (numHands * cardsPerHand > deck.size()) {
            System.out.println("Not enough cards.");
            return;
        }
    
        for (int i = 0; i < numHands; i++)
            System.out.println(dealHand(deck, cardsPerHand));
    }
  
    public static <E> ArrayList<E> dealHand(ArrayList<E> deck, int n) {
        int deckSize = deck.size();
        ArrayList<E> handView = (ArrayList<E>) deck.subList(deckSize - n, deckSize);
        ArrayList<E> hand = new ArrayList<E>(handView);
        handView.clear();
        return hand;
    }

}

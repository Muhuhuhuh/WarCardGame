package warCardGame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	   ArrayList<Card> cards;
	   
	    public void createDeck() {
	        cards = new ArrayList<Card>();
	        for (int i = 1; i <= 13; i++) {
	            cards.add(new Card(i, "Hearts"));
	            cards.add(new Card(i, "Diamonds"));
	            cards.add(new Card(i, "Clubs"));
	            cards.add(new Card(i, "Spades"));
	        }
	        

	        
	    }
	    
        public void shuffle() {
            Collections.shuffle(cards);
        }
     
        public Card drawCard() {
            return cards.remove(0);
        }
}

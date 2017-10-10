package pkgCore;

import java.util.ArrayList;
import java.util.Collections;


import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}


	public Card Draw() throws DeckException {
		
		 if (cardsInDeck.size() == 0) {
		        throw new DeckException(this);
		 }
		        
		return cardsInDeck.remove(0);
		
		}
	
	
	
	public Card Draw(eSuit B) {
		
		for (Card T: this.cardsInDeck) {
			if (T.geteSuit() == B) {
				cardsInDeck.remove(T);
			
			return T;
		}
	}
	
	return null;
	
}


	public Card Draw(eRank A) {
		
		for (Card S: this.cardsInDeck) {
			if (S.geteRank() == A) {
				cardsInDeck.remove(S);
				
				return S;
		}
	}
		return null;
	}


	public int Count(eSuit D) {
		
		int suit = 13;
		
		for(Card card: this.cardsInDeck) {
			if(card.geteSuit() == D) {
				
				suit--;		

		}
		
		}
		return suit;
	}

	
	public int Count(eRank E) {
		
		int rank = 4;
		
		for (Card card: this.cardsInDeck) {
			if(card.geteRank() == E) {
				
				rank--;
			}
		}
		
		return rank;
	
			}
		

	public int Count(Card F) {
		
		for(Card G: cardsInDeck) {
			if(G==F) {
				return 1;
			}
		}
			
			return 0;

	
}
	}


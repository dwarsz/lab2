package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	//	TODO: Add 'cards' attribute that is an ArrayList of Card
	ArrayList<Card> cards = new ArrayList<Card>();	
	
	//	TODO: Add a constructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	public Deck(int d) {
		while(d > 0) {
			for(eSuit s: eSuit.values()) {
				for(eRank r: eRank.values()) {
					cards.add(new Card(r,s));
				}
			}
			d--;
		}
		Collections.shuffle(cards);
	}
	public Deck() {
		for(eSuit s: eSuit.values()) {
			for(eRank r: eRank.values()) {
				cards.add(new Card(r,s));
			}
		}
	}
	
	
	
	public Card draw() throws Exception {
		if(cards.size() == 0) {
			throw new Exception("Empty Deck");
		}
		return cards.remove(0);
		
	}
	public int getRemaining(Object eNum){
		int counter=0;
		Object type = null;
		for(Card c: cards){
			type = ((eNum instanceof eSuit)? c.getSuit(): c.getRank());
			if(type==eNum) {
				++counter;
			}
		}
	return counter;
	}
}

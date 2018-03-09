package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {
//
	//	TODO: Card has two attributes, eRank and eSuit, add these attributes
	private eRank rank;
	private eSuit suit;
	
	//	TODO: Build a constructor for Card passing in eRank and eSuit
	public Card(eRank r, eSuit s) {
		rank = r;
		suit = s;
	}
	public Card(eSuit s, eRank r) {
		rank = r;
		suit = s;
	}
	
	//	TODO: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit
	public eRank getRank() {
		return rank;
	}
	private void setRank(eRank r) {
		rank = r;
	}
	public eSuit getSuit() {
		return suit;
	}
	private void setSuit(eSuit s) {
		suit = s;
	}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.getRank().compareTo(this.getRank());

}
	
}

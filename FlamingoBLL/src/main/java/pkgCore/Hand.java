package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		Deck d1 = new Deck(1);
		try {
			Card card1 = d1.draw();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Card card2 = d1.draw();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		
		for (Card c: cards)
		{
			//	TODO: Determine the score.  
			//			Cards:
			//			2-3-4 - score = 11
			//			5-J-Q - score = 25
			//			5-6-7-2 - score = 20
			//			J-Q	- score = 20
			//			8-A = score = 9 or 19
			//			4-A = score = 5 or 15
			if(c.getRank() == eRank.ACE) {
				if(iScore[1] + 11 > 21) {
					iScore[0] += 1;
					iScore[1] += 1;
				}
				else {
					iScore[0] += 1;
					iScore[1] += 11;
				}
			}
			else {
				if(c.getRank().getiRankNbr() > 9) {
					iScore[0] += 10;
					iScore[1] += 10;
				}
				else {
					iScore[0] += c.getRank().getiRankNbr();
					iScore[1] += c.getRank().getiRankNbr();
				}
			}	
		}
		
		return iScore;
	}
	
	public void Draw(Deck d)
	{
		//	TODO: add a card to 'cards' from a card drawn from Deck d
		try {
			cards.add(d.draw());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}

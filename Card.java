
public class Card {
	
	private Suit suit; 
	private Rank rank; 
	
	public Card (Suit thisCardSuit, Rank thisCardRank) {
		this.suit = thisCardSuit;
		this.rank = thisCardRank;
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public String toString() {
		return "The " + rank + " of " + suit; 
	}
}

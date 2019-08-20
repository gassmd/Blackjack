public class Card {

	private Suit suit; 
	private Rank rank; 

	public Card (Suit thisCardSuit, Rank thisCardRank) {
		suit = thisCardSuit;
		rank = thisCardRank;
	}

	public Rank getRank() {
		return this.rank;
	}

	public Suit getSuit() {
		return this.suit;
	}

	public int getValue(Rank thisRank) {
		Rank newRank = thisRank; 
		thisRank.getCardValue; 
	}

	public String toString() {
		return "The " + rank + " of " + suit; 
	}
}

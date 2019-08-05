
public enum Rank {

	ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10); 
	
	private int cardValue; 
	
	public int getCardValue(Card thisCard) {
		return this.cardValue; 	 
	}
	
	private Rank(int cardValue) {
		this.cardValue = cardValue; 
	}
//	public static int getCardValue() {
//		Rank thisRank;
//		thisRank = Card.getRank();
//		switch(thisRank) {
//		case ACE:
//			cardValue= 1;
//		case TWO:
//			cardValue= 2;
//		case THREE:
//			cardValue= 3;
//		case FOUR:
//			cardValue= 4;
//		case FIVE:
//			cardValue= 5;
//		case SIX:
//			cardValue= 6;
//		case SEVEN:
//			cardValue= 7;
//		case EIGHT:
//			cardValue= 8;
//		case NINE:
//			cardValue= 9;
//		case TEN:
//		case JACK:
//		case QUEEN:
//		case KING:
//			cardValue= 10; 
//		}
//		return cardValue;
//	}
	

	public static int aceCardValue() {
		// if player total with ace as 1 is above 21, player loses
		// if player total with ace as 1 is below 21, try making ace 10
		// if player total with ace as 10 is above 21, make ace 1
		// if player total with ace as 10 is below 21, keep ace as 10
		
	}
	
}


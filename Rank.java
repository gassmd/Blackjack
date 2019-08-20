import java.util.*;
public enum Rank {

	ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10); 
	
	private int cardValue; 
	private static Map map = new HashMap<>();
		
	private Rank(int cardValue) {
		this.setCardValue(cardValue); 
	}
	
	static {
		for (Rank rank : Rank.values()) {
			map.put(rank.getCardValue(), rank); 
		}
	}
	
	public static Rank valueOf(int rank) {
		return (Rank) map.get(rank); 
	}
	
	public int getValue() {
		return getCardValue();
	}

	public static int aceCardValue() {
		// if player total with ace as 1 is above 21, player loses
		// if player total with ace as 1 is below 21, try making ace 10
		// if player total with ace as 10 is above 21, make ace 1
		// if player total with ace as 10 is below 21, keep ace as 10
		
	}

	public int getCardValue() {
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}
	
}


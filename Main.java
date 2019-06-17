import java.util.*; 
public class Main {

	public static void main(String[] args) {
//		Blackjack.blackjack();
//		System.out.println("");
//		Deck.printDeck(Blackjack.thisDeck);
//		System.out.println("");
		int testValue = Rank.THREE.getCardValue() + Rank.FOUR.getCardValue(); 
		int testValueTwo = Rank.FIVE.getCardValue() + Rank.QUEEN.getCardValue(); 
		for (Rank rank : Rank.values()) {
			System.out.println(rank);
			System.out.println(rank.getCardValue()); 
		}
		System.out.println(""); 
		System.out.println(testValue); 
		System.out.println(testValueTwo); 
	}
}
	

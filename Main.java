import java.util.*; 
public class Main {

	public static void main(String[] args) {

		Blackjack.blackjack();
		Deck.printDeck(Blackjack.thisDeck);
		System.out.println("Player total:");
		
		System.out.println(Blackjack.thisBlackjackHand.get(0));
		System.out.println(Blackjack.thisBlackjackHand.get(1));
	}
}
	

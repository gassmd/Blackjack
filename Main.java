import java.util.*; 
public class Main {

	public static void main(String[] args) {

		Blackjack.blackjack();
		Deck.printDeck(Blackjack.thisDeck);
		System.out.println("Player total:");
		
		System.out.println(Blackjack.thisBlackjackHand.get(0));
		System.out.println(Blackjack.thisBlackjackHand.get(1));
		System.out.println(Blackjack.thisDeck.get(0)); 
		System.out.println(Rank.EIGHT);
		Rank testRank = Rank.THREE; 
		System.out.println(testRank);
		System.out.println(Rank.EIGHT.getCardValue());
		System.out.println(testRank.getCardValue());
		System.out.println(Rank.EIGHT.getCardValue() + testRank.getCardValue());
		System.out.println("");
		System.out.println(Blackjack.thisBlackjackHand.get(0).getRank().getCardValue());
		System.out.println(Blackjack.thisBlackjackHand.get(1).getRank().getCardValue());
		System.out.println(Blackjack.thisBlackjackHand.get(0).getSuit());
		System.out.println("");
		System.out.println(Blackjack.thisBlackjackHand.get(0).getRank().getCardValue() + Blackjack.thisBlackjackHand.get(1).getRank().getCardValue());
		}
	}

	

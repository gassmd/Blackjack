import java.util.*;

public class Blackjack {
	static ArrayList<Card> thisBlackjackHand = new ArrayList<Card>();
	static ArrayList<Card> thisDeck = new ArrayList<Card>();
	static int numOfDecks = 1;

	public static void blackjack() {
		newGame();
		currentHandPrint();
	}

	public static void newGame() {		// starts new game, builds deck, adds two cards to player hand
		System.out.println("Welcome to Blackjack!" + "\n" + "----------------------");
		Deck.buildDeck(thisDeck, numOfDecks, true);
		thisBlackjackHand.add(Deck.drawCard(thisDeck));
		thisBlackjackHand.add(Deck.drawCard(thisDeck));
		//Dealer.dealerTotalTest(); 		// temp method to give dealer total with random number 
	}

	public static void hitOrStay() {
		Scanner s = new Scanner(System.in);
		System.out.println("HIT? y/n");
		String ans = s.nextLine(); 
		if (ans.equals("y") || ans.equals("Y")) {
			thisBlackjackHand.add(Deck.drawCard(thisDeck));
			currentHandPrint();
			Player.handContainsAce();
		} else if (ans.equals("n") || ans.equals("N")) {
			System.out.println("You choose to stay");
			currentHandPrint();
			Player.handContainsAce();

		}
		
	}
	
	public static void currentHandPrint() {		// prints current hand
		System.out.println("CURRENT PLAYER HAND: " + "\n");
		Player.printHand(thisBlackjackHand);
	}

	public static int getCurrentHandTotal() {		// gets total of all cards in hand
		int handValue = 0;
		for (int i = 0; i < thisBlackjackHand.size(); i++) {
			handValue += thisBlackjackHand.get(i).getRank().getCardValue();
		}
		return handValue;
	}

	public static ArrayList<Card> getPlayerHand() {
		return thisBlackjackHand;
	}

	public static boolean loseCheck() {
		if (getCurrentHandTotal() < 21) {
			return true;
		}
		if (getCurrentHandTotal() > 21) {
			return false;
		} else {
			return true;
		}
	}
}

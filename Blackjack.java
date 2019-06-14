import java.util.*;

public class Blackjack{
	static ArrayList<Card> thisBlackjackHand = new ArrayList<Card>(); 
	static ArrayList<Card> thisDeck = new ArrayList<Card>(); 
	static int numOfDecks = 1; 
	
	
	public static void blackjack() {
		gameStart(); 
		currentHandPrint();
		thisBlackjackHand.add(Deck.drawCard(thisDeck));
		currentHandPrint();

		}
		
	
	public static void gameStart() {
		Deck.buildDeck(thisDeck, numOfDecks, true);
		System.out.println("Welcome to Blackjack!");
		thisBlackjackHand.add(Deck.drawCard(thisDeck));
		thisBlackjackHand.add(Deck.drawCard(thisDeck));
	}
	
	public static boolean hitOrStay() {
		Scanner s = new Scanner(System.in); 
		System.out.println("HIT? Y/N");
		if (s.nextLine() == "Y") {
			thisBlackjackHand.add(Deck.drawCard(thisDeck));
			currentHandPrint(); 
			return true;
		}
		else {
			return false; 
		}
	}
	public static void currentHandPrint() {
		System.out.println("CURRENT PLAYER HAND: ");
		Player.printHand(thisBlackjackHand);
	}
	}


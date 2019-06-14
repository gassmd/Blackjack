import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void test() {

	System.out.println("Number of Decks?");
	Scanner s = new Scanner(System.in);
	int numOfDecks = s.nextInt(); 
	ArrayList<Card> thisDeck = new ArrayList<Card>(); 		// new deck
	ArrayList<Card> thisPlayerHand = new ArrayList<Card>();		// new player hand
	ArrayList<Card> thisOpponentHand = new ArrayList<Card>(); // new opponent hand
	Deck.buildDeck(thisDeck, numOfDecks, true);					// builds and returns deck
	Deck.printDeck(thisDeck);							// prints deck as string
	for(int i = 0; i<5; i++) {
		System.out.println("");
		System.out.println("DRAW NEW CARD");
		thisPlayerHand.add(Deck.drawCard(thisDeck));				// removes and returns "top" card, adds to player hand 
		System.out.println("");
		System.out.println("Current Player Hand: ");
		Player.printHand(thisPlayerHand); 
		System.out.println(""); 
		System.out.println("Current Deck: ");
		Deck.printDeck(thisDeck);
		System.out.println("");
		System.out.println("OPPONENT DRAW NEW CARD");
		thisOpponentHand.add(Deck.drawCard(thisDeck));				// removes and returns "top" card, adds to player hand 
		System.out.println("");
		System.out.println("Current Opponent Hand: ");
		Player.printHand(thisOpponentHand); 
		System.out.println(""); 
		System.out.println("Current Deck: ");
		Deck.printDeck(thisDeck);
		}
	System.out.println("Final Player Hand:");
	Player.printHand(thisPlayerHand); 
	System.out.println("Final Opponent Hand: ");
	Player.printHand(thisOpponentHand);
	}
}

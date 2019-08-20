import java.util.*;
public class Deck {

	public static ArrayList<Card> buildDeck(ArrayList<Card> newDeck, int numOfDecks, boolean shuffle){		// method to build deck

		for (int d = 0; d<numOfDecks; d++) {											// for number of decks
			for (Suit s: Suit.values()) {
				for (Rank r: Rank.values()) {
					newDeck.add(new Card(s, r)); 
				}
			}
		}

		if (shuffle) {
			Collections.shuffle(newDeck);
		}
		return newDeck; 																	// returns completed deck 
	}

	public static ArrayList<Card> getDeck(ArrayList<Card> deck){
		return deck; 
	}


	public static void printDeck(ArrayList<Card> deck) {
		int testVariable = 1; 
		for (Card cards:deck) {									
			System.out.println(cards.toString() + "    " + testVariable); 
			testVariable++; 
		}
	}

	public static Card drawCard(ArrayList<Card> deck) {
		return deck.remove(0);

	}
}



import java.util.*;
public class Deck {

	static Suit [] suits = {Suit.HEARTS, Suit.SPADES, Suit.DIAMONDS, Suit.CLUBS}; // do these need to be static??
	static Rank [] ranks = {Rank.ACE, Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING};
	
	public static ArrayList<Card> buildDeck(ArrayList<Card> newDeck, int numOfDecks, boolean shuffle){		// method to build deck
																						
		for (int d = 0; d<numOfDecks; d++) {											// for number of decks
			for (int i = 0; i<4; i++) {													// for each suit
				for(int j = 0; j < 13; j++) {											// for each rank
					newDeck.add(new Card(suits[i],ranks[j]));								// add to deck
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
		for (Card cards:deck) {									// print deck
			System.out.println(cards.toString() + "    " + testVariable); 
			testVariable++; 
		}
	}

	public static Card drawCard(ArrayList<Card> deck) {
		return deck.remove(0);
		
	}
}

	

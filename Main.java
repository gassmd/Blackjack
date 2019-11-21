import java.util.*; 
public class Main {

	public static void main(String[] args) {

		Blackjack.blackjack();
		//Deck.printDeck(Blackjack.thisDeck);
	//	Player.handContainsAce();  
		Player.printPlayerHandTotal();
		System.out.println("Top Card (test):");
		System.out.println(Blackjack.thisDeck.get(0)); 
		System.out.println("");
		while(Blackjack.loseCheck()) {
			Blackjack.hitOrStay();
			System.out.println(Blackjack.getCurrentHandTotal());
			if (Blackjack.getCurrentHandTotal()==21) {
				System.out.println("GOAT"); 
			}
			if (Blackjack.loseCheck()==false) {
				System.out.println("You bust!");
			}
		}



	}
}



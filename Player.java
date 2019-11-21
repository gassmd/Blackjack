import java.util.ArrayList;

public class Player {

	private static ArrayList<Card> playerHand = new ArrayList<Card>(); 


	public ArrayList<Card> getHand(){			// returns player hand as ArrayList of Card object
		return playerHand; 
	}
	public static void printHand(ArrayList<Card> playerHand) {			// prints current hand as string (gui?)
		for (Card cards:playerHand) {
			System.out.println(cards.toString());
		}
	}
	public static int getPlayerHandTotal(ArrayList<Card> playerHand) {			// returns current total of player hand as int 
		int total = 0;
		for (Card cards:playerHand) {
			total += cards.getValue(cards.getRank());
		}
		return total;
	}		
	public static void printPlayerHandTotal() {				// prints total of current hand as string 
	System.out.println("Player total:" + "\n" + Blackjack.getCurrentHandTotal() + "\n" + "----------------------");
	}
	public static boolean handContainsAce(ArrayList<Card> playerHand) {
		if (playerHand.contains(Card.getRank())){
			System.out.println("Contains ace");
			return true; 
		}
		if (Player.playerHand.contains(Rank.TWO)||Player.playerHand.contains(Rank.THREE)||Player.playerHand.contains(Rank.FOUR)||Player.playerHand.contains(Rank.FIVE)) {
			System.out.println("TEST CORRECT CONTAINS 2-5");
			return true; 
		}
		else if (!Player.playerHand.contains(Rank.ACE)) {
			System.out.println("No ace");
			return false; 
		}
		else {
			System.out.println("error"); 
			return false; 
		}
	}
}


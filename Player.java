import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> playerHand = new ArrayList<Card>(); 
	
	
	
	public ArrayList<Card> getHand(){
		return playerHand; 
	}
	public static void printHand(ArrayList<Card> playerHand) {
		for (Card cards:playerHand) {
			System.out.println(cards.toString());
		}
	}
}

import java.util.Random; 
public class Dealer {
	
	
	
	Random random = new Random(); 
	private int dealerTotal = random.nextInt(24) + 2; 
	
	
	
	public static int getDealerTotal(int dealerTotal) {
		return dealerTotal; 
	}
	
	public static void printDealerTotal() {
		System.out.println(dealerTotal); 
	}
}

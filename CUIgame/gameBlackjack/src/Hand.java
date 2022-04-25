import java.util.ArrayList;
import java.util.List;

public class Hand {

	List<Card> hand = new ArrayList<>();

	void drawCard(Deck d) {
		hand.add(d.getTop());
	}
	
	void clear() {
		hand.clear();
	}
}

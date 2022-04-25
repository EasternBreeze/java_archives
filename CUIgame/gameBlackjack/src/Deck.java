import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> deck = new ArrayList<>();

	Deck() {
		for (Suit s : Suit.values()) {
			for (int i = 1; i <= 13; i++) {
				this.deck.add(new Card(s, i));
			}
		}
	}

	void deckShuffle() {
		Collections.shuffle(this.deck);
	}

	Card getTop() {
		return this.deck.remove(0);
	}

	@Override
	public String toString() {
		String str = "";
		for (Card c : deck) {
			str += "[" + c + "]";
		}
		return str;
	}
}

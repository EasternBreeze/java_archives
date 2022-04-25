package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import poker.Poker.Suit;

public final class Deck implements Iterable<Card> {

	private static final Deck instance = new Deck();

	private final List<Card> list = new ArrayList<>();

	public static Deck getInstance() {
		return instance;
	}

	private Deck() {
		init();
	}

	Card getCard() {
		if (list.size() <= 0) {
			init();
		}
		return list.remove(0);
	}

	@Override
	public String toString() {
		return list.toString();
	}

	@Override
	public Iterator<Card> iterator() {
		return list.iterator();
	}

	private void init() {
		for (Suit s : Suit.values()) {
			for (int i = 1; i <= 13; i++) {
				list.add(Card.create(s, i));
			}
		}
		Collections.shuffle(list);
	}

}

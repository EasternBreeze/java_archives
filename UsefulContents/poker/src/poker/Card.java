package poker;

import poker.Poker.Suit;

public final class Card {

	private static final String[] table = //
			{ "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	private final Suit suit;
	private final int rank;

	private Card(Suit suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public static Card create(Suit suit, int rank) {
		if (suit == null || rank < 1 || rank > 13) {
			throw new IllegalArgumentException();
		}
		return new Card(suit, rank);
	}

	public Suit getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return "[" + suit + table[rank - 1] + "]";
	}
}

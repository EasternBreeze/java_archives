package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import poker.Poker.Hand;
import poker.Poker.Suit;

public final class PlayersHands {

	private static final int limit = 5;

	private final List<Card> list = new ArrayList<>();

	public void clear() {
		list.clear();
	}

	public Hand full(Deck deck) {
		clear();
		while (list.size() < limit) {
			list.add(deck.getCard());
		}

		return judge();
	}

	public Hand add(Card card) {
		if (card == null || list.size() >= limit) {
			return null;
		}
		list.add(card);

		return judge();
	}

	private Hand judge() {
		if (list.size() != limit) {
			return null;
		}

		sort();

		Set<Integer> ranks = new HashSet<>();
		Set<Suit> suits = new HashSet<>();

		list.forEach(c -> {
			ranks.add(c.getRank());
			suits.add(c.getSuit());
		});

		// フラッシュ判定
		boolean isFlush = suits.size() == 1;
		// ストレート判定
		boolean isStraight = ranks.size() == 5 && (list.get(limit - 1).getRank() - list.get(0).getRank() == 4 || //
				list.get(0).getRank() == 1 && list.get(1).getRank() == 10);

		if (ranks.size() == 1) {
			return Hand.FIVE_OF_A_KIND;
		} else if (isFlush && isStraight && //
				list.get(0).getRank() == 1 && list.get(1).getRank() == 10) {
			return Hand.ROYAL_FLUSH;
		} else if (isFlush && isStraight) {
			return Hand.STRAIGHT_FLUSH;
		} else if (ranks.size() == 2 && list.get(1).getRank() == list.get(3).getRank()) {
			return Hand.FOUR_OF_A_KIND;
		} else if (ranks.size() == 2) {
			return Hand.FULL_HOUSE;
		} else if (isFlush) {
			return Hand.FLUSH;
		} else if (isStraight) {
			return Hand.STRAIGHT;
		} else if (ranks.size() == 3 && (list.get(0).getRank() == list.get(2).getRank() || //
				list.get(1).getRank() == list.get(3).getRank() || //
				list.get(2).getRank() == list.get(4).getRank())) {
			return Hand.THREE_OF_A_KIND;
		} else if (ranks.size() == 3) {
			return Hand.TWO_PAIRS;
		} else if (ranks.size() == 4) {
			return Hand.ONE_PAIR;
		}

		return Hand.HIGH_CARD;
	}

	@Override
	public String toString() {
		return list.toString();
	}

	private void sort() {
		Collections.sort(list, (c1, c2) -> {
			if (c1.getRank() == c2.getRank()) {
				return Integer.compare(c1.getSuit().getValue(), c2.getSuit().getValue());
			}
			return Integer.compare(c1.getRank(), c2.getRank());
		});
	}
}

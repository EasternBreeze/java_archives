package test;

import poker.Deck;
import poker.PlayersHands;
import poker.Poker.Hand;

public final class Main {

	public static void main(String[] args) {
		final Deck deck = Deck.getInstance();

		int[] counts = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		final int tryCount = 1000000;

		for (int i = 0; i < tryCount; i++) {
			counts[new PlayersHands().full(deck).getValue()]++;
		}

		for (Hand h : Hand.values()) {
			System.out.printf("%6d回 %7.4f%% (%s)\n", //
					counts[h.getValue()], 100.0 * counts[h.getValue()] / tryCount, h);
		}
	}

}

package system;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {

	public enum Card {
		G("G", 0, "\u270A"), //
		C("C", 1, "\u270C"), //
		P("P", 2, "\u270B"); //

		private final String hand;
		private final int value;
		private final String uni;

		private Card(String hand, int value, String uni) {
			this.hand = hand;
			this.value = value;
			this.uni = uni;
		}

		public String getHand() {
			return hand;
		}

		public int getValue() {
			return value;
		}

		@Override
		public String toString() {
			return uni;
		}
	}

	private final String name;
	private int point;
	private final List<Card> stock = new ArrayList<>();
	private final List<Card> history = new ArrayList<>();

	public Player(String name) {
		if (name == null) {
			throw new IllegalArgumentException();
		}
		this.name = name;
	}

	protected abstract Card inputCard(Info my, Info enemy);

	final void init() {
		point = 0;
		stock.clear();
		for (Card c : Card.values()) {
			for (int i = 0; i < 3; i++) {
				stock.add(c);
			}
		}
		history.clear();
	}

	public final String getName() {
		return name;
	}

	public final int getPoint() {
		return point;
	}

	public final Info getInfo() {
		return new Info();
	}

	protected final Card choose(Info my, Info enemy) {
		while (true) {
			Card c = inputCard(my, enemy);
			if (c != Card.G && c != Card.C && c != Card.P) {
				System.out.println(c + " Enter a card from G, C, P.");
				continue;
			}

			if (stock.remove(c)) {
				history.add(c);
				return c;
			}
			System.out.println("[" + c + "] is already used.");
		}
	}

	final void addPoint() {
		point++;
	}

	final void addPoint(int add) {
		point += add;
	}

	@Override
	public final String toString() {
		int[] counts = { 0, 0, 0 };
		for (Card c : stock) {
			counts[c.getValue()]++;
		}

		String s = "";
		for (Card c : Card.values()) {
			s += "[ ";
			for (int i = 1; i <= 3; i++) {
				s += counts[c.getValue()] >= i ? c + " " : "- ";
			}
			s += "]";
		}

		return s + " " + point + "pt";
	}

	public class Info {
		public final List<Card> stock = new ArrayList<>(Player.this.stock);
		public final List<Card> history = new ArrayList<>(Player.this.history);
		public final Card last;

		private Info() {
			if (history.size() == 0) {
				last = null;
			} else {
				last = history.get(history.size() - 1);
			}
		}
	}
}

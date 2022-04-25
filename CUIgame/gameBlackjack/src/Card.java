
public final class Card {

	private static final String[] table = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	//
	final private Suit suit;
	final private int number;

	Card(Suit suit, int number) {
		this.suit = suit;
		this.number = number;
	}

	int getNum() {
		return this.number;
	}

	@Override
	public String toString() {
		return "[" + suit + "" + table[number - 1] + "]";
	}
}

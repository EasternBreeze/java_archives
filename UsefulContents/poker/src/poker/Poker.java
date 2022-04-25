package poker;

public final class Poker {

	private Poker() {
	}

	/** ********** ********** **********
	 *	Suit列挙型
	 ** ********** ********** **********/
	public enum Suit {
		SPADE("♠", 0), HEART("♥", 1), DIAMOND("♦", 2), CLUB("♣", 3);

		private final String suit;
		private final int value;

		Suit(String suit, int value) {
			this.suit = suit;
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		@Override
		public String toString() {
			return suit;
		}
	}

	/** ********** ********** **********
	 *	Hand列挙型
	 ** ********** ********** **********/
	public enum Hand {
		FIVE_OF_A_KIND("ファイブ・カード", 0), //
		ROYAL_FLUSH("ロイヤル・フラッシュ", 1), //
		STRAIGHT_FLUSH("ストレート・フラッシュ", 2), //
		FOUR_OF_A_KIND("フォー・カード", 3), //
		FULL_HOUSE("フルハウス", 4), //
		FLUSH("フラッシュ", 5), //
		STRAIGHT("ストレート", 6), //
		THREE_OF_A_KIND("スリー・カード", 7), //
		TWO_PAIRS("ツー・ペア", 8), //
		ONE_PAIR("ワン・ペア", 9), //
		HIGH_CARD("ハイカード", 10);

		private final String name;
		private final int value;

		Hand(String name, int value) {
			this.name = name;
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		@Override
		public String toString() {
			return name;
		}
	}

}

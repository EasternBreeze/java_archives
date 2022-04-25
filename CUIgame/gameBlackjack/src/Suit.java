
public enum Suit {
	S("♠"), //
	H("♥"), //
	D("♦"), //
	C("♣"), //
	;

	private final String mark;

	Suit(String mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return mark;
	}
}

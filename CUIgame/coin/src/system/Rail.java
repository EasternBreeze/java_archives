package system;

final class Rail {

	private final int length;

	private final Coin left;
	private final Coin right;

	enum Side {
		LEFT, RIGHT;
	}

	Rail(int length) {
		this.length = length;
		left = new Coin(1);
		right = new Coin(length);
	}

	boolean moveCoin(Side side, int direction) {
		if (side == null || direction == 0) {
			return false;
		}

		if (side == Side.LEFT) {
			int pos = left.getPosition() + direction;
			if (pos > 0 && pos < right.getPosition()) {
				left.move(direction);
				return true;
			}
		} else {
			direction = -direction;
			int pos = right.getPosition() + direction;
			if (pos > 0 && pos > left.getPosition()) {
				right.move(direction);
				return true;
			}
		}
		return false;
	}

	boolean canMoveAt(Side side) {
		if (side == null) {
			throw new IllegalArgumentException();
		}

		if (side == Side.LEFT && left.getPosition() - 1 <= 0 && left.getPosition() + 1 >= right.getPosition()) {
			return false;
		}
		if (side == Side.RIGHT && right.getPosition() - 1 <= left.getPosition() && left.getPosition() + 1 >= length) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 1; i <= length; i++) {
			if (i == left.getPosition()) {
				s += "●";
			} else if (i == right.getPosition()) {
				s += "○";
			} else {
				s += "｜";
			}
			s += " ";
		}
		return s;
	}
}

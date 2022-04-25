package system;

final class Coin {
	private int position;

	Coin(int position) {
		this.position = position;
	}

	int getPosition() {
		return position;
	}

	void move(int direction) {
		position += direction;
	}
}

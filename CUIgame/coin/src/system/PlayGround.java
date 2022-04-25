package system;

import system.Rail.Side;

public final class PlayGround {

	enum Line {
		UPPER, LOWER;

		private Rail rail;
	}

	private Player p1 = new Player();
	private Player p2 = new Player();

	public PlayGround(int upperLength, int lowerLength) {
		Line.UPPER.rail = new Rail(upperLength);
		Line.LOWER.rail = new Rail(lowerLength);
	}

	public void gamestart() {
		while (true) {
			System.out.println(this);
			if (!Line.UPPER.rail.canMoveAt(Side.LEFT) && !Line.LOWER.rail.canMoveAt(Side.LEFT)) {
				System.out.println("P2 Win!!");
				return;
			}
			while (!p1.selectLine().rail.moveCoin(Side.LEFT, p1.inputDirection())) {
				System.out.println("Retry");
			}

			System.out.println(this);
			if (!Line.UPPER.rail.canMoveAt(Side.RIGHT) && !Line.LOWER.rail.canMoveAt(Side.RIGHT)) {
				System.out.println("P1 Win!!");
				return;
			}
			while (!p2.selectLine().rail.moveCoin(Side.RIGHT, p2.inputDirection())) {
				System.out.println("Retry");
			}
		}

	}

	@Override
	public String toString() {
		return Line.UPPER.rail + "\n" + Line.LOWER.rail;
	}
}

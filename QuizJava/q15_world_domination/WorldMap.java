package q15_world_domination;

final class WorldMap {

	enum Dirction {
		N(-1, 0), S(1, 0), W(0, -1), E(0, 1);

		final int dRow;
		final int dCol;

		Dirction(int dRow, int dCol) {
			this.dRow = dRow;
			this.dCol = dCol;
		}
	}

	private final Country[][] world;

	private int year;

	WorldMap(int rows, int cols, int[] powers) {
		world = new Country[rows][cols];

		int index = 0;
		for (int i = 0; i < world.length; i++) {
			for (int j = 0; j < world[0].length; j++) {
				world[i][j] = new Country((char) (65 + index) + "国", powers[index]);
				index++;
			}
		}
	}

	void timelapse() {
		while (!isDomination()) {
			war();
			year++;
			System.out.println(this);
		}
	}

	private void war() {
		for (int i = 0; i < world.length; i++) {
			for (int j = 0; j < world[0].length; j++) {
				if (world[i][j].isDefeat()) {
					continue;
				}

				if (isChainA(i, j)) {
					world[i][j].damage();
				}
			}
		}

		for (Country[] rows : world) {
			for (Country c : rows) {
				c.update();
			}
		}
	}

	private boolean isChainA(int row, int col) {
		for (Dirction dir : Dirction.values()) {
			int chainRow = row + dir.dRow;
			int chainCol = col + dir.dCol;

			if (chainRow < 0 || chainRow >= world.length) {
				continue;
			}
			if (chainCol < 0 || chainCol >= world[0].length) {
				continue;
			}

			if (world[chainRow][chainCol].isDefeat()) {
				return true;
			}
		}
		return false;
	}

	private boolean isDomination() {
		for (Country[] rows : world) {
			for (Country c : rows) {
				if (!c.isDefeat()) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("%2d年目\n", year));
		for (Country[] rows : world) {
			for (Country c : rows) {
				sb.append(c);
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}

package q19_slash_maze;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

final class TileMap {

	private static final Random rand = new Random();

	private int pattern;
	private final Road[][] tiles;
	private boolean canGoal;

	TileMap(boolean makeCanGoalTiles) {
		Road[][] r = createTiles();
		searchGoal(r, 0, 0, new ArrayList<Integer>(0));

		if (makeCanGoalTiles) {
			while (!canGoal) {
				r = createTiles();
				searchGoal(r, 0, 0, new ArrayList<Integer>(0));
			}
		}

		tiles = r;
	}

	// 0 - 8388607
	TileMap(int pattern) {
		this.pattern = pattern;

		Road[][] r = createTiles(pattern);
		searchGoal(r, 0, 0, new ArrayList<Integer>(0));

		tiles = r;
	}

	private Road[][] createTiles() {
		Road[][] r = new Road[5][5];

		r[0][0] = Road.L;
		for (int i = 1; i <= 23; i++) {
			r[i / 5][i % 5] = rand.nextBoolean() ? Road.L : Road.R;
		}
		r[4][4] = Road.L;

		return r;
	}

	private Road[][] createTiles(int pattern) {
		Road[][] r = new Road[5][5];
		int n = pattern;

		r[0][0] = Road.L;
		for (int i = 1; i <= 23; i++) {
			r[i / 5][i % 5] = n % 2 == 0 ? Road.L : Road.R;
			n /= 2;
		}
		r[4][4] = Road.L;

		return r;
	}

	private void searchGoal(Road[][] r, int row, int col, List<Integer> history) {
		if (canGoal) {
			return;
		}
		if (row == 4 && col == 4) {
			canGoal = true;
			return;
		}
		if (history.size() >= 25) {
			return;
		}

		for (Move m : r[row][col].canMoveDir) {
			int targetRow = row + m.dy;
			int targetCol = col + m.dx;
			if (canPass(r, targetRow, targetCol, r[row][col], m.isMoveSlant, history)) {
				List<Integer> next = new ArrayList<>(history);
				next.add(targetRow * 10 + targetCol);
				searchGoal(r, targetRow, targetCol, next);
			}
		}
	}

	private boolean canPass(Road[][] r, int targetRow, int targetCol, Road from, boolean isMoveSlant,
			List<Integer> history) {
		if (targetRow < 0 || targetRow > 4 || targetCol < 0 || targetCol > 4) {
			return false;
		}
		if (history.contains(Integer.valueOf(targetRow * 10 + targetCol))) {
			return false;
		}

		if (isMoveSlant) {
			return from.equals(r[targetRow][targetCol]);
		}
		return !from.equals(r[targetRow][targetCol]);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Road[] row : tiles) {
			for (Road r : row) {
				sb.append(r);
			}
			sb.append("\n");
		}
		sb.append(canGoal ? "ゴール可能" : "ゴール不可");
		return sb.toString();
	}

	boolean canGoal() {
		return canGoal;
	}
}

package q09_pillar_maze;

import java.util.Random;

enum Dirction {
	N(-1, 0), S(1, 0), W(0, -1), E(0, 1);

	final int dRow;
	final int dCol;

	private static final Random rand = new Random();
	private static final Dirction[] first = { N, S, W, E };
	private static final Dirction[] other = { S, W, E };

	Dirction(int dRow, int dCol) {
		this.dRow = dRow;
		this.dCol = dCol;
	}

	static Dirction random(int row) {
		if (row == 2) {
			return first[rand.nextInt(first.length)];
		}
		return other[rand.nextInt(other.length)];
	}
}

final class Maze {

	private final boolean[][] field;

	Maze(int rowPillars, int colPillars) {
		field = new boolean[rowPillars * 2 + 3][colPillars * 2 + 3];
		for (int i = 0; i < field.length; i++) { // 左右の壁作るよ！
			field[i][0] = true;
			field[i][field[i].length - 1] = true;
		}
		for (int i = 1; i < field[0].length - 1; i++) { // 上下の壁作るよ！
			field[0][i] = i != 1; // スタートとゴールには作らないよ！
			field[field.length - 1][i] = i != field[0].length - 2;
		}

		for (int i = 2; i < field.length - 1; i += 2) { // 柱建てるよ！
			for (int j = 2; j < field[i].length - 1; j += 2) {
				field[i][j] = true; // ここに建てるよ！

				while (true) { // 倒せるまで繰り返すよ！
					Dirction dir = Dirction.random(i);
					int targetRow = i + dir.dRow;
					int targetCol = j + dir.dCol;
					if (!field[targetRow][targetCol]) {
						field[targetRow][targetCol] = true;
						break;
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (boolean[] rows : field) {
			for (boolean b : rows) {
				sb.append(b ? "■" : "　");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}

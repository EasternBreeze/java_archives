package q03_spiral;

public final class Spiral {

	enum Dirction {
		N(-1, 0), E(0, 1), S(1, 0), W(0, -1);

		final int dRow;
		final int dCol;

		Dirction(int dRow, int dCol) {
			this.dRow = dRow;
			this.dCol = dCol;
		}

		Dirction next() {
			switch (this) {
			case N:
				return Dirction.W;
			case W:
				return Dirction.S;
			case S:
				return Dirction.E;
			case E:
				return Dirction.N;
			}
			return null;
		}
	}

	public static void main(String[] args) {
		draw(9);
	}

	private static void draw(int size) {
		int[][] field = new int[size][size];
		int number = size * size;

		Dirction dir = Dirction.W;
		int row = 0;
		int col = size - 1;

		while (number > 0) {
			field[row][col] = number;
			number--;

//			if (number <= 0) {
//				break;
//			}

			if (row + dir.dRow < 0 || row + dir.dRow >= size ||
					col + dir.dCol < 0 || col + dir.dCol >= size) {
				dir = dir.next();
			} else if (field[row + dir.dRow][col + dir.dCol] != 0) {
				dir = dir.next();
			}
			row += dir.dRow;
			col += dir.dCol;
		}

		StringBuilder sb = new StringBuilder();
		for (int[] rows : field) {
			for (int n : rows) {
				sb.append(String.format("%3d", n));
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}

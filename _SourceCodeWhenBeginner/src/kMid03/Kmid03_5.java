package kMid03;

public class Kmid03_5 {

	public static void main(String[] args) {
		// 数字が入ってないマスには 0 を入れておく
		int[][] field = {
				{ 1, 3, 7, 0, 2, 9, 8, 4, 6 },
				{ 6, 2, 0, 8, 1, 3, 5, 0, 9 },
				{ 0, 8, 5, 0, 6, 4, 1, 3, 0 },
				{ 8, 7, 0, 1, 4, 0, 0, 9, 5 },
				{ 5, 4, 6, 2, 0, 0, 7, 1, 3 },
				{ 0, 1, 9, 3, 0, 5, 6, 8, 4 },
				{ 4, 5, 1, 6, 3, 7, 9, 2, 0 },
				{ 3, 0, 2, 9, 8, 1, 4, 5, 0 },
				{ 7, 9, 8, 0, 5, 2, 3, 6, 1 },
		};

		// 可能な限り数字を埋める
		while (fill(field, true) + fill(field, false) > 0) {
		}

		// 表を表示する
		for (int[] row : field) {
			for (int col : row) {
				if (col == 0) {
					System.out.print("_ ");
				} else {
					System.out.print(col + " ");
				}
			}
			System.out.println();
		}
	}

	static int fill(int[][] field, boolean isRow) {
		int fillCount = 0; // 埋めることのできたマスの数
		int size = isRow ? field.length : field[0].length;
		for (int i = 0; i < size; i++) {
			if (isRow) {
				fillCount += fillRow(field, i);
			} else {
				fillCount += fillCol(field, i);
			}
		}
		return fillCount;
	}

	// 指定の行について埋められるマスがあれば埋める。
	// 埋めることのできたマスの個数を返す。
	private static int fillRow(int[][] field, int n) {
		int countZero = 0;
		int pos = 0;
		for (int i = 0; i < field[n].length; i++) {
			if (field[n][i] == 0) {
				pos = i;
				countZero++;
			}
		}
		if (countZero != 1) {
			return 0;
		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j < field[n].length; j++) {
				if (field[n][j] == i) {
					break;
				} else if (j == field[n].length - 1) {
					field[n][pos] = i;
					return 1;
				}
			}
		}
		return 0;
	}

	// 指定の列について埋められるマスがあれば埋める。
	// 埋めることのできたマスの個数を返す。
	private static int fillCol(int[][] field, int n) {
		int countZero = 0;
		int pos = 0;
		for (int i = 0; i < field.length; i++) {
			if (field[i][n] == 0) {
				pos = i;
				countZero++;
			}
		}
		if (countZero != 1) {
			return 0;
		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j < field.length; j++) {
				if (field[j][n] == i) {
					break;
				} else if (j == field.length - 1) {
					field[pos][n] = i;
					return 1;
				}
			}
		}
		return 0;
	}

}

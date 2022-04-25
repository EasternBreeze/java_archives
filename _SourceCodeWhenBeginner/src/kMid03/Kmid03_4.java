package kMid03;

public class Kmid03_4 {

	public static void main(String[] args) {
		// 数字が入ってないマスには 0 を入れておく
		int[][] field = {
				{ 1, 0, 0, 5, 2, 9, 8, 4, 6 },
				{ 6, 0, 4, 8, 0, 3, 5, 0, 9 },
				{ 9, 8, 5, 0, 6, 4, 1, 3, 2 },
				{ 0, 7, 0, 1, 4, 6, 2, 9, 5 },
				{ 5, 4, 6, 2, 9, 8, 0, 1, 3 },
				{ 2, 1, 9, 3, 7, 5, 6, 8, 4 },
				{ 4, 5, 1, 6, 0, 7, 9, 2, 8 },
				{ 3, 6, 2, 9, 8, 1, 4, 5, 7 },
				{ 7, 9, 0, 4, 5, 2, 3, 6, 0 },
		};

		// 可能な限り空白マスに数字を埋める
		for (int i = 0; i < field.length; i++) {
			// 空白マスが 1 個だけなら数字で埋める
			if (countZero(field, i) == 1) {
				fill(field, i);
			}
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

	private static int countZero(int[][] field, int n) {
		int count = 0;

		for (int i = 0; i < field.length; i++) {
			if (field[i][n] == 0) {
				count++;
			}
		}

		return count;
	}

	private static void fill(int[][] field, int n) {
		int pos = 0;
		for (int i = 0; i < field.length; i++) {
			if (field[i][n] == 0) {
				pos = i;
				break;
			}
		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j < field.length; j++) {
				if (field[j][n] == i) {
					break;
				} else if (j == field.length - 1) {
					field[pos][n] = i;
					return;
				}
			}
		}
	}
}

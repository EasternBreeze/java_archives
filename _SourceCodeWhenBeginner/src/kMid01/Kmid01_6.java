package kMid01;

public class Kmid01_6 {

	public static void main(String[] args) {
		int[][] field = {
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 0 },
				{ 1, 1, 0, 0, 1, 0, 0, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 1, 1, 0, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 0 },
		};

		// ラインの消滅処理を行う
		for (int i = 0; i < field.length; i++) {
			if (isFull(field, i)) {
				fall(field, i);
			}
		}

		// フィールドを表示する
		String[] table = { "＿", "■" };
		for (int[] row : field) {
			for (int col : row) {
				System.out.print(table[col]);
			}
			System.out.println();
		}
	}

	private static boolean isFull(int[][] field, int n) {
		for (int row : field[n]) {
			if (row == 0) {
				return false;
			}
		}
		return true;
	}

	private static void fall(int[][] field, int n) {
		for (int j = n; j > 0; j--) {
			for (int k = 0; k < field.length; k++) {
				field[j][k] = field[j - 1][k];
			}
		}
	}

}

package kMid03;

public class Kmid03_1 {

	public static void main(String[] args) {
		// 数字が入ってないマスには 0 を入れておく
		int[][] field = {
				{ 1, 3, 7, 0, 2, 9, 8, 4, 6 },
				{ 6, 2, 4, 8, 1, 3, 5, 0, 9 },
				{ 0, 8, 5, 7, 6, 4, 1, 3, 2 },
				{ 8, 7, 0, 1, 0, 6, 0, 9, 5 },
				{ 5, 4, 6, 2, 9, 8, 7, 1, 3 },
				{ 2, 1, 9, 3, 0, 5, 6, 8, 4 },
				{ 4, 5, 1, 6, 3, 7, 9, 0, 0 },
				{ 3, 6, 2, 9, 8, 1, 4, 5, 0 },
				{ 7, 9, 8, 0, 5, 2, 3, 6, 1 },
		};

		int result = 0; // 確定できない行の総数
		// ===== ここから
		for (int[] row : field) {
			int count = 0;
			for (int col : row) {
				if (col == 0) {
					count++;
				}
			}
			if (count > 1) {
				result++;
			}
		}

		// ===== ここまで
		System.out.println(result);
	}

}

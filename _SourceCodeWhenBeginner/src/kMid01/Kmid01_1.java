package kMid01;

public class Kmid01_1 {

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

		int count = 0; // ブロックの総数
		// =====ここから
		for (int[] column : field) {
			for (int line : column) {
				if (line == 1) {
					count++;
				}
			}
		}
		// =====ここまで
		System.out.println(count);
	}

}

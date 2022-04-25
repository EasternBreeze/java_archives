package kMid05;

public class Kmid05_1 {

	public static void main(String[] args) {
		int[][] field = {
				{ 0, 0, 0, 0, 2, 0, 0, 0 },
				{ 0, 0, 0, 0, 2, 2, 0, 0 },
				{ 0, 0, 0, 0, 2, 1, 2, 2 },
				{ 0, 0, 0, 2, 2, 2, 2, 2 },
				{ 0, 0, 2, 1, 2, 1, 2, 2 },
				{ 0, 0, 1, 2, 2, 1, 1, 0 },
				{ 0, 0, 0, 1, 2, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 1, 1, 0 },
		};

		int countBlack = 0;
		int countWhite = 0;
		// ===== ここから
		for (int[] row : field) {
			for (int n : row) {
				if (n == 1) {
					countBlack++;
				} else if (n == 2) {
					countWhite++;
				}
			}
		}
		// ===== ここまで
		System.out.println("黒のコマの数：" + countBlack);
		System.out.println("白のコマの数：" + countWhite);
	}

}

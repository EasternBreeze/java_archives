package kMid04;

public class Kmid04_1 {

	public static void main(String[] args) {
		int[][] field = new int[7][10];

		/*
		 * 1  1  1  1  1
		 * 1  2  3  4  5
		 * 1  3  6  10 15
		 * 1  4  10 20 35
		 * 1  5  15 35 70
		 */

		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[0].length; j++) {
				// =====ここから
				if (i == 0 && j == 0) {
					field[i][j] = 1;
				} else {
					field[i][j] = (i != 0 ? field[i - 1][j] : 0)
							+ (j != 0 ? field[i][j - 1] : 0);
				}
				// =====ここまで
			}
		}

		System.out.println(field[6][9] + "通り");
	}

}

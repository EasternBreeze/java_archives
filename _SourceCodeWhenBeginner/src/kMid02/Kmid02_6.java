package kMid02;

public class Kmid02_6 {

	public static void main(String[] args) {
		int[][] image = {
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		};

		// 画像の外周を塗りつぶす
		fill(image, 0, 0);

		// 画像を表示する
		String[] table = { "□", "■" };
		for (int[] row : image) {
			for (int col : row) {
				System.out.print(table[col]);
			}
			System.out.println();
		}
	}

	// 再帰関数
	static void fill(int[][] image, int row, int col) {
		if (row < 0 || row >= image.length) {
			return;
		}
		if (col < 0 || col >= image[0].length) {
			return;
		}
		if (image[row][col] != 0) {
			return;
		}
		// ===== ここから

		image[row][col] = 1;

		fill(image, row + 1, col);
		fill(image, row - 1, col);
		fill(image, row, col + 1);
		fill(image, row, col - 1);

		// ===== ここまで
	}

}

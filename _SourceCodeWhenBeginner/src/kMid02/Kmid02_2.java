package kMid02;

public class Kmid02_2 {

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
		
		// 画像を左右反転させる
		reverse(image);
		
		// 画像を表示する
		String[] table = { "□", "■" };
		for (int[] row : image) {
			for (int col : row) {
				System.out.print(table[col]);
			}
			System.out.println();
		}
	}

	private static void reverse(int[][] image) {
		for (int[] row : image) {
			for (int i = 0; i < row.length / 2; i++) {
				int buffer = row[i];
				row[i] = row[row.length - 1 - i];
				row[row.length - 1 - i] = buffer;
			}
		}

	}

}

package kMid02;

public class Kmid02_4 {

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
		
		// 画像を上下反転させる
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
		for (int i = 0; i < image.length / 2; i++) {
			for (int j = 0; j < image[i].length; j++) {
				int buffer = image[i][j];
				image[i][j] = image[image.length - 1 - i][j];
				image[image.length - 1 - i][j] = buffer;
			}

		}
	}

}
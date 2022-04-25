package kMid02;

public class Kmid02_5 {

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

		// 画像を反時計回りに90度回転させる
		image = rotate(image);

		// 画像を表示する
		String[] table = { "□", "■" };
		for (int[] row : image) {
			for (int col : row) {
				System.out.print(table[col]);
			}
			System.out.println();
		}
	}

	private static int[][] rotate(int[][] image) {
		int[][] rImage = new int[image.length][image[0].length];

		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				rImage[rImage.length - 1 - j][i] = image[i][j];
			}
		}
		return rImage;
	}

}

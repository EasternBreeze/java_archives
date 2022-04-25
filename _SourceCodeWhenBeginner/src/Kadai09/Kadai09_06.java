package Kadai09;

public class Kadai09_06 {

	public static void main(String[] args) {
		int board = 0; // 完成したガラス板の枚数
		int material = 25; // 原料(g)

		while (material >= 1) {
			material--;
			board++;

			if (board % 5 == 0) {
				board++;
			}
		}

		System.out.println(board + "枚");
	}

}

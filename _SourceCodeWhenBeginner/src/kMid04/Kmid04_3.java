package kMid04;

public class Kmid04_3 {

	public static void main(String[] args) {
		int[][] field = new int[6][12];
		field[0][0] = 1;
		field[0][9] = -1;
		field[2][7] = -1;
		field[5][2] = -1;

		update(field, 0, 1);

		System.out.println(field[5][11] + "通り");
	}

	// 再帰関数
	static void update(int[][] field, int row, int col) {
		// ===== ここから
		if (col > field[row].length - 1) { // colがOutOfBoundsしてないかチェック
			row++;
			col = 0;
		}
		if (row == field.length) { // 終了条件
			return;
		}

		if (field[row][col] != -1) {
			int rowUpper = row != 0 ? field[row - 1][col] : 0;
			rowUpper = rowUpper != -1 ? rowUpper : 0;
			int colLeft = col != 0 ? field[row][col - 1] : 0;
			colLeft = colLeft != -1 ? colLeft : 0;

			field[row][col] = rowUpper + colLeft;
			//	field[row][col] = (row != 0 ? (field[row - 1][col] != -1 ? field[row - 1][col] : 0) : 0)
			//		+ (col != 0 ? (field[row][col - 1] != -1 ? field[row][col - 1] : 0) : 0);
		}
		// ===== ここまで
		update(field, row, col + 1);
	}

}

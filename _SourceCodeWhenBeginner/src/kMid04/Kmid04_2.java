package kMid04;

public class Kmid04_2 {

	public static void main(String[] args) {
		int[][] field = new int[6][12];
		field[0][9] = -1;
		field[2][7] = -1;
		field[5][2] = -1;

		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[0].length; j++) {
				update(field, i, j);
			}
		}

		System.out.println(field[5][11] + "通り");
	}

	private static void update(int[][] field, int row, int col) {
		if (row == 0 && col == 0) {
			field[row][col] = 1;
			return;
		} else if (field[row][col] == -1) {
			return;
		} else {
			field[row][col] = (row != 0 ? (field[row - 1][col] != -1 ? field[row - 1][col] : 0) : 0)
					+ (col != 0 ? (field[row][col - 1] != -1 ? field[row][col - 1] : 0) : 0);
		}
	}

}

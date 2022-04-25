package kMid01;

public class Kmid01_4 {

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
		int count = 0; // 横一列がすべて 1 である行の総数
		for (int i = 0; i < field.length; i++) {
			if (isFull(field, i)) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean isFull(int[][] field, int n) {
		for (int line : field[n]) {
			if (line == 0) {
				return false;
			}
		}
		return true;
	}

}

package kMId10_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BingoCard {

	// ===== ここから
	final int ROWS = 5;
	final int COLS = 5;
	int[][] matrix = new int[ROWS][COLS];

	// ===== ここまで

	public BingoCard() {
		setNumbers(0, 1, 15); // B
		setNumbers(1, 16, 30); // I
		setNumbers(2, 31, 45); // N
		setNumbers(3, 46, 60); // G
		setNumbers(4, 61, 75); // O
		matrix[2][2] = 0; // 中央
	}

	// 非公開メソッド
	private void setNumbers(int colIndex, int low, int high) {
		List<Integer> samples = new ArrayList<>();
		for (int i = low; i <= high; i++) {
			samples.add(i);
		}
		Collections.shuffle(samples);
		for (int i = 0; i < ROWS; i++) {
			matrix[i][colIndex] = samples.remove(0);
		}
	}

	@Override
	public String toString() {
		String s = "";
		for (int[] row : matrix) {
			for (int col : row) {
				s += String.format("%2d ", col);
			}
			s += "\n";
		}
		return s;
	}
}

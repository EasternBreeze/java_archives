package kMId10_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1 {

	static final int ROWS = 5;
	static final int COLS = 5;
	static int[][] MATRIX = new int[ROWS][COLS];

	public static void main(String[] args) {
		setNumbers(0, 1, 15); // B
		setNumbers(1, 16, 30); // I
		setNumbers(2, 31, 45); // N
		setNumbers(3, 46, 60); // G
		setNumbers(4, 61, 75); // O
		MATRIX[2][2] = 0; // 中央

		for (int[] row : MATRIX) {
			for (int col : row) {
				System.out.print(String.format("%2d ", col));
			}
			System.out.println();
		}
	}

	static void setNumbers(int colIndex, int low, int high) {
		List<Integer> samples = new ArrayList<>();
		// ===== ここから
		for (int i = low; i <= high; i++) {
			samples.add(i);
		}
		Collections.shuffle(samples);
		// ===== ここまで
		for (int i = 0; i < ROWS; i++) {
			MATRIX[i][colIndex] = samples.remove(0);
		}
	}
}
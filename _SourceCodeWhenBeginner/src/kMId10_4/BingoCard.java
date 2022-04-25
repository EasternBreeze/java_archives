package kMId10_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BingoCard {

	private static final int ROWS = 5;
	private static final int COLS = 5;
	private final int[][] matrix = new int[ROWS][COLS];

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

	public void punch(int number) {
		// ===== ここから
		int col = (number - 1) / 15;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][col] == number) {
				matrix[i][col] = 0;
				return;
			}
		}
		// ===== ここまで
	}

	public boolean isBingo() {
		return isBingoHorizontal()
				|| isBingoVertical()
				|| isBingoDiagonal();
	}

	// 非公開メソッド（横方向のビンゴをチェックする）
	private boolean isBingoHorizontal() {
		for (int[] row : matrix) {
			int sum = 0;
			for (int col : row) {
				sum += col;
			}
			if (sum == 0) {
				return true;
			}
		}
		return false;
	}

	//非公開メソッド（縦方向のビンゴをチェックする）
	private boolean isBingoVertical() {
		// ===== ここから
		for (int i = 0; i < matrix[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[j][i];
			}
			if (sum == 0) {
				return true;
			}
		}
		return false;
		// ===== ここまで
	}

	//非公開メソッド（斜め方向のビンゴをチェックする）
	private boolean isBingoDiagonal() {
		// ===== ここから
		int sumL = 0;
		int sumR = 0;
		for (int i = 0; i < matrix.length; i++) {
			sumL += matrix[i][i];
			sumR += matrix[i][matrix.length - 1 - i];
		}
		if (sumL == 0 || sumR == 0) {
			return true;
		}
		return false;
		// ===== ここまで
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

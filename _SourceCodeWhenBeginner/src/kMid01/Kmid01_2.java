package kMid01;

public class Kmid01_2 {

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
		System.out.println(countBlock(field));
	}

	private static int countBlock(int[][] field) {
		int count = 0;

		for (int[] column : field) {
			for (int line : column) {
				if (line == 1) {
					count++;
				}
			}
		}
		return count;
	}

}

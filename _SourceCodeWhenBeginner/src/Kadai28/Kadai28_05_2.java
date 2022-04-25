package Kadai28;

public class Kadai28_05_2 {

	public static void main(String[] args) {
		final int DICE = 4;
		int roll = 1;
		for (int i = 0; i < DICE; i++) {
			roll *= 6;
		}
		final int TOTAL_ROLL = roll;

		int[] pattern = new int[TOTAL_ROLL]; // [1296]

		for (int i = 0, mul = 1; i < DICE; i++, mul *= 6) {
			for (int j = 0, n = 1; j < pattern.length; j++) {
				pattern[j] = pattern[j] * 10 + n;
				if ((j + 1) % mul == 0) {
					n = n < 6 ? n + 1 : 1;
				}
			}
		}

		int recall = 0;

		for (int p : pattern) {
			int[] pos = { 0, 0 };

			while (p > 0) {
				switch (p % 10) {
				case 1:
					pos[0]++;
					break;
				case 2:
					pos[0]--;
					break;
				case 3:
					pos[1]++;
					break;
				case 4:
					pos[1]--;
					break;
				}
				p /= 10;
			}

			if (pos[0] == 0 && pos[1] == 0) {
				recall++;
			}
		}

		double persent = 1.0 * recall / TOTAL_ROLL;

		System.out.println(persent + " (" + recall + " / " + TOTAL_ROLL + ")");
	}

}

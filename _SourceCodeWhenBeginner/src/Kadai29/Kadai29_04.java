package Kadai29;

public class Kadai29_04 {

	public static void main(String[] args) {
		int[] cards = { 1, 1, 1, 1, 1 };

		while (cards[0] <= 9) {
			int sum = 0;
			int prod = 1;

			for (int n : cards) {
				sum += n;
				prod *= n;
			}

			if (sum == prod) {
				for (int n : cards) {
					System.out.print(n + " ");
				}
				System.out.println();
			}

			nextCards(cards);
		}
	}

	private static void nextCards(int[] cards) {
		cards[cards.length - 1]++;

		for (int i = cards.length - 1; i > 0; i--) { // 桁上がりチェック
			if (cards[i] == 10) {
				cards[i] = 1;
				cards[i - 1]++;
			}
		}
	}

}

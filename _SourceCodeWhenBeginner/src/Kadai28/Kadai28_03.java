package Kadai28;

public class Kadai28_03 {

	public static void main(String[] args) {
		/* n種類コンプするのに必要な回数の期待値
		 *
		 * 回数 = n * (1 + 1/2 + 1/3 + ... + 1/n)
		 *
		 * */

		int type = 5;
		double tryCount = 0;
		for (int i = 1; i <= type; i++) {
			tryCount += 1.0 / i;
		}
		tryCount *= type;

		System.out.printf("だいたい%.2f回", tryCount);
	}

}

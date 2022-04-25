package Kadai28;

public class Kadai28_04 {

	public static void main(String[] args) {
		/* 三角形ABCがつくれる条件
		 * A <= B + C
		 * B <= A + C
		 * C <= A + B ですってよ
		 */

		/* A = max30
		 * B = max30 - A
		 * C = 30 - (A + B)
		 * */

		final int SPA = 300; // スパゲッティの長さ(mm)
		int count = 0; // 総パターン数
		int canMake = 0; // 作れた回数

		for (int i = 0; i <= SPA; i++) {
			for (int j = 0; j <= SPA - i; j++) {
				int a = i;
				int b = j;
				int c = SPA - (a + b);

				if (isTriangle(a, b, c)) {
					canMake++;
				}
				count++;
			}
		}

		double probability = 1.0 * canMake / count;
		System.out.println("作れた回数 " + canMake + " / 総パターン数 " + count);
		System.out.println("三角形が作れる確率 " + probability);
	}

	private static boolean isTriangle(int a, int b, int c) {
		if (a <= b + c && b <= a + c && c <= a + b) {
			return true;
		}
		return false;
	}

}

package Kadai21;

public class Kadai21_03 {

	public static void main(String[] args) {
		int[] a = { -1, 0, 2011, 99099, 9995999 };

		for (int n : a) {
			System.out.println(n + "の数字根は" + digitalRoot(n) + "です");
		}

	}

	private static int digitalRoot(int n) {
		if (n < 0) {
			return 0;
		}

		while (n >= 10) {
			n = sumDigit(n);
		}
		return n;
	}

	private static int sumDigit(int n) {
		if (n < 0) {
			return 0;
		}

		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}

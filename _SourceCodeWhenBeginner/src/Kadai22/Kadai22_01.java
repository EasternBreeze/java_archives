package Kadai22;

public class Kadai22_01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int n = i;
			if (isHarshad(n)) {
				System.out.print(n + " ");
			}
		}

		System.out.println();
	}

	private static boolean isHarshad(int n) {
		return n % sumDigit(n) == 0;
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

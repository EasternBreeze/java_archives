package Kadai22;

public class Kadai22_03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 500; i++) {
			int n = i;
			if (isZuckerman(n)) {
				System.out.print(n + " ");
			}
		}

		System.out.println();
	}

	private static boolean isZuckerman(int n) {
		int prod = prodDigit(n);
		if (prod == 0) {
			return false;
		} else {
			return n % prodDigit(n) == 0;
		}
	}

	private static int prodDigit(int n) {
		if (n < 0) {
			return 0;
		}

		int prod = 1;
		while (n > 0) {
			prod *= n % 10;
			n /= 10;
		}
		return prod;
	}
}

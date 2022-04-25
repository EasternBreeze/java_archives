package Kadai27;

public class Kadai27_01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			double root = squareRoot(i);
			System.out.println("√" + i + "=" + root);
		}

	}

	private static double squareRoot(int n) {
		double low = 1.0;
		double high = n;
		double mid = 1.0; // 最終的に平方根に近づく

		while (high - low > 0.0000001) {
			mid = (low + high) / 2.0;

			if (mid * mid > n) {
				high = mid;
			} else {
				low = mid;
			}
		}

		return mid;
	}

}

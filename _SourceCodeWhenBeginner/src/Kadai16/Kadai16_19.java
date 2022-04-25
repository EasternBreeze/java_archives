package Kadai16;

public class Kadai16_19 {

	public static void main(String[] args) {
		printSum(7);
	}

	private static void printSum(int n) {
		if (n < 0) {
			return;
		}

		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}

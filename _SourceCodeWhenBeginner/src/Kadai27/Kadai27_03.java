package Kadai27;

public class Kadai27_03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (isHappy(i)) {
				System.out.println(i);
			}
		}

	}

	private static boolean isHappy(int n) {
		if (n == 1) {
			return true;
		} else if (n == 4) {
			return false;
		}

		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit;

			n /= 10;
		}

		//		System.out.println(sum);
		return isHappy(sum);
	}

}

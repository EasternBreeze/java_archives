package Kadai20;

public class Kadai20_02 {

	public static void main(String[] args) {
		for (int i = -1; i <= 10; i++) {
			int n = i;
			if (isPrime(n)) {
				System.out.println(n + "は素数です");
			} else {
				System.out.println(n + "は素数ではありません");
			}
		}

	}

	private static boolean isPrime(int n) {
		if (countDivisor(n) == 2) {
			return true;
		} else {
			return false;
		}
	}

	private static int countDivisor(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++)
			if (n % i == 0) {
				count++;
			}

		return count;
	}

}

package Kadai20;

public class Kadai20_03 {

	public static void main(String[] args) {
		int n = 1;
		int count = 0;
		while (count < 8) {
			if (isPrime(n) && isPrime(n + 2) == true) {
				System.out.print("(" + n + "," + (n + 2) + ")");
				count++;
			}
			n++;
		}

		System.out.println();
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

package Kadai20;

public class Kadai20_01 {

	public static void main(String[] args) {
		for (int i = -1; i <= 10; i++) {
			int n = i;
			System.out.println(i + "の約数は" + countDivisor(n) + "です");
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

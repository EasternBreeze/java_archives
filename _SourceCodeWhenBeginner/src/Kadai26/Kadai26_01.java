package Kadai26;

public class Kadai26_01 {

	public static void main(String[] args) {
		for (int i = 10; i <= 99; i++) {
			int n = i;
			System.out.println(collatz(n));
		}

	}

	private static int collatz(int n) {
		if (n == 1) {
			return n;
		}

		System.out.print(n + "→");
		if (n % 2 == 0) {
			n /= 2;
		} else {
			n = n * 3 + 1;
		}
		return collatz(n);
	}

}

package Kadai26;

public class Kadai26_02 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "!=" + factorial(i));
		}

	}

	private static int factorial(int n) {
		if (n == 1) {
			return n;
		}
		return n * factorial(n - 1);
	}

}

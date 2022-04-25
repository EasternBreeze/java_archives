package Kadai19;

public class Kadai19_01 {

	public static void main(String[] args) {
		for (int i = -10; i <= 10; i++) {
			int n = i;
			if (isEven(n)) {
				System.out.print(n + " ");
			}
		}

		System.out.println();
	}

	private static boolean isEven(int n) {
		return n % 2 == 0;
	}

}

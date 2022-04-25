package Kadai19;

public class Kadai19_03 {

	public static void main(String[] args) {
		for (int i = -10; i <= 10; i++) {
			int n = i;
			if (isOdd(n)) {
				System.out.print(n + " ");
			}
		}

		System.out.println();
	}

	private static boolean isOdd(int n) {
		return n > 0;
	}

}

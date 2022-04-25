package Kadai19;

public class Kadai19_04 {

	public static void main(String[] args) {
		for (int i = -10; i <= 10; i++) {
			int n = i;
			System.out.print(abs(n) + " ");
		}

		System.out.println();
	}

	private static int abs(int n) {
		//		return Math.abs(n);
		if (n < 0) {
			return n * -1;
		} else {
			return n;
		}
	}

}

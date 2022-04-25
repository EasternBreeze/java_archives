package Kadai21;

public class Kadai21_01 {

	public static void main(String[] args) {
		int[] a = { -1, 0, 9, 10, 99, 100, 999, 1000 };

		for (int n : a) {
			System.out.println(n + "の桁数は" + countDigit(n) + "です");
		}

	}

	private static int countDigit(int n) {
		if (n < 0) {
			return 0;
		}

		int digit = 0;
		do {
			n /= 10;
			digit++;
		} while (n > 0);
		
		return digit;

		//		return String.valueOf(n).length();
	}

}

package Kadai22;

public class Kadai22_02 {

	public static void main(String[] args) {
		int count = 0;

		for (int i = 1; i <= 10000; i++) {
			int n = i;
			if (isPalindrome(n)) {
				count++;
			}
		}

		System.out.println(count + "個");
	}

	private static boolean isPalindrome(int n) {
		return n == numReverse(n);
	}

	private static int numReverse(int n) {
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}

}

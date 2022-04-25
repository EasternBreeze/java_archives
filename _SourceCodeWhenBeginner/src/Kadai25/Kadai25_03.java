package Kadai25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kadai25_03 {

	public static void main(String[] args) {
		final int N = 6354;

		System.out.println(N + " -> " + diffNumber(N));
	}

	private static int diffNumber(int n) {
		if (n < 0 || n >= 10000) {
			return -1;
		}

		return maxTrans(n) - minTrans(n);
	}

	private static int maxTrans(int n) {
		List<Integer> digits = toList(n);
		Collections.sort(digits);
		Collections.reverse(digits);

		return toInt(digits);
	}

	private static int minTrans(int n) {
		List<Integer> digits = toList(n);
		Collections.sort(digits);

		return toInt(digits);
	}

	private static int toInt(List<Integer> digits) {
		int n = 0;

		for (int d : digits) {
			n = n * 10 + d;
		}
		return n;
	}

	private static List<Integer> toList(int n) {
		List<Integer> digits = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			digits.add(n % 10);
			n /= 10;
		}
		return digits;
	}

}

package Kadai25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kadai25_01 {

	public static void main(String[] args) {
		final int N = 702;

		System.out.println(N + " -> " + maxTrans(N));
	}

	private static int maxTrans(int n) {
		if (n < 0 || n >= 10000) {
			return -1;
		}

		List<Integer> digits = toList(n);
		Collections.sort(digits);
		Collections.reverse(digits);

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

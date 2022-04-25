package Kadai26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kadai26_03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "→" + toRadix(i));
		}

	}

	private static int toRadix(int n) {
		List<Integer> nums = new ArrayList<>();

		while (n > 0) {
			nums.add(n % 2);
			n /= 2;
		}

		Collections.reverse(nums); // 2で割る方法は下の桁からなので

		int radix = 0;
		for (int num : nums) {
			radix = radix * 10 + num;
		}

		return radix;
	}

}

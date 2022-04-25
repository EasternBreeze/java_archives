package Kadai28;

import java.util.ArrayList;
import java.util.List;

public class Kadai28_01 {
	static List<Long> list = new ArrayList<>();

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			addNum(i);
		}

		System.out.println(list.size() + "個");
	}

	private static void addNum(long n) {
		// 10桁チェック
		if (n >= 1000000000) {
			if (checkDiv1to9(n)) {
				//				System.out.println(n);
				list.add(n);
			}
			return;
		}

		for (int i = 0; i <= 9; i++) {
			if (checkWithNum(n, i)) {
				addNum(n * 10 + i);
			}
		}

	}

	// 1~9もとい9~5で割り切れるかチェック 割り切れたら[true]
	private static boolean checkDiv1to9(long n) {
		for (int i = 9; i >= 5; i--) {
			if (n % i != 0) {
				return false;
			}
		}
		return true;
	}

	// m(0~9)が被ってないかチェック 被ってなかったら[true]
	private static boolean checkWithNum(long num, int m) {
		while (num > 0) {
			if (num % 10 == m) {
				return false;
			}
			num /= 10;
		}
		return true;
	}

}

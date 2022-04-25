package q07_conways_problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ConwaysProblem2 {

	public static void main(String[] args) {
		search();
	}

	private static void search() {
		for (int i = 21345678; i <= 87654321; i++) {
			Set<Integer> set = new HashSet<>();
			int n = i;
			for (int j = 0; j < 8; j++) {
				set.add(n % 10);
				n /= 10;
			}
			set.remove(Integer.valueOf(0));
			set.remove(Integer.valueOf(9));

			if (set.size() == 8) {
				if (checkCount(i) == 22) {
					System.out.println(i);
				}
			}
		}
	}

	private static int checkCount(int nums) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			list.add(nums % 10);
			nums /= 10;
		}
		Collections.reverse(list);

		int count = 0;

		while (list.get(0) != 1) {
			list = reverseList(list);
			count++;
		}

		return count;
	}

	private static List<Integer> reverseList(List<Integer> list) {
		if (list.get(0) == 1) {
			return list;
		}
		int untilIndex = list.get(0) - 1;

		List<Integer> targets = new ArrayList<>();
		for (int i = 0; i <= untilIndex; i++) {
			targets.add(list.get(i));
		}

		Collections.reverse(targets);

		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (i < targets.size()) {
				ans.add(targets.get(i));
			} else {
				ans.add(list.get(i));
			}
		}

		return ans;
	}
}

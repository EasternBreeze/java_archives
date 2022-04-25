package q07_conways_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ConwaysProblem {

	// pattern1 : 4, 6, 1, 8, 5, 7, 2, 3 count:4
	// pattern2 : 5, 8, 1, 6, 4, 7, 2, 3 count:5
	// pattern3 : 6, 1, 5, 7, 8, 3, 2, 4 count:22

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6, 1, 5, 7, 8, 3, 2, 4);
		int count = 0;

		while (list.get(0) != 1) {
			list = reverseList(list);
			count++;
			System.out.println(count + " " + list);
		}

		System.out.println("Count:" + count);
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

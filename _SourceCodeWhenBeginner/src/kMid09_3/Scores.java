package kMid09_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scores {

	private List<Integer> list = new ArrayList<>();

	void add(int score) {
		list.add(score);
	}

	int sum() {
		int sum = 0;
		for (int s : list) {
			sum += s;
		}
		return sum;
	}

	double average() {
		// ===== ここから
		return 1.0 * sum() / list.size();
		// ===== ここまで
	}

	int min() {
		// ===== ここから
		Collections.sort(list);
		return list.get(0);
		// ===== ここまで
	}

	int max() {
		Collections.sort(list);
		Collections.reverse(list);
		return list.get(0);
	}
}
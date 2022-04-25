package kMid09_5;

import java.util.List;

public class Result {
	private double average;
	private int min;
	private int max;

	Result(List<Score> list) {
		// ===== ここから
		int sum = 0;
		int min = list.get(0).score();
		int max = list.get(0).score();

		for (Score n : list) {
			sum += n.score();
			min = n.score() < min ? n.score() : min;
			max = n.score() > max ? n.score() : max;
		}

		this.average = 1.0 * sum / list.size();
		this.min = min;
		this.max = max;
		// ===== ここまで
	}

	double average() {
		return average;
	}

	int min() {
		return min;
	}

	int max() {
		return max;
	}
}

package kMid09_4;

import java.util.ArrayList;
import java.util.List;

public class ScoreManager {

	private List<Score> list = new ArrayList<>();

	void add(String name, Subject subject, int score) {
		// ===== ここから
		list.add(new Score(name, subject, score));
		// ===== ここまで
	}

	int get(String name, Subject subject) {
		// ===== ここから
		int score = 0;
		for (Score s : list) {
			if (name.equals(s.name()) && subject.equals(s.subject())) {
				score = s.score();
				break;
			}
		}
		return score;
		// ===== ここまで
	}
}
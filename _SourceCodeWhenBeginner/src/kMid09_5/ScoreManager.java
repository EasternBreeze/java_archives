package kMid09_5;

import java.util.ArrayList;
import java.util.List;

public class ScoreManager {

	private List<Score> list = new ArrayList<>();

	void add(String name, int java, int db, int network, int web) {
		// ===== ここから
		add(name, Subject.JAVA, java);
		add(name, Subject.DB, db);
		add(name, Subject.NETWORK, network);
		add(name, Subject.WEB, web);
		// ===== ここまで;
	}

	void add(String name, Subject subject, int score) {
		list.add(new Score(name, subject, score));
	}

	Result get(String name) {
		List<Score> result = new ArrayList<>();
		for (Score score : list) {
			if (score.name().equals(name)) {
				result.add(score);
			}
		}
		return new Result(result);
	}

	Result get(Subject subject) {
		// ===== ここから
		List<Score> result = new ArrayList<>();
		for (Score score : list) {
			if (score.subject().equals(subject)) {
				result.add(score);
			}
		}
		return new Result(result);
		// ===== ここまで
	}
}
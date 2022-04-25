package kMid09_4;

public class Score {

	private String name;
	private Subject subject;
	private int score;

	Score(String name, Subject subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	String name() {
		return name;
	}

	Subject subject() {
		return subject;
	}

	int score() {
		return score;
	}
}

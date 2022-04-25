package kMid09_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Scores {

	public enum Subject {
		JAVA, DB, NETWORK, WEB
	}

	private final List<Score> list;

	Scores() {
		list = new ArrayList<>();
	}

	private Scores(Stream<Score> stream) {
		list = stream.collect(Collectors.toList());
	}

	void add(String name, int java, int db, int network, int web) {
		add(name, Subject.JAVA, java);
		add(name, Subject.DB, db);
		add(name, Subject.NETWORK, network);
		add(name, Subject.WEB, web);
	}

	private void add(String name, Subject subject, int score) {
		list.removeIf(s -> s.name.equals(name) && s.subject == subject);
		list.add(new Score(name, subject, score));
	}

	Scores filter(String name) {
		return new Scores(list.stream().filter(s -> s.name.equals(name)));
	}

	Scores filter(Subject subject) {
		return new Scores(list.stream().filter(s -> s.subject == subject));
	}

	int get() {
		return list.stream().mapToInt(s -> s.score).findAny().orElse(-1);
	}

	double average() {
		return list.stream().mapToInt(s -> s.score).average().orElse(-1);
	}

	int min() {
		return list.stream().mapToInt(s -> s.score).min().orElse(-1);
	}

	int max() {
		return list.stream().mapToInt(s -> s.score).max().orElse(-1);
	}

	private static class Score {
		private final String name;
		private final Subject subject;
		private final int score;

		Score(String name, Subject subject, int score) {
			this.name = name;
			this.subject = subject;
			this.score = score;
		}
	}
}
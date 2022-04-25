package kMid09_1;

public class Student {

	private String name;
	private int[] scores;

	public Student(String name, int... scores) {
		this.name = name;
		this.scores = scores;
	}

	String name() {
		return this.name;
	}

	double average() {
		int total = 0;

		for (int score : scores) {
			total += score;
		}
		return 1.0 * total / scores.length;
	}
}

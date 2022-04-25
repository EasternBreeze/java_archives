package kMid09_2;

public class Student {
	private String name;
	private int min;
	private int max;

	// ===== ここから
	public Student(String name, int first, int... others) {
		this.name = name;
		this.min = first;
		this.max = first;

		for (int score : others) {
			this.min = score < this.min ? score : this.min;
			this.max = score > this.max ? score : this.max;
		}
	}
	// ===== ここまで

	String name() {
		return name;
	}

	int min() {
		return min;
	}

	int max() {
		return max;
	}
}
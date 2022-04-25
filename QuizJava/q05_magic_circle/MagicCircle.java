package q05_magic_circle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public final class MagicCircle {

	public static void main(String[] args) {
		Circle m = new Circle();
		m.printCircleA();
		System.out.println();
		m.printCircleB();

		System.out.println();
		m.printCircleComp();
	}

}

final class Circle {

	private final List<List<Integer>> circleA;
	private final List<List<Integer>> circleB;

	private final List<List<Integer>> circleComp;

	Circle() {
		circleA = makeCircle(1, 1, 2);
		circleB = makeCircle(0, 5, 3);

		circleComp = mergeCircle(circleA, circleB);
	}

	void printCircleA() {
		circleA.forEach(rows -> {
			rows.forEach(n -> System.out.printf("%3d", n));
			System.out.println();
		});
	}

	void printCircleB() {
		circleB.forEach(rows -> {
			rows.forEach(n -> System.out.printf("%3d", n));
			System.out.println();
		});
	}

	void printCircleComp() {
		circleComp.forEach(rows -> {
			rows.forEach(n -> System.out.printf("%3d", n));
			System.out.println();
		});
	}

	private List<List<Integer>> makeCircle(int min, int multiple, int shift) {
		List<List<Integer>> circle = new ArrayList<>();

		List<Integer> firstRow = new ArrayList<>();
		IntStream.range(min, min + 5).forEach(s -> firstRow.add(s * multiple));
		Collections.shuffle(firstRow);

		circle.add(firstRow);

		List<Integer> next = new ArrayList<>(firstRow);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < shift; j++) {
				next.add(next.remove(0));
			}

			circle.add(next);
			next = new ArrayList<>(next);
		}

		return circle;
	}

	private List<List<Integer>> mergeCircle(List<List<Integer>> a, List<List<Integer>> b) {
		List<List<Integer>> circle = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			circle.add(new ArrayList<>());
			for (int j = 0; j < a.get(0).size(); j++) {
				int sum = a.get(i).get(j) + b.get(i).get(j);
				circle.get(i).add(sum);
			}
		}

		return circle;
	}
}
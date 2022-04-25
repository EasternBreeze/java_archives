package system;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {

	private final String name;
	private int point;
	private final List<Integer> stock = new ArrayList<>();
	private final List<Integer> history = new ArrayList<>();

	public Player(String name) {
		if (name == null) {
			throw new IllegalArgumentException();
		}
		this.name = name;
	}

	protected abstract int inputNumber(Info my, Info enemy);

	final void init() {
		point = 0;
		stock.clear();
		for (int i = 1; i <= 9; i++) {
			stock.add(i);
		}
		history.clear();
	}

	public final String getName() {
		return name;
	}

	public final int getPoint() {
		return point;
	}

	public final Info getInfo() {
		return new Info();
	}

	protected final int choose(Info my, Info enemy) {
		while (true) {
			int n = inputNumber(my, enemy);
			if (n < 1 || n > 9) {
				System.out.println(n + " Enter a number from 1 - 9.");
				continue;
			}

			if (stock.remove(Integer.valueOf(n))) {
				history.add(n);
				return n;
			}
			System.out.println("[" + n + "] is already used.");
		}
	}

	final void addPoint() {
		point++;
	}

	final void addPoint(int add) {
		point += add;
	}

	@Override
	public final String toString() {
		String s = "[ ";
		for (int i = 1; i <= 9; i++) {
			if (stock.contains(Integer.valueOf(i))) {
				s += i + " ";
			} else {
				s += "- ";
			}
		}
		s += "]";

		return s + " " + point + "pt";
	}

	public class Info {
		public final List<Integer> stock = new ArrayList<>(Player.this.stock);
		public final List<Integer> history = new ArrayList<>(Player.this.history);
		public final int last;

		private Info() {
			if (history.size() == 0) {
				last = 0;
			} else {
				last = history.get(history.size() - 1);
			}
		}
	}
}

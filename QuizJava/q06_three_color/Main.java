package q06_three_color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class Main {

	enum Color {
		赤, 黄, 青;

		private static Random rand = new Random();

		static Color getRandom() {
			return values()[rand.nextInt(values().length)];
		}
	}

	private static List<Color> table = new ArrayList<>() {
		{
			add(Color.赤);
			add(Color.青);
			add(Color.黄);
		}
	};

	public static void main(String[] args) {
		Map<Color, Integer> count = new HashMap<>();
		count.put(Color.赤, 0);
		count.put(Color.黄, 0);
		count.put(Color.青, 0);

		for (int i = 0; i < 100000; i++) {
			Color c = test();
			count.put(c, count.get(c) + 1);
		}
		System.out.println(count);
	}

	private static Color test() {
		List<Color> list = new ArrayList<>();

		list.add(Color.赤);
		for (int i = 0; i < 8; i++) {
			list.add(Color.getRandom());
		}
		list.add(Color.黄);

		//		list.add(Color.赤);
		//		for (int i = 0; i < 8; i++) {
		//			Collections.shuffle(table);
		//			list.add(table.get(0));
		//		}
		//		list.add(Color.黄);

		return paint(list);
	}

	private static Color paint(List<Color> before) {
		if (before.size() <= 1) {
			return before.get(0);
		}

		List<Color> after = new ArrayList<>();

		for (int i = 0; i < before.size() - 1; i++) {
			after.add(desideColor(before.get(i), before.get(i + 1)));
		}

		//	return after;
		return paint(after);
	}

	private static Color desideColor(Color left, Color right) {
		if (left == right) {
			return left;
		}

		for (Color c : Color.values()) {
			if (c != left && c != right) {
				return c;
			}
		}
		return null;
	}
}

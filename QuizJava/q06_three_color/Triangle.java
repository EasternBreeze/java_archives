package q06_three_color;

import java.util.ArrayList;
import java.util.List;

import three_color.Main.Color;

public final class Triangle {

	private final Color end;

	Triangle(List<Color> list) {
		this.end = paint(list).get(0);
	}

	Color end() {
		return end;
	}

	private List<Color> paint(List<Color> before) {
		if (before.size() <= 1) {
			return before;
		}

		List<Color> after = new ArrayList<>();

		for (int i = 0; i < before.size() - 1; i++) {
			after.add(desideColor(before.get(i), before.get(i + 1)));
		}

		return paint(after);
	}

	private Color desideColor(Color left, Color right) {
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

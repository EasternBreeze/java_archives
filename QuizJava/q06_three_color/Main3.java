package q06_three_color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import three_color.Main.Color;

public final class Main3 {

	private static List<Triangle> triangles = new ArrayList<>();

	public static void main(String[] args) {
		Map<Color, Integer> count = new HashMap<>();
		count.put(Color.赤, 0);
		count.put(Color.黄, 0);
		count.put(Color.青, 0);

		List<Color> list = new ArrayList<>();
		list.add(Color.赤);
		for (int i = 0; i < 9; i++) {
			list.add(null);
		}
		createAll(list, 0, 10);

		triangles.forEach(s -> count.put(s.end(), count.get(s.end()) + 1));
		System.out.println(count);
	}

	private static void createAll(List<Color> list, int loop, final int size) {
		loop++;
		if (loop >= size - 1) {
			list.set(loop, Color.黄);
			triangles.add(new Triangle(list));
			return;
		}

		for (Color c : Color.values()) {
			list.set(loop, c);
			createAll(list, loop, size);
		}
	}
}

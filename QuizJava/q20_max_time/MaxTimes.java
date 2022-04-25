package q20_max_time;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public final class MaxTimes {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i <= 23; i++) {
			for (int j = 0; j <= 59; j++) {
				String time = of(i, j);
				if (!map.containsKey(time)) {
					map.put(time, 1);
				} else {
					map.replace(time, map.get(time) + 1);
				}
			}
		}

		List<Entry<String, Integer>> entry = new ArrayList<>(map.entrySet());
		entry.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));

		entry.forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));
	}

	private static String of(int hour, int minute) {
		List<Integer> parts = new ArrayList<>();
		do {
			parts.add(hour % 10);
			hour /= 10;
		} while (hour > 0);
		do {
			parts.add(minute % 10);
			minute /= 10;
		} while (minute > 0);

		return getMaxTime(parts);
	}

	private static String getMaxTime(List<Integer> parts) {
		List<Integer> remain = new ArrayList<>(parts);

		List<Integer> partsHour = getMaxHour(remain);
		partsHour.forEach(n -> remain.remove(Integer.valueOf(n)));

		List<Integer> partsMinute = getMaxMinute(remain);

		if (partsHour.size() == 1) {
			partsHour.add(0, 0);
		}
		if (partsMinute.size() == 1) {
			partsMinute.add(0, 0);
		}
		StringBuilder sb = new StringBuilder();
		partsHour.forEach(n -> sb.append(n));
		sb.append(":");
		partsMinute.forEach(n -> sb.append(n));
		return sb.toString();
	}

	private static List<Integer> getMaxHour(List<Integer> parts) {
		if (parts.size() == 2) {
			List<Integer> list = new ArrayList<>();
			list.add(parts.get(0) > parts.get(1) ? parts.get(0) : parts.get(1));
			return list;
		}

		List<Integer> copy = new ArrayList<>(parts);
		if (copy.remove(Integer.valueOf(2))) {
			Optional<Integer> h2 = copy.stream().filter(n -> n < 4)
					.max((n1, n2) -> Integer.compare(n1, n2));

			if (h2.isPresent()) {
				List<Integer> list = new ArrayList<>();
				list.add(2);
				list.add(h2.get());
				return list;
			}
		}

		copy = new ArrayList<>(parts);
		if (copy.remove(Integer.valueOf(1))) {
			Optional<Integer> h2 = copy.stream()
					.max((n1, n2) -> Integer.compare(n1, n2));

			if (h2.isPresent()) {
				List<Integer> list = new ArrayList<>();
				list.add(1);
				list.add(h2.get());
				return list;
			}
		}

		List<Integer> list = new ArrayList<>();
		list.add(copy.stream().max((n1, n2) -> Integer.compare(n1, n2)).get());

		return list;
	}

	private static List<Integer> getMaxMinute(List<Integer> parts) {
		if (parts.size() == 1) {
			List<Integer> list = new ArrayList<>();
			list.add(0);
			list.add(parts.get(0));
			return list;
		}

		List<Integer> copy = new ArrayList<>(parts);
		copy.sort((n1, n2) -> Integer.compare(n2, n1));

		if (copy.get(0) < 6) {
			List<Integer> list = new ArrayList<>();
			list.add(copy.get(0));
			list.add(copy.get(1));
			return list;
		}
		List<Integer> list = new ArrayList<>();
		list.add(copy.get(1));
		list.add(copy.get(0));
		return list;
	}
}

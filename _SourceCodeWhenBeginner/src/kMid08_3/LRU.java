package kMid08_3;

import java.util.ArrayList;
import java.util.List;

public class LRU {
	// ===== ここから

	List<String> list = new ArrayList<>();
	List<String> shelf = new ArrayList<>();

	public void add(String file) {
		if (list.size() < 6) {
			list.add(file);
			return;
		}

		for (int i = 0; i < list.size(); i++) {
			if (file.equals(list.get(i))) {

				list.add(list.remove(i));
				return;
			} else if (i == list.size() - 1) {
				shelf.add(list.remove(0));
				list.add(file);
			}
		}
	}

	public String history() {
		return shelf.toString();
	}
	// ===== ここまで
}

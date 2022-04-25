package kMid08_2;

import java.util.ArrayList;
import java.util.List;

public class LRU {
	List<String> list = new ArrayList<>();

	// ===== ここから
	public void add(String file) {
		if (list.size() < 6) { // listが6未満だったらまだ机に置けるので
			list.add(file); // 無条件に追加してcontinue
			return;
		}

		for (int i = 0; i < list.size(); i++) {
			if (file.equals(list.get(i))) {
				list.add(list.remove(i));
				return;
			} else if (i == list.size() - 1) {
				list.remove(0);
				list.add(file);
			}
		}
	}
	// ===== ここまで

	@Override
	public String toString() {
		return list.toString();
	}

}
package kMid08_1;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
	public static void main(String[] args) {
		String[] files = {
				"A", "B", "C", "D", "E", //
				"F", "G", "D", "E", "H", //
				"D", "A", "B", "F", "C", //
				"B", "D", "B", "F", "H", "E" //
		};

		List<String> list = new ArrayList<>();
		for (String file : files) {
			// ===== ここから
			if (list.size() < 6) { // listが6未満だったらまだ机に置けるので
				list.add(file); // 無条件に追加してcontinue
				continue;
			}

			for (int i = 0; i < list.size(); i++) {
				if (file.equals(list.get(i))) {
					list.add(list.remove(i));
					break;
				} else if (i == list.size() - 1) {
					list.remove(0);
					list.add(file);
				}
			}
			// ===== ここまで
		}
		System.out.println(list);
	}
}
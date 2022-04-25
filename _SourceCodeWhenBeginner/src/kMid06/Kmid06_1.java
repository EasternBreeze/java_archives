package kMid06;

import java.util.ArrayList;
import java.util.List;

public class Kmid06_1 {

	public static void main(String[] args) {
		List<String> history = new ArrayList<>();
		// ===== ここから
		history.add("グー");
		history.add("チョキ");
		history.add("パー");
		// ===== ここまで
		for (int i = 3; i < 100; i++) {
			if (history.get(0).equals("グー")) {
				history.add("パー");
			} else if (history.get(0).equals("チョキ")) {
				history.add("グー");
			} else {
				history.add("チョキ");
			}
			history.remove(0);
		}

		System.out.println(history.get(2));
	}

}

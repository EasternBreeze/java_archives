package kMid06;

import java.util.ArrayList;
import java.util.List;

public class Kmid06_2 {

	public static void main(String[] args) {
		List<String> history = new ArrayList<>();
		history.add("グー");
		history.add("チョキ");
		history.add("パー");

		for (int i = 3; i < 100; i++) {
			switch (history.get(0)) {
			// ===== ここから
			case "グー":
				history.add("パー");
				break;
			case "チョキ":
				history.add("グー");
				break;
			case "パー":
				history.add("チョキ");
				break;
			// ===== ここまで
			}
			history.remove(0);
		}

		System.out.println(history.get(2));
	}

}

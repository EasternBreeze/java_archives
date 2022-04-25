package kMid07_2;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		List<Fan> list = new ArrayList<>();
		list.add(new Fan(0, 60));
		list.add(new Fan(0, 55));
		list.add(new Fan(1, 50));
		list.add(new Fan(2, 55));
		list.add(new Fan(5, 20));
		list.add(new Fan(7, 50));
		list.add(new Fan(9, 50));
		list.add(new Fan(13, 45));
		list.add(new Fan(27, 30));
		list.add(new Fan(30, 25));

		int result = 0;
		// ===== ここから
		for (int i = 0; i < 60; i++) {
			int count = 0;
			for (Fan person : list) {
				if (i >= person.admission && i < person.admission + person.stay) {
					count++;
				}
			}
			if (count >= 8) {
				result++;
			}
		}
		// ===== ここまで
		System.out.println(result + "分");
	}

}

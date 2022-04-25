package kMid07_3;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
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

		for (int i = 0; i < 60; i++) {
			int count = 0;
			for (Fan fun : list) {
				// 指定時刻に会場内に存在していたか？
				if (fun.exist(i)) {
					count++;
				}
			}
			if (count >= 8) {
				result++;
			}
		}

		System.out.println(result + "分");
	}
}

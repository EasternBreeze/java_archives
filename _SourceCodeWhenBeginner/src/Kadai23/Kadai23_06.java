package Kadai23;

import java.util.ArrayList;
import java.util.List;

public class Kadai23_06 {

	public static void main(String[] args) {
		List<Integer> score = new ArrayList<>();
		score.add(60);
		score.add(40);
		score.add(90);
		score.add(10);
		score.add(40);
		score.add(30);
		score.add(70);

		int total = 0;
		int max = score.get(0);
		int min = score.get(0);

		for (int n : score) {
			total += n;
			max = n > max ? n : max;
			min = n < min ? n : min;
		}

		double avg = 1.0 * total / score.size();

		System.out.println("受験人数 " + score.size());
		System.out.println("合計点数 " + total);
		System.out.println("平均点数 " + avg);
		System.out.println("最高点数 " + max);
		System.out.println("最低点数 " + min);
	}

}

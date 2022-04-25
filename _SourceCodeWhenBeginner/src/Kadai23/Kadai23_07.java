package Kadai23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kadai23_07 {

	public static void main(String[] args) {
		List<Integer> score = new ArrayList<>();
		score.add(60);
		score.add(40);
		score.add(90);
		score.add(10);
		score.add(40);
		score.add(30);
		score.add(70);

		Collections.sort(score);

		score.forEach(n -> System.out.println(n + "点"));

	}

}

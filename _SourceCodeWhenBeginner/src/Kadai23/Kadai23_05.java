package Kadai23;

import java.util.ArrayList;
import java.util.List;

public class Kadai23_05 {

	public static void main(String[] args) {
		List<Integer> score = new ArrayList<>();
		score.add(60);
		score.add(40);
		score.add(90);
		score.add(10);
		score.add(40);
		score.add(30);
		score.add(70);

		for (int i = score.size() - 1; i >= 0; i--) {
			System.out.println(score.get(i) + "点");
		}
	}

}

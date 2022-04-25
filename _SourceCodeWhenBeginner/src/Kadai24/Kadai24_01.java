package Kadai24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kadai24_01 {

	public static void main(String[] args) {
		List<Integer> card = new ArrayList<>(Arrays.asList(4, 2, 1, 5, 7, 1, 8));

		for (int i = 0; i < 100; i++) {
			if (card.get(0) % 2 == 0) {
				for (int j = 0; j < card.size(); j++) {
					card.set(j, card.get(j) + 1);
				}
			} else {
				card.add(card.remove(0));
			}
		}

		System.out.println(card.get(0));
	}

}

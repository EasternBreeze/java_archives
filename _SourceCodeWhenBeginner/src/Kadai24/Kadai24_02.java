package Kadai24;

import java.util.ArrayList;
import java.util.List;

public class Kadai24_02 {

	public static void main(String[] args) {
		List<Integer> card = new ArrayList<>();
		for (int i = 1; i <= 200; i++) {
			card.add(i);
		}

		while (card.size() > 1) {
			card.add(card.remove(0));
			card.remove(0);
		}

		System.out.println(card.get(0));
	}

}

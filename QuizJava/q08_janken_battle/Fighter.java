package q08_janken_battle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class Fighter {

	private final List<Hand> rotation;
	private int winCount;

	Fighter(Hand... hands) {
		rotation = new ArrayList<>(Arrays.asList(hands));
	}

	Hand nextHand() {
		Hand next = rotation.remove(0);
		rotation.add(next);
		return next;
	}

	void addWinCount() {
		winCount++;
	}

	int winCount() {
		return winCount;
	}
}

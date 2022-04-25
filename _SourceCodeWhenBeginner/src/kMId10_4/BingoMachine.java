package kMId10_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BingoMachine {

	private final List<Integer> numbers = new ArrayList<>();

	BingoMachine() {
		// ===== ここから
		for (int i = 1; i <= 75; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		// ===== ここまで
	}

	public boolean hasNext() {
		// ===== ここから
		return numbers.size() > 1;
		// ===== ここまで
	}

	public int next() {
		// ===== ここから
		return numbers.remove(0);
		// ===== ここまで
	}

}

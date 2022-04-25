package kMid06;

import java.util.ArrayList;
import java.util.List;

public class Kmid06_4 {

	// ===== ここから
	enum Janken {
		G, C, P
	}
	// ===== ここまで

	public static void main(String[] args) {
		List<Janken> history = new ArrayList<>();
		history.add(Janken.G);
		history.add(Janken.C);
		history.add(Janken.P);
		history.add(Janken.G);
		history.add(Janken.C);

		for (int i = 5; i < 20; i++) {
			history.add(nextHand(history));
			history.remove(0);
		}

		String[] table = { "グー", "チョキ", "パー" };
		System.out.println(table[history.get(4).ordinal()]);
	}

	static Janken nextHand(List<Janken> history) {
		// グー・チョキ・パーを出した回数を集計
		int[] count = { 0, 0, 0 };
		for (Janken hand : history) {
			count[hand.ordinal()]++;
		}

		// ===== ここから
		if (count[0] >= 3) {
			return Janken.P;
		} else if (count[1] >= 3) {
			return Janken.G;
		} else if (count[2] >= 3) {
			return Janken.C;
		} else {
			return history.get(4);
		}
		// ===== ここまで
	}

}

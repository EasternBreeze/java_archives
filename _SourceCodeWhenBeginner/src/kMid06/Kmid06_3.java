package kMid06;

import java.util.ArrayList;
import java.util.List;

public class Kmid06_3 {

	static final int G = 0; // グー
	static final int C = 1; // チョキ
	static final int P = 2; // パー

	public static void main(String[] args) {
		List<Integer> history = new ArrayList<>();
		history.add(G);
		history.add(C);
		history.add(P);
		history.add(G);
		history.add(C);

		for (int i = 5; i < 20; i++) {
			history.add(nextHand(history));
			history.remove(0);
		}

		String[] table = { "グー", "チョキ", "パー" };
		System.out.println(table[history.get(4)]);
	}

	static int nextHand(List<Integer> history) {
		// グー・チョキ・パーを出した回数を集計
		int[] count = { 0, 0, 0 };
		for (int hand : history) {
			count[hand]++;
		}

		// ===== ここから
		if (count[0] >= 3) {
			return P;
		} else if (count[1] >= 3) {
			return G;
		} else if (count[2] >= 3) {
			return C;
		} else {
			return history.get(4);
		}
		// ===== ここまで

	}

}

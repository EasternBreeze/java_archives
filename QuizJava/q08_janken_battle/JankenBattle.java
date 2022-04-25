package q08_janken_battle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Hand {
	G, C, P
}

public final class JankenBattle {

	public static void main(String[] args) {
		final Fighter a = //
				new Fighter(Hand.G, Hand.C, Hand.P);
		final Fighter b = //
				new Fighter(Hand.C, Hand.C, Hand.G, Hand.P, Hand.P);
		final Fighter c = //
				new Fighter(Hand.P, Hand.C, Hand.G, Hand.P, Hand.G, Hand.P, Hand.G);

		competition(a, b, c);

		System.out.println("A " + a.winCount());
		System.out.println("B " + b.winCount());
		System.out.println("C " + c.winCount());
	}

	private static void competition(Fighter... entry) {
		List<Fighter> fighters = new ArrayList<>(Arrays.asList(entry));

		// 誰かが20回勝つまでやる
		while (fighters.stream().allMatch(f -> f.winCount() < 20)) {
			if (isContinuedWin(fighters.get(0), fighters.get(1))) {
				fighters.get(0).addWinCount();
				fighters.add(fighters.remove(1));
			} else {
				fighters.get(1).addWinCount();
				fighters.add(fighters.remove(0));
			}
		}
	}

	// f1が勝てばtrue
	private static boolean isContinuedWin(Fighter f1, Fighter f2) {
		Hand h1 = f1.nextHand();
		Hand h2 = f2.nextHand();

		// 引き分けだったら再戦
		while (h1.equals(h2)) {
			h1 = f1.nextHand();
			h2 = f2.nextHand();
		}

		// いつものじゃんけん勝敗判定式
		return (h1.ordinal() - h2.ordinal() + 3) % 3 == 2;
	}

}

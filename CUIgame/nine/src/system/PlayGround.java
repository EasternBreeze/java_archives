package system;

import system.Player.Info;

public final class PlayGround {

	private final Player p1;
	private final Player p2;

	public static PlayGround newInstance(Player p1, Player p2) {
		if (p1 == null || p2 == null) {
			throw new IllegalArgumentException();
		}
		return new PlayGround(p1, p2);
	}

	private PlayGround(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public int gameStart() {
		p1.init();
		p2.init();

		for (int i = 0; i < 9; i++) {
			System.out.println("\n ===== Turn " + (i + 1) + " / 9 =====");
			chooseCard();
		}

		System.out.println("\n *===* Game *===*");
		System.out.println(p1.getName() + " " + p1.getPoint() + "pt");
		System.out.println(p2.getName() + " " + p2.getPoint() + "pt");

		if (p1.getPoint() > p2.getPoint()) {
			System.out.println(p1.getName() + " Win!!");
			return 1;
		} else if (p1.getPoint() < p2.getPoint()) {
			System.out.println(p2.getName() + " Win!!");
			return 2;
		} else {
			System.out.println("Draw");
			return 0;
		}
	}

	private void chooseCard() {
		System.out.println(p1.getName() + ":" + p1);
		System.out.println(p2.getName() + ":" + p2);

		Info p1Info = p1.getInfo();
		Info p2Info = p2.getInfo();

		int c1 = p1.choose(p1Info, p2Info);
		int c2 = p2.choose(p2Info, p1Info);

		System.out.println(p1.getName() + " [" + c1 + "] vs [" + c2 + "] " + p2.getName());
		if (c1 > c2 || c1 == 1 && c2 == 9) {
			System.out.println(p1.getName() + " +1pt");
			p1.addPoint();
		} else if (c1 < c2 || c1 == 9 && c2 == 1) {
			System.out.println(p2.getName() + " +1pt");
			p2.addPoint();
		} else {
			System.out.println("Draw");
		}
	}

}

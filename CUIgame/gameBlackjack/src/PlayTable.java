public class PlayTable {

	void blackjack() {
		Deck d = new Deck();
		d.deckShuffle();

		Player you = new Player();
		Player dealer = new Player();

		for (int i = 1; i <= 5; i++) {
			System.out.println("\n\n\n\n\n ===Game " + i + "===");
			you.betChip();

			you.hitOrStand(d, true);
			dealer.hitOrStand(d, true);
			you.hitOrStand(d, true);
			dealer.hitOrStand(d, true);

			System.out.println("\nYOU \t" + you.showHandCard() + "\nDEALER\t" + dealer.showUpCards());

			while (you.hitOrStand(d, false)) {
				System.out.println("\n= = = = =");
				if (you.getHandSum() > 21) {
					break;
				}
				System.out.println("YOU \t" + you.showHandCard() + "\nDEALER\t" + dealer.showUpCards());
			}

			if (you.getHandSum() <= 21) {
				dealer.dealerDraw(d);
			}

			System.out.println("\n= = = = =");
			System.out.println("YOU \t" + you.showHandCard() + "\nDEALER\t" + dealer.showHandCard());

			if (you.getHandSum() > 21 || you.getHandSum() < dealer.getHandSum() && dealer.getHandSum() <= 21) {
				System.out.println("You lose...");
				you.winChip(0.0);
			} else if (dealer.getHandSum() > 21 || you.getHandSum() > dealer.getHandSum()) {
				System.out.println("You win!!");
				if (you.getHandSum() == 21) {
					you.winChip(2.5);
				} else {
					you.winChip(2.0);
				}
			} else {
				System.out.println("Draw");
				you.winChip(1.0);
			}

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			you.handClear();
			dealer.handClear();
		}
	}

}

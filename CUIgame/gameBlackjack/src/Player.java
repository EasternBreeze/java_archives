import java.util.Scanner;

public class Player {

	private int chip;
	private int bet;

	private final Hand h;
	private int sum;

	Player() {
		h = new Hand();
		chip = 100;
	}

	int getHandSum() {
		return this.sum;
	}

	String getHandCard() {
		String s = "";
		for (Card c : this.h.hand) {
			s += c;
		}
		return s;
	}

	String showHandCard() {
		String s = getHandSum() + " = ";
		for (Card c : h.hand) {
			s += c;
		}
		return s;
	}

	String showUpCards() {
		return "?? = " + h.hand.get(0) + "[??]";
	}

	void betChip() {
		System.out.println("Let's Bet!");
		System.out.print("Chips:" + this.chip + " -> ");

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();
		this.bet = input > 0 ? (input < this.chip ? input : this.chip) : 1;
		this.chip -= this.bet;

		System.out.println("Bet:" + this.bet);

	}

	boolean hitOrStand(Deck d, boolean start) {
		if (start) {
			drawAndCalc(d);
			return true;
		}

		boolean isDraw = false;

		System.out.println("Hit or Stand?");
		System.out.print("Entry H / S -> ");

		Scanner scan = new Scanner(System.in);

		while (true) {
			String input = scan.next();
			if (input.equals("H") || input.equals("h")) {
				drawAndCalc(d);
				isDraw = true;
				break;
			} else if (input.equals("S") || input.equals("s")) {
				break;
			}

			System.out.print("Entry H / S -> ");
		}

		return isDraw;
	}

	void dealerDraw(Deck d) {
		while (getHandSum() <= 17) {
			drawAndCalc(d);
		}
	}

	void winChip(double mul) {
		int n = (int) (mul * 10);
		int getChip = this.bet * n / 10;
		this.chip += getChip;

		System.out.println("You get " + getChip + "chips (Total:" + this.chip + ")");
	}

	void handClear() {
		h.clear();
	}

	private void drawAndCalc(Deck d) {
		h.drawCard(d);

		int sum = 0;
		int ace = 0;
		for (Card c : this.h.hand) {
			switch (c.getNum()) {
			case 1:
				ace++;
				break;
			case 11:
			case 12:
			case 13:
				sum += 10;
				break;
			default:
				sum += c.getNum();
				break;
			}
		}
		while (ace > 0) {
			sum += ace == 1 && sum + 11 <= 21 ? 11 : 1;
		}
		this.sum = sum;
	}

}

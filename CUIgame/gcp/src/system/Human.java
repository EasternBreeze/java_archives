package system;

import java.util.Scanner;

public final class Human extends Player {

	private final Scanner sc = new Scanner(System.in);

	public Human(String name) {
		super(name);
	}

	@Override
	protected Card inputCard(Info my, Info enemy) {
		while (true) {
			try {
				System.out.print(getName() + ":Enter G, C, P. >> ");
				String s = sc.nextLine().toUpperCase();
				for (Card c : Card.values()) {
					if (c.getHand().equals(s)) {
						return c;
					}
				}
			} catch (Exception e) {
				System.out.println(" Enter a card from G, C, P.");
				sc.next();
			}
		}
	}

}

package system;

import java.util.Scanner;

public final class Human extends Player {

	private final Scanner sc = new Scanner(System.in);

	public Human(String name) {
		super(name);
	}

	@Override
	protected int inputNumber(Info my, Info enemy) {
		while (true) {
			try {
				System.out.print(getName() + ":Choose Number >> ");
				return sc.nextInt();
			} catch (Exception e) {
				System.out.println("Enter a number.");
				sc.next();
			}
		}
	}

}

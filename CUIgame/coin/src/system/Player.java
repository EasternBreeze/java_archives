package system;

import java.util.Scanner;

import system.PlayGround.Line;

public final class Player {
	private final Scanner sc = new Scanner(System.in);

	Line selectLine() {
		while (true) {
			try {
				System.out.print(":Enter U or L. >> ");
				String s = sc.nextLine().toUpperCase();

				if (s.equals("U")) {
					return Line.UPPER;
				} else if (s.equals("L")) {
					return Line.LOWER;
				}
			} catch (Exception e) {
				sc.next();
			}
		}
	}

	int inputDirection() {
		while (true) {
			try {
				System.out.print(":Enter number. >> ");
				return sc.nextInt();
			} catch (Exception e) {
				sc.next();
			}
		}
	}
}

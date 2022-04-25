package gcp;

import system.Cpu;
import system.Human;
import system.PlayGround;
import system.Player;

public class Main {

	public static void main(String[] args) {
		final Player p1 = new Human("YOU");
		final Player p2 = new Cpu("CPU");

		for (int i = 0; i < 3; i++) {
			System.out.println("\n *===* Round " + (i + 1) + " *===*");
			PlayGround.newInstance(p1, p2).gameStart();
		}

	}

}

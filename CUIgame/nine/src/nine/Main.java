package nine;

import system.AiHuman;
import system.Cpu;
import system.PlayGround;
import system.Player;

public class Main {

	public static void main(String[] args) {
		final int[] c = new int[3];
		final Player p1 = new AiHuman("P1");
		final Player p2 = new Cpu("P2");

		for (int i = 0; i < 10000; i++) {
			System.out.println("\n *===* Round " + (i + 1) + " *===*");
			c[PlayGround.newInstance(p1, p2).gameStart()]++;
		}

		System.out.println("\nP1 " + c[1] + " vs " + c[2] + " P2");
		System.out.println("Draw " + c[0]);
	}

}

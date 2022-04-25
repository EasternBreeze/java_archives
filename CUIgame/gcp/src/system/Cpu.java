package system;

import java.util.Random;

public final class Cpu extends Player {

	private final Random rand = new Random();

	public Cpu(String name) {
		super(name);
	}

	@Override
	protected Card inputCard(Info my, Info enemy) {
		return my.stock.get(rand.nextInt(my.stock.size()));
	}

}

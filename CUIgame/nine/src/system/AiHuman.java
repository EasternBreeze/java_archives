package system;

public final class AiHuman extends Player {

	public AiHuman(String name) {
		super(name);
	}

	@Override
	protected int inputNumber(Info my, Info enemy) {
		if (my.last == 0) {
			return 9;
		}
		if (my.stock.size() <= 2) {
			return my.stock.get(my.stock.size() - 1);
		}
		if (my.stock.contains(Integer.valueOf(enemy.last))) {
			return enemy.last;
		}

		return my.stock.get(my.stock.size() / 2);
	}

}

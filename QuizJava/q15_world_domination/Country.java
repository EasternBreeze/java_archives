package q15_world_domination;

final class Country {

	private final String name;

	private int power;
	private boolean isDefeat;

	Country(String name, int power) {
		this.name = name;
		this.power = power;
		update();
	}

	void damage() {
		power--;
	}

	void update() {
		isDefeat = power <= 0;
	}

	boolean isDefeat() {
		return isDefeat;
	}

	@Override
	public String toString() {
		return String.format("%s(%d) ", isDefeat ? "A国" : name, power);
	}
}

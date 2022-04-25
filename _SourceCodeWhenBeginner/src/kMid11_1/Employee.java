package kMid11_1;

public final class Employee {

	private final String id;
	private final String name;
	private final String[] bossesId;

	public Employee(String id, String name, String... bossesId) {
		// ===== ここから
		this.id = id;
		this.name = name;
		this.bossesId = bossesId;
		// ===== ここまで
	}

	// ===== ここから
	@Override
	public String toString() {
		String s = id + " " + name + "  [";
		for (int i = 0; i < bossesId.length; i++) {
			s += bossesId[i];
			s += bossesId.length - i > 1 ? "," : "";
		}
		s += "]";
		return s;
	}
	// ===== ここまで
}

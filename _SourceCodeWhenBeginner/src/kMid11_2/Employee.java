package kMid11_2;

public final class Employee {

	private final String id;
	private final String name;
	private final String[] bossesId;

	// ===== ここから
	public Employee(String id, String name, String... bossesId) {
		this.id = id;
		this.name = name;
		this.bossesId = bossesId;
	}
	// ===== ここまで

	public String id() {
		return id;
	}

	public String name() {
		return name;
	}

	public String bossesId() {
		return String.join(",", bossesId);
	}
}
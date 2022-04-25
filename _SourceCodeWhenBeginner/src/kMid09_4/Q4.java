package kMid09_4;

public class Q4 {
	public static void main(String[] args) {
		ScoreManager sm = new ScoreManager();
		String[] names = { "野比", "骨川", "剛田", "出木杉" };

		sm.add(names[0], Subject.JAVA, 25);
		sm.add(names[0], Subject.DB, 45);
		sm.add(names[0], Subject.NETWORK, 55);
		sm.add(names[0], Subject.WEB, 40);

		sm.add(names[1], Subject.JAVA, 70);
		sm.add(names[1], Subject.DB, 60);
		sm.add(names[1], Subject.NETWORK, 85);
		sm.add(names[1], Subject.WEB, 70);

		sm.add(names[2], Subject.JAVA, 65);
		sm.add(names[2], Subject.DB, 35);
		sm.add(names[2], Subject.NETWORK, 70);
		sm.add(names[2], Subject.WEB, 95);

		sm.add(names[3], Subject.JAVA, 75);
		sm.add(names[3], Subject.DB, 80);
		sm.add(names[3], Subject.NETWORK, 100);
		sm.add(names[3], Subject.WEB, 95);

		for (String name : names) {
			for (Subject subject : Subject.values()) {
				// ===== ここから
				System.out.println(name + " " + subject + " " + sm.get(name, subject));
				// ===== ここまで
			}
		}
	}
}
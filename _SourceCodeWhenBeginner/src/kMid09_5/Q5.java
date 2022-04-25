package kMid09_5;

public class Q5 {
	public static void main(String[] args) {
		ScoreManager sm = new ScoreManager();

		sm.add("野比", 25, 45, 55, 40);
		sm.add("骨川", 70, 60, 85, 70);
		sm.add("剛田", 65, 35, 70, 95);
		sm.add("出木杉", 75, 80, 100, 95);

		System.out.println("[1.野比 2.骨川 3.剛田 4.出木杉]");
		System.out.println("1: " + toString(sm.get("野比")));
		System.out.println("2: " + toString(sm.get("骨川")));
		System.out.println("3: " + toString(sm.get("剛田")));
		System.out.println("4: " + toString(sm.get("出木杉")));
		System.out.println();
		System.out.println("[1.JAVA 2.DB 3.NETWORK 4.WEB]");
		System.out.println("1: " + toString(sm.get(Subject.JAVA)));
		System.out.println("2: " + toString(sm.get(Subject.DB)));
		System.out.println("3: " + toString(sm.get(Subject.NETWORK)));
		System.out.println("4: " + toString(sm.get(Subject.WEB)));

	}

	static String toString(Result r) {
		String f = "平均=%.2f 最低=%d 最高=%d";
		return String.format(f, r.average(), r.min(), r.max());
	}
}
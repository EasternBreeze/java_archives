package kMid09_6;

import kMid09_6.Scores.Subject;

public class Q6 {

	public static void main(String[] args) {
		Scores scores = new Scores();
		String[] names = { "野比", "骨川", "剛田", "出木杉" };
		scores.add(names[0], 25, 45, 55, 40);
		scores.add(names[1], 70, 60, 85, 70);
		scores.add(names[2], 65, 35, 70, 95);
		scores.add(names[3], 75, 80, 100, 95);

		// ===== ここから
		System.out.println("野比の平均点：" + scores.filter("野比").average());
		System.out.println("骨川の最低点：" + scores.filter("骨川").min());
		System.out.println("剛田の最高点：" + scores.filter("剛田").max());
		System.out.println("出木杉のDB：" + scores.filter("出木杉").filter(Subject.DB).get());
		System.out.println("JAVAの平均点：" + scores.filter(Subject.JAVA).average());
		System.out.println("DBの最低点：" + scores.filter(Subject.DB).min());
		System.out.println("NETWORKの最高点：" + scores.filter(Subject.NETWORK).max());
		System.out.println("全教科中での平均点：" + scores.average());
		System.out.println("全教科中での最低点：" + scores.min());
		System.out.println("全教科中での最高点：" + scores.max());
		// ===== ここまで
	}
}
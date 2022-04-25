package kMid11_3;

import java.util.Set;

public class Q3 {
	public static void main(String[] args) {
		Employees employees = new Employees();
		employees.add("D01", "藤子不二雄");
		employees.add("D02", "ドラえもん", "D01");
		employees.add("D03", "のび太", "D01", "D02");
		employees.add("D04", "しずか", "D02", "D03");
		employees.add("D05", "スネ夫", "D06");
		employees.add("D06", "ジャイアン", "D01");
		employees.add("D07", "出木杉", "D04");
		employees.add("D08", "ジャイ子", "D06");
		employees.add("D09", "ドラミ", "D02");
		employees.add("D10", "セワシ", "D02", "D03", "D09");
		employees.add("D11", "スネツグ", "D05");

		for (Employee e : employees) {
			System.out.println("＜" + e.name() + "＞");
			System.out.println(" 直属の上司：" + str(e.bosses()));
			System.out.println(" 直属の部下：" + str(e.subordinates()));
		}
	}

	static String str(Set<Employee> set) {
		String s = "";
		for (Employee e : set) {
			s += e.name() + " ";
		}
		return s;
	}
}

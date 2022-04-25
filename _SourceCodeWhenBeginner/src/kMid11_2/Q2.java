package kMid11_2;

public class Q2 {

	public static void main(String[] args) {

		Employees employees = new Employees();
		employees.add(new Employee("D01", "藤子不二雄"));
		employees.add(new Employee("D02", "ドラえもん", "D01"));
		employees.add(new Employee("D03", "のび太", "D01", "D02"));
		employees.add(new Employee("D04", "しずか", "D02", "D03"));
		employees.add(new Employee("D05", "スネ夫", "D06"));
		employees.add(new Employee("D06", "ジャイアン", "D01"));
		employees.add(new Employee("D07", "出木杉", "D04"));
		employees.add(new Employee("D08", "ジャイ子", "D06"));
		employees.add(new Employee("D09", "ドラミ", "D02"));
		employees.add(new Employee("D10", "セワシ", "D02", "D03", "D09"));
		employees.add(new Employee("D11", "スネツグ", "D05"));

		System.out.println(str(employees.get("D01")));
		System.out.println(str(employees.get("D02")));
		System.out.println(str(employees.get("D03")));
		System.out.println(str(employees.get("D04")));
		System.out.println(str(employees.get("D05")));
		System.out.println(str(employees.get("D06")));
		System.out.println(str(employees.get("D07")));
		System.out.println(str(employees.get("D08")));
		System.out.println(str(employees.get("D09")));
		System.out.println(str(employees.get("D10")));
		System.out.println(str(employees.get("D11")));
	}

	static String str(Employee e) {
		return String.format("%s %s [%s]", e.id(), e.name(), e.bossesId());
	}
}
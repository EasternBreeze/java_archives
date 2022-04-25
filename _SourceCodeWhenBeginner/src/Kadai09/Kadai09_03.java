package Kadai09;

public class Kadai09_03 {

	enum Day {
		SUN, MON, TUE, WED, THU, FRI, SAT,
	}

	public static void main(String[] args) {
		for (Day d : Day.values()) {
			System.out.println(d);
		}
	}

}

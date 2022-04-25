package Kadai08;

public class Kadai08_05 {

	public static void main(String[] args) {
		int year = 1896;

		for (int i = 1; i <= 15; i++) {
			if (i != 6 && i != 12 && i != 13) {
				System.out.println("第" + i + "回 " + year + "年");
			}
			year += 4;
		}

	}

}

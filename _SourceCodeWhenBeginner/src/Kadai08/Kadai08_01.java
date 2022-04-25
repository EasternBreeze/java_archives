package Kadai08;

public class Kadai08_01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			String s = i + "月は";

			switch (i) {
			case 2:
				s += "28日あります";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				s += "30日あります";
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				s += "31日あります";
				break;
			}

			System.out.println(s);
		}

	}

}

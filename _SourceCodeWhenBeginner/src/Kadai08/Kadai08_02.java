package Kadai08;

public class Kadai08_02 {

	public static void main(String[] args) {
		for (int i = 1996; i <= 2004; i++) {
			String s = "西暦" + i + "年";

			switch (i) {
			case 1999:
				s += "(世紀末)";
				break;
			case 2000:
				s += "(ミレニアム)";
				break;
			case 2001:
				s += "(21世紀)";
				break;
			}

			System.out.println(s);
		}

	}

}

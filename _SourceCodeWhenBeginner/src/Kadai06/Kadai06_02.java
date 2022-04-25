package Kadai06;

public class Kadai06_02 {

	public static void main(String[] args) {
		for (int i = 1996; i <= 2004; i++) {
			String str = "西暦" + i + "年";

			if (i == 1999) {
				str += "(世紀末)";
			} else if (i == 2000) {
				str += "(ミレニアム)";
			} else if (i == 2001) {
				str += "(21世紀)";
			}

			System.out.println(str);
		}

	}

}

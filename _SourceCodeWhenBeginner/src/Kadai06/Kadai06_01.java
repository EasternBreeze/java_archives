package Kadai06;

public class Kadai06_01 {

	public static void main(String[] args) {
		for (int i = 1996; i <= 2004; i++) {
			String str = "西暦" + i + "年";

			if (i == 2000) {
				str += "(ミレニアム)";
			}

			System.out.println(str);
		}

	}

}

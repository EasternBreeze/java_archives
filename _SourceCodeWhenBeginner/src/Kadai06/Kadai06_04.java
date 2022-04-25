package Kadai06;

public class Kadai06_04 {

	public static void main(String[] args) {
		for (int i = 1996; i <= 2004; i++) {
			String str = "西暦" + i + "年";

			if (i % 4 == 0) {
				str += "(夏季五輪)";
			}

			System.out.println(str);
		}

	}

}

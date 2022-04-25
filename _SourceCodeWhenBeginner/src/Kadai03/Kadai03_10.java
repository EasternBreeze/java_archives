package Kadai03;

public class Kadai03_10 {

	public static void main(String[] args) {
		int base = 100;
		int ans = 0;

		for (int i = 1; i <= 5; i++) {
			ans = base - 7;
			System.out.println(base + "から7を引くと" + ans);
			base = ans;
		}

	}

}

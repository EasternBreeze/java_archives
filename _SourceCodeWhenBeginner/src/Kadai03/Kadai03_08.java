package Kadai03;

public class Kadai03_08 {

	public static void main(String[] args) {
		int base = 100;
		int ans = 0;

		for (int i = 1; i <= 5; i++) {
			ans = base + i;
			System.out.println(base + "に" + i + "を足すと" + ans);
			base = ans;

		}

	}

}

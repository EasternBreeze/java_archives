package Kadai03;

public class Kadai03_09 {

	public static void main(String[] args) {
		int base = 1;
		int ans = 0;

		for (int i = 1; i <= 5; i++) {
			ans = base * 2;
			System.out.println(base + "を2倍すると" + ans);
			base = ans;
		}

	}

}

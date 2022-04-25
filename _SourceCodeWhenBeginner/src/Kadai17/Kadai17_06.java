package Kadai17;

public class Kadai17_06 {

	public static void main(String[] args) {
		kaijo(6); // max:12 ※13!＝62億くらい
	}

	private static void kaijo(int n) {
		if (n < 0) {
			return;
		}

		int ans = 1; // 0! = 1
		for (int i = 1; i <= n; i++) {
			ans *= i;
		}
		
		System.out.println(ans);
	}

}

package Kadai05;

public class Kadai05_02 {

	public static void main(String[] args) {
		int ans = 0;

		for (int i = 1; i <= 100; i++) {
			ans += i;
			//System.out.println(ans + " Loop" + i);
		}

		System.out.println(ans / 100.0);
	}

}

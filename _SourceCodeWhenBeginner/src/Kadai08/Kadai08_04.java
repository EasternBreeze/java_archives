package Kadai08;

public class Kadai08_04 {

	public static void main(String[] args) {
		int a = 0; // 7の倍数(個)
		int b = 0; // 37の倍数(個)

		for (int i = 100; i <= 999; i++) {
			if (i % 7 == 0) {
				a++;
			}
		}

		for (int i = 1000; i <= 9999; i++) {
			if (i % 37 == 0) {
				b++;
			}
		}

		System.out.println(b - a);
	}

}

package Kadai05;

public class Kadai05_06 {

	public static void main(String[] args) {
		int count = 0;

		for (int i = 1; i <= 100; i++) {
			if (100 % i == 0) {
				count++;
			}
		}

		System.out.println(count);
	}

}

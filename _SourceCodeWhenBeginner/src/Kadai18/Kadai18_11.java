package Kadai18;

import java.util.Random;

public class Kadai18_11 {

	static Random rand = new Random();

	public static void main(String[] args) {
		//		for (int i = 0; i < 100; i++) {
		//			int n = getRandom(-10, 10);
		//			System.out.println(n);
		//		}
		int n = getRandom(-10, 10);
		System.out.println(n);
	}

	private static int getRandom(int min, int max) {
		if (min > max) {
			return 0;
		}
		return rand.nextInt(max - min + 1) + min;
	}

}

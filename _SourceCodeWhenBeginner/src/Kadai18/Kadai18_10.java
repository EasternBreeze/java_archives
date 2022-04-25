package Kadai18;

import java.util.Random;

public class Kadai18_10 {

	static Random rand = new Random();

	public static void main(String[] args) {
		int n = getRandom();
		System.out.println(n);

	}

	private static int getRandom() {
		return rand.nextInt(6) + 1;
	}

}

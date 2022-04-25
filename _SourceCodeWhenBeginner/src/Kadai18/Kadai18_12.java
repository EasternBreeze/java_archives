package Kadai18;

import java.util.Random;

public class Kadai18_12 {

	static Random rand = new Random();

	public static void main(String[] args) {
		double d = getRandom();
		System.out.println(d);
	}

	private static double getRandom() {
		return rand.nextDouble();
	}

}

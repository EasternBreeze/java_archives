package Kadai18;

import java.util.Random;

public class Kadai18_13 {

	static Random rand = new Random();

	public static void main(String[] args) {
		double d = getRandom(20);
		System.out.println(d);
	}

	private static double getRandom(double max) {
		return rand.nextDouble() * max;
	}

}

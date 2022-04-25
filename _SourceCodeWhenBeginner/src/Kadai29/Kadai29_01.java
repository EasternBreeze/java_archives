package Kadai29;

import java.util.Random;

public class Kadai29_01 {

	static Random rand = new Random();

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 1000000; i++) {
			if (theater(rand.nextInt(100))) {
				count++;
			}
		}

		System.out.println(1.0 * count / 1000000);
	}

	private static boolean theater(int first) {
		int[] seat = new int[100];
		//		for (int i = 0; i < seat.length; i++) {
		//			seat[i] = 0;
		//		}

		seat[first] = 1;

		for (int i = 2; i <= 99; i++) {
			if (seat[i - 1] == 0) {
				seat[i - 1] = i;
			} else {
				while (true) {
					int n = rand.nextInt(100);
					if (seat[n] != 0) {
						continue;
					}
					seat[n] = i;
					break;
				}
			}
		}

		if (seat[99] != 0) {
			return false;
		}
		return true;
	}

}

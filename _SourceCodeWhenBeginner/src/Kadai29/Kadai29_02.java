package Kadai29;

import java.util.Random;

public class Kadai29_02 {

	static Random rand = new Random();

	public static void main(String[] args) {
		int male = 0;
		int female = 0;

		for (int i = 0; i < 1000; i++) {
			female += family();
			male += 2; // 必ず男が産まれるので1+父がいるので+1
		}

		double persent = 1.0 * male / female;
		System.out.println(persent + " (" + male + "/" + female + ")");
		System.out.printf("男:女 = %.4f:%.4f", (1.0 * male / female), (1.0 * female / male));
	}

	private static int family() {
		int female = 1; // 母がいるので1スタート
		while (rand.nextInt(2) == 0) {
			female++;
		}
		return female;
	}

}

package Kadai09;

public class Kadai09_07 {

	public static void main(String[] args) {
		// car   + tricycle   + bike   = 14
		// car*4 + tricycle*3 + bike*2 = 39

		boolean isFound = false;

		for (int i = 0; i <= 14; i++) {
			int tricycle = i;
			for (int j = 0; j <= 14 - i; j++) {
				int car = j;
				int bike = 14 - (car + tricycle);
				if (car * 4 + tricycle * 3 + bike * 2 == 39) {
					String s = "自動車 %d台\n三輪車 %d台\nバイク %d台";
					System.out.println(String.format(s, car, tricycle, bike));
					isFound = true;
					break;
				}
			}
			if (isFound) {
				break;
			}
		}

	}

}

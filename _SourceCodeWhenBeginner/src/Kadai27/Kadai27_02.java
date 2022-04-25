package Kadai27;

public class Kadai27_02 {

	public static void main(String[] args) {
		int num = 0;
		int roomCount = 0; // 0 ~ 500

		while (roomCount < 500) {
			num++;

			if (check49(num)) {
				roomCount++;
			}
		}

		System.out.println(num + "号室");
	}

	private static boolean check49(int num) {
		while (num > 0) {
			int digit = num % 10;
			if (digit == 4 || digit == 9) {
				return false;
			}
			num /= 10;
		}

		return true;
	}

}

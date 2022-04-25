package Kadai09;

public class Kadai09_08 {

	public static void main(String[] args) {

		for (int i = 0; i <= 70; i++) {
			int itemA = i;
			for (int j = 0; j <= 70 - i; j++) {
				int itemB = j;
				int itemC = 70 - (itemA + itemB);
				if (itemA * 98 + itemB * 204 + itemC * 307 == 12515) {
					System.out.println(itemC + "個");
				}
			}
		}

	}

}

package Kadai16;

public class Kadai16_20 {

	public static void main(String[] args) {
		printTaxPrice(1500);
	}

	private static void printTaxPrice(int n) {
		if (n < 0) {
			return;
		}

		int price = (int) (n * 1.08);
		System.out.println(price + "円（税込）");
	}

}

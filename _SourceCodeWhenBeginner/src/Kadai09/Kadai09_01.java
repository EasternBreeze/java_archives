package Kadai09;

public class Kadai09_01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			int count = 0;
			
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
	}

}

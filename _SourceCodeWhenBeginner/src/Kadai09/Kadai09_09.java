package Kadai09;

public class Kadai09_09 {

	public static void main(String[] args) {
		int room = 1;
		int num = 0;

		while (room <= 15) {
			num++;

			switch (num) {
			case 4:
			case 9:
			case 13:
				continue;
			}

			System.out.print(num + " ");
			room++;
		}

		System.out.println();
	}

}

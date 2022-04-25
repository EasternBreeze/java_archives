package Kadai28;

public class Kadai28_05_1 {
	static int posX = 0; // <W(-1) E(+1)>
	static int posY = 0; // <S(-1) N(+1)>

	public static void main(String[] args) {
		int start = 0;
		int count = 0;
		// 6^4
		for (int n1 = 1; n1 <= 6; n1++) {
			for (int n2 = 1; n2 <= 6; n2++) {
				for (int n3 = 1; n3 <= 6; n3++) {
					for (int n4 = 1; n4 <= 6; n4++) {
						diceRoll(n1);
						diceRoll(n2);
						diceRoll(n3);
						diceRoll(n4);
						if (posX == 0 && posY == 0) {
							System.out.print("*");
							start++;
						}
						System.out.println("" + n1 + n2 + n3 + n4);
						posX = 0;
						posY = 0;
						count++;
					}
				}
			}
		}

		System.out.println(start + " / " + count);
		System.out.println(1.0 * start / count);
	}

	private static void diceRoll(int n) {
		switch (n) {
		case 1:
			posX++;
			break;
		case 2:
			posX--;
			break;
		case 3:
			posY--;
			break;
		case 4:
			posY++;
			break;
		case 5:
		case 6:
			break;
		}
		return;
	}

}

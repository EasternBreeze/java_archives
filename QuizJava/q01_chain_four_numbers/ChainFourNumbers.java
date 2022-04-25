package online220127;

public final class ChainFourNumbers {

	public static void main(String[] args) {
		int a = 7;

		while (!((a + 1) % 9 == 0 && //
				(a + 2) % 11 == 0 && //
				(a + 3) % 13 == 0)) {
			a += 7;
		}

		System.out.println(a);
		System.out.println(a + 1);
		System.out.println(a + 2);
		System.out.println(a + 3);
		
		System.out.println((7*9*11*13+6)/2.0);
	}

}

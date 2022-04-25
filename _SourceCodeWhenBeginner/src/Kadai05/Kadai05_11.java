package Kadai05;

public class Kadai05_11 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i % 2 == 1 && j % 2 == 0) {
					System.out.print("●");
				} else if (i % 2 == 0 && j % 2 == 1) {
					System.out.print("●");
				} else {
					System.out.print("○");
				}
			}
			System.out.println();
		}
	}
	//
	//	public static void main(String[] args) {
	//		for (int i = 1; i <= 5; i++) {
	//			for (int j = 1; j <= 10; j++) {
	//				if ((i % 2) + (j % 2) == 1) {
	//					System.out.print("●");
	//				} else {
	//					System.out.print("○");
	//				}
	//			}
	//			System.out.println();
	//		}
	//	}

}

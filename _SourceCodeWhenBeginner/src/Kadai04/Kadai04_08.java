package Kadai04;

public class Kadai04_08 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			String s = "";

			for (int j = 1; j < i; j++) {
				s += "Re:";
			}

			s += "タイトル";
			System.out.println(s);
		}

	}
	//
	//	public static void main(String[] args) {
	//		String s = "タイトル";
	//		for (int i = 1; i <= 5; i++) {
	//			System.out.println(s);
	//			s = "Re:" + s;
	//		}
	//	}

}

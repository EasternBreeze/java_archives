package Kadai04;

public class Kadai04_09 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			String s = "";

			for (int j = 1; j < i; j++) {
				s += "(";
			}

			s += "本文";

			for (int j = 1; j < i; j++) {
				s += ")";
			}

			System.out.println(s);
		}

	}

	//	public static void main(String[] args) {
	//		String s = "本文";
	//		for (int i = 1; i <= 5; i++) {
	//			System.out.println(s);
	//			s = "(" + s + ")";
	//		}
	//	}

}

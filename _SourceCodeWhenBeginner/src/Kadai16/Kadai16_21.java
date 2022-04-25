package Kadai16;

public class Kadai16_21 {

	public static void main(String[] args) {
		boolean b = isAbult(20);
		System.out.println(b);
	}

	private static boolean isAbult(int age) {
		if (age >= 20) {
			return true;
		} else {
			return false;
		}

		//		return n >= 20;
	}

}

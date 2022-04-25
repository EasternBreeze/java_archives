package Kadai16;

public class Kadai16_22 {

	public static void main(String[] args) {
		double d = abs(-23.4);
		System.out.println(d);
	}

	private static double abs(double n) {
		if (n < 0) {
			n *= -1;
		}
		return n;
	}

}

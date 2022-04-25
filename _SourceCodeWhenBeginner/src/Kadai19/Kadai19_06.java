package Kadai19;

public class Kadai19_06 {

	public static void main(String[] args) {
		double d = 42.195;
		System.out.println(decimalRound(d));
	}

	private static int decimalRound(double d) {
		if (d < 0) {
			return 0;
		}

		if (decimalPoint(d) < 0.5) {
			return (int) (d / 1.0);
		} else {
			return (int) (d / 1.0) + 1;
		}
	}

	private static double decimalPoint(double d) {
		return d % 1.0;
	}

}

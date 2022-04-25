package Kadai19;

public class Kadai19_05 {

	public static void main(String[] args) {
		double d = 42.195;
		System.out.println(decimalPoint(d));
	}

	private static double decimalPoint(double d) {
		if (d < 0) {
			return 0.0;
		}
		return d % 1.0;
	}

}

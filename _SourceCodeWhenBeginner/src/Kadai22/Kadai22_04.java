package Kadai22;

public class Kadai22_04 {

	public static void main(String[] args) {
		double a = 1.0;
		double b = 1.0;

		//		a / b == b / ( a + b )
		while (true) {
			double left = a / b;
			double right = b / (a + b);
			double dif = left - right;
			System.out.println(left + " / " + right);
			if (dif < 0.00000001) {
				break;
			}
			b += dif;
		}
		System.out.println(1 + ":" + b);

	}

}

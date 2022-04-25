package Kadai17;

public class Kadai17_09 {

	public static void main(String[] args) {
		double[] d = { 1.5, -2.0, 5.9 };
		showArray(d);
	}

	private static void showArray(double[] nums) {
		for (double num : nums) {
			System.out.println(num * -1);
		}

	}

}

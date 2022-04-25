package Kadai17;

public class Kadai17_01 {

	public static void main(String[] args) {
		double ave = getAverage(3, 1, 4);
		System.out.println(ave);
	}

	private static double getAverage(int n1, int n2, int n3) {
		double ave = (n1 + n2 + n3) / 3.0;
		return ave;
	}

}

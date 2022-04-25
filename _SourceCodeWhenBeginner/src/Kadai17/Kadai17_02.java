package Kadai17;

public class Kadai17_02 {

	public static void main(String[] args) {
		int max = getMax(3, 1);
		System.out.println(max);
	}

	private static int getMax(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}

}
